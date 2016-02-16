<%-- 
    Document   : Ejer07
    Created on : 21-ene-2016, 10:18:38
    Author     : alumno
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ejercicio 07</title>
  </head>
  <body>
    <h2>
      <% DecimalFormat formatoDecimal = new DecimalFormat("000.00");%>
      <% request.setCharacterEncoding("UTF-8"); %> 
      
      <%  if (request.getParameter("eleccion").equals("opcionEuros")) {
            double pesetas = (Double.parseDouble(request.getParameter("valorIntroducido")) * 166.386);
            out.print(request.getParameter("valorIntroducido") + "€ son " + formatoDecimal.format(pesetas) + "pts.");
          } else {
            double euros = (Double.parseDouble(request.getParameter("valorIntroducido")) / 166.386);
            out.print(request.getParameter("valorIntroducido") + "pts son " + formatoDecimal.format(euros) + "€.");
          }
     
      %>
     <!-- REVISAR VALORES--> 
  </body>
</html>