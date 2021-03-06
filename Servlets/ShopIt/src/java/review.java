/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
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
import javax.servlet.http.HttpSession;

/**
 *
 * @author HP
 */
@WebServlet(urlPatterns = {"/review"})
public class review extends HttpServlet {

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
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet review</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet review at " + request.getContextPath() + "</h1>");
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
            String sql1="insert into reviewer (EmailID) values(?)";
            String sql2="insert into reviews values(?,?,?,?,?,?,?,?)";
            
            HttpSession session = request.getSession();
        
            Cookie cookies[]= request.getCookies();

            String email=null;

            RequestDispatcher dispatcher = request.getRequestDispatcher("profile.jsp");

            for(Cookie c : cookies){
                if(c.getName().equals("email")){
                    email=c.getValue();
                }
            }
                        
            
            PreparedStatement ps1=con.prepareStatement(sql1,st.RETURN_GENERATED_KEYS);
            ps1.setString(1,email);
            ps1.executeUpdate();
            System.out.println("row inserted in reviewer");
            
            ResultSet rs=ps1.getGeneratedKeys();
            int rid=1;
            
            if(rs.next()){
                rid=rs.getInt(1);
            }
            
            
         
            PreparedStatement ps2=con.prepareStatement(sql2);
            ps2.setInt(1, rid);
            ps2.setString(2,request.getParameter("product"));
            ps2.setString(3,request.getParameter("rate"));
            ps2.setString(4,request.getParameter("title"));
            ps2.setString(5,request.getParameter("pros"));
            ps2.setString(6,request.getParameter("cons"));
            ps2.setString(7,request.getParameter("review"));
            ps2.setString(8,request.getParameter("rec"));
            
            ps2.executeUpdate();
            System.out.println("row inserted in reviews");
            
        }catch(Exception e){
            System.out.println(e);
        }
        response.sendRedirect("http://localhost:8080/ShopIt/Home.jsp");
        
        
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
