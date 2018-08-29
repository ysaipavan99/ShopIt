package trial;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.w3c.dom.Node;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class AccessXML {

	public static final String xmlPath = "C:/Users/user/Documents/ShopIt/ShopIt/XMLSet/profile.xml";
	
	public static void main(String[] args) throws FilloException, SAXException, IOException, ParserConfigurationException, TransformerException {


		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document doc = docBuilder.parse(new File("C:/Users/user/Documents/ShopIt/ShopIt/XMLSet/login.xml"));
		doc.getDocumentElement().normalize();
		System.out.println("Root element of the document is: "+doc.getDocumentElement().getNodeName());
		NodeList listOfPersons = doc.getElementsByTagName("Details");
		Node firstPersonNode = listOfPersons.item(0);
		Element firstPersonElement = (Element)firstPersonNode;
		NodeList mailList = firstPersonElement.getElementsByTagName("Email");
		Element mailElement = (Element)mailList.item(0);
		
		NodeList textFNList = mailElement.getChildNodes();
		String mail=((Node)textFNList.item(0)).getNodeValue().trim();
		
		NodeList passwordList = firstPersonElement.getElementsByTagName("Password");
		Element passwordElement = (Element)passwordList.item(0);
		
		NodeList textPNList = passwordElement.getChildNodes();
		String pass=((Node)textPNList.item(0)).getNodeValue().trim();
		
		Fillo fillo = new Fillo();
		com.codoid.products.fillo.Connection connection = fillo.getConnection("C:/Users/user/Documents/ShopIt/ShopIt/Trial.xlsx");
		String strQuery = "Select * from Sheet1 where Email='"+mail+"' and Password='"+pass+"'";
		Recordset recordset = connection.executeQuery(strQuery);
		
		//Creating the new XML file
		DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
		Document document = documentBuilder.newDocument();
		
		//Root element
		Element root = document.createElement("Profile");
		document.appendChild(root);
		
		
		while(recordset.next()){
			System.out.println("Email: "+recordset.getField("Email")+"\nPassword: "+recordset.getField("Password"));
			Element email = document.createElement("Email");
			email.appendChild(document.createTextNode(recordset.getField("Email")));
			root.appendChild(email);
			
			Element password = document.createElement("Password");
			password.appendChild(document.createTextNode(recordset.getField("Password")));
			root.appendChild(password);
			
			Element name = document.createElement("Name");
			name.appendChild(document.createTextNode(recordset.getField("Name")));
			root.appendChild(name);
			
			Element gender = document.createElement("Gender");
			gender.appendChild(document.createTextNode(recordset.getField("Gender")));
			root.appendChild(gender);
			
			Element phone = document.createElement("Phone");
			phone.appendChild(document.createTextNode(recordset.getField("Phone")));
			root.appendChild(phone);
			
		}
		
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource domSource = new DOMSource(document);
		StreamResult streamResult = new StreamResult(new File(xmlPath));
		transformer.transform(domSource,streamResult);
		System.out.println("Done creating XML File");
		
		
		recordset.close();
		connection.close();

	}

}
