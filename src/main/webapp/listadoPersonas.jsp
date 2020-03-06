<%-- 
    Document   : listadoPersonas
    Created on : 6/03/2020, 01:19:36 PM
    Author     : rperez
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de personas</title>
    </head>
    <body>
        <h1>Listado de personas</h1>
        <ul>
            <c:forEach items="${personas}" var="persona">
                <li>${persona.nombre} ${persona.apellido}</li>
            </c:forEach>
        </ul>
    </body>
</html>
