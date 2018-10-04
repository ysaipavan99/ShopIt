<%-- 
    Document   : dummyBean
    Created on : 27 Sep, 2018, 12:25:11 PM
    Author     : HP
--%>




<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP with JavaBeans Page</title>
    </head>
    <body>
        <h1>User Details</h1>
        
        
        <c:choose>

            <c:when test="${empty UD}">
               
            </c:when>
            <c:otherwise>
                <table>
                    <tr>
                        <td>Name: </td>
                        <td>${UD.name}</td>
                    </tr>
                    <tr>
                        <td>Email: </td>
                        <td>${UD.email}</td>
                    </tr>
                    <tr>
                        <td>Gender: </td>
                        <td>${UD.gender}</td>
                    </tr>
                    <tr>
                        <td>Mobile: </td>
                        <td>${UD.mobnum}</td>
                    </tr>
                </table>
    </body>
</html>
