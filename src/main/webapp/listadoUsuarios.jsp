<%-- 
    Document   : listadoUsuarios
    Created on : 10/03/2020, 04:03:47 PM
    Author     : rperez
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de usuarios</title>
    </head>
    <body>
        <h1>Listado de usuarios</h1>
         <ul>
            <c:forEach items="${usuarios}" var="usuario">
                <li>${usuario.username} ${usuario.password}</li>
            </c:forEach>
        </ul>
    </body>
    <p>
    <a href="index.jsp">Regresar</a>
</html>
