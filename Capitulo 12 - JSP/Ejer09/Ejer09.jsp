<%-- 
    Document   : Ejer09
    Created on : 25-ene-2016, 18:06:37
    Author     : Javier
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ejercicio 09</title>
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
        int altura = Integer.parseInt(request.getParameter("alturaIntroducida"));

        String espacio = "&nbsp;";
        int contador = 0;
        int contadorEspacio = altura - 1;   // Limita el numero de espacios
        int contadorFila = 1;


        while (contador < altura) {
          ////// Como el texto esta centrado, este bucle no es necesario //////
          /*for (int e = 0; e < contadorEspacio; e++) {
            out.print(espacio);
          }*/


          for (int i = 0; i < contadorFila; i++) {
            if (i + 1 == contadorFila) {
              out.print("*");
            } else {
            out.print("* ");
            }
          }
          out.print("<br>");

          contadorEspacio -= 1;
          contadorFila += 2;
          contador++;
        }
      %>
    </div>
  </body>
</html>
