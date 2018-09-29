<%-- 
    Document   : dummyBean
    Created on : 27 Sep, 2018, 12:25:11 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="userDetails" scope="session" class="loginBean"/>
<jsp:setProperty name="userDetails" property="name" value="Name" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP with JavaBeans Page</title>
    </head>
    <body>
        <h1>User Details</h1>
        <table>
            <tr>
                <td>Name: </td>
                <td><jsp:getProperty property="name" name="loginBean"/></td>
            </tr>
            <tr>
                <td>Email: </td>
                <td></td>
            </tr>
            <tr>
                <td>Gender: </td>
                <td></td>
            </tr>
            <tr>
                <td>Mobile: </td>
                <td></td>
            </tr>
        </table>
    </body>
</html>
