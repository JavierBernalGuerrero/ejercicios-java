<%-- 
    Document   : Ejer03
    Created on : 21-ene-2016, 8:31:07
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ejercicio 03</title>
  </head>
  <body>
    <h1>Hola
      <% request.setCharacterEncoding("UTF-8"); %> 
      <% out.print(request.getParameter("nombreUsuario") + ", Buenos dias</h1>"); %>
      
  </body>
</html>
