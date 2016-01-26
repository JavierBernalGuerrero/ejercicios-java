<%-- 
    Document   : Ejer06
    Created on : 21-ene-2016, 10:18:38
    Author     : alumno
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ejercicio 06</title>
  </head>
  <body>
    <h2>
      <% DecimalFormat formatoPesetas = new DecimalFormat("000.00");%>
      <% request.setCharacterEncoding("UTF-8"); %> 
      <% double euros = (Double.parseDouble(request.getParameter("euros")) / 166.386); %>
      <% out.print(request.getParameter("euros") + "pts son " + formatoPesetas.format(euros) + "€."); %>
  </body>
</html>
