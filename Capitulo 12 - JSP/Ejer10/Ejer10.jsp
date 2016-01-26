<%-- 
    Document   : Ejer10
    Created on : 25-ene-2016, 20:46:14
    Author     : Javier
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ejercicio 10</title>
    <style>
      body {
        background-color: #234089;
      }
      div {
        text-align: center;
        width: 85%;
        margin: auto;
        background-color: #0077f1;
        font-family: courier;
      }
    </style>
  </head>
  <body>
    <div>
      <%
        int puntuacion = 0;
        
        out.print("Preguntas correctas: ");
        for (int i = 1; i <= 10; i++) {
          if (request.getParameter("respuesta" + i).equals("respuestaCorrecta" + i)) {
            out.print(i + "º ");
            puntuacion++;
          }
        }
        out.print("<br>Tu puntacion es: " + puntuacion);
      %>
    </div>
  </body>
</html>
