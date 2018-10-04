/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
@WebServlet(urlPatterns = {"/login"})
public class login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet login</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet login at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }

    try{
        Class.forName("com.mysql.jdbc.Driver");
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        String url="jdbc:mysql://localhost/ShopIt";
        String user="root";
        String pw="";
        
        Connection con=null;
        
        try{
            con=DriverManager.getConnection(url,user,pw);
            Statement st=con.createStatement();
            System.out.println("con est");
            String email=request.getParameter("email");
            String pass=request.getParameter("pass");
            
            String sql="select * from userDetails where Email='"+email+"' and Password='"+pass+"'";
            
            ResultSet rs=st.executeQuery(sql);
            
            if(!rs.next()){
                System.out.println("user not found");
                out.println("<html><head></head><body onload=\"alert('username or the password is in correct')\"></body></html>");
            }
            else{
                System.out.println(rs.getString(1));
                String name=rs.getString(3);
                String gender=rs.getString(4);
                String mobnum=rs.getString(5);
                
                //Cookies
                Cookie c1 = new Cookie("email",email);
                Cookie c2 = new Cookie("name",URLEncoder.encode( name, "UTF-8" ));
                Cookie c3 = new Cookie("gender",URLEncoder.encode( gender, "UTF-8" ));
                Cookie c4 = new Cookie("mobnum",URLEncoder.encode( mobnum, "UTF-8" ));
                System.out.println(name+gender+mobnum);
                response.addCookie(c1);
                response.addCookie(c2);
                response.addCookie(c3);
                response.addCookie(c4);
                System.out.println("coo cre");
                //response.sendRedirect("http://localhost:8080/ShopIt/Home.jsp");
                
                //JavaBeans
                loginBean lb = new loginBean();
                lb.setEmail(email);
                lb.setGender(gender);
                lb.setMobnum(mobnum);
                lb.setName(name);
                
                /**** Storing Bean In Session ****/
                
                request.getSession().setAttribute("UD", lb);
                RequestDispatcher rd = request.getRequestDispatcher("/Home.jsp");
	        rd.forward(request, response);
                
            }
            
            
            System.out.println("logged in");
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        
        
    }



    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
