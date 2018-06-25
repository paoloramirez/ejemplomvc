<%-- 
    Document   : detalle-registro
    Author     : bash
--%>
<%@page import="modelo.Entity.Usuario"%>
<%
    Usuario p1 = (Usuario) request.getSession().getAttribute("datos_usuario");
%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detalle Registro</title>
    </head>
    <body>
        
        <h1><%= p1.getNombre()%></h1>
        
        <h2>DNI: <%= p1.getDni()%> </h2>
        <h2>Nombre: <%= p1.getNombre()%> </h2>
        
        <a href="index.jsp">Volver al inicio</a>
    </body>
</html>
