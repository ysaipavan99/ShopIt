package trial;

import java.applet.*;
import java.awt.*;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.w3c.dom.Node;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class JDBC_excel extends Applet{

	public static void main(String[] args) throws FilloException, ParserConfigurationException, SAXException, IOException {
		
		Fillo fillo = new Fillo();
		com.codoid.products.fillo.Connection connection = fillo.getConnection("C:/Users/user/Documents/ShopIt/ShopIt/Trial.xlsx");
		
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document doc = docBuilder.parse(new File("C:/Users/user/Documents/ShopIt/ShopIt/XMLSet/signup.xml"));
		doc.getDocumentElement().normalize();
		System.out.println("Root element of the document is: "+doc.getDocumentElement().getNodeName());
		NodeList listOfPersons = doc.getElementsByTagName("Details");
		for(int s=0; s<listOfPersons.getLength(); s++){
			Node firstPersonNode = listOfPersons.item(s);
			if(firstPersonNode.getNodeType() == Node.ELEMENT_NODE){
				Element firstPersonElement = (Element)firstPersonNode;
				NodeList mailList = firstPersonElement.getElementsByTagName("Email");
				Element mailElement = (Element)mailList.item(0);
				
				NodeList textFNList = mailElement.getChildNodes();
				String mail=((Node)textFNList.item(0)).getNodeValue().trim();
				
				NodeList passwordList = firstPersonElement.getElementsByTagName("Password");
				Element passwordElement = (Element)passwordList.item(0);
				
				NodeList textLNList = passwordElement.getChildNodes();
				String password=((Node)textLNList.item(0)).getNodeValue().trim();
				
				NodeList nameList = firstPersonElement.getElementsByTagName("Name");
				Element nameElement = (Element)nameList.item(0);
				
				NodeList textNNList = nameElement.getChildNodes();
				String name=((Node)textNNList.item(0)).getNodeValue().trim();
				
				NodeList genderList = firstPersonElement.getElementsByTagName("Gender");
				Element genderElement = (Element)genderList.item(0);
				
				NodeList textGNList = genderElement.getChildNodes();
				String gender=((Node)textGNList.item(0)).getNodeValue().trim();
				
				NodeList mobnumList = firstPersonElement.getElementsByTagName("MobNum");
				Element mobnumElement = (Element)mobnumList.item(0);
				
				NodeList textMNList = mobnumElement.getChildNodes();
				String mobnum=((Node)textMNList.item(0)).getNodeValue().trim();
				
				int i = connection.executeUpdate("insert into Sheet1(Email,Password, Name, Gender, Phone) values('"+mail+"','"+password+"','"+name+"','"+gender+"','"+mobnum+"')");
			}
		}

		connection.close();
		
	}

}
