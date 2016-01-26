<%-- 
    Document   : Ejer04
    Created on : 21-ene-2016, 9:33:50
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ejercicio 04</title>
  </head>
  <body>
    <h2>Tu media es un 
      <% request.setCharacterEncoding("UTF-8"); %> 
      <% double media;
              media = ((Double.parseDouble(request.getParameter("nota1")) + Double.parseDouble(request.getParameter("nota2")) + Double.parseDouble(request.getParameter("nota3")))/3);
      %>
      <% out.print(media + ".</h2>"); %>
      
  </body>
</html>
