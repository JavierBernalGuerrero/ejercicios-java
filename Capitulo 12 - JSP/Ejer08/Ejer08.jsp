<%-- 
    Document   : Ejer08
    Created on : 25-ene-2016, 12:16:54
    Author     : alumno
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ejercicio 08</title>
    <style>
      table {
        background-color: #cb3030;
        margin: auto;
        width: 50%;
      }
    </style>
  </head>
  <body>
    <% request.setCharacterEncoding("UTF-8"); %> 
      
    <table style="margin: auto; text-align: center;">
        <tr>
          <td style="width: 100px;">0</td>
          <td style="width: 100px;">
            <% out.print(Double.parseDouble(request.getParameter("valorIntroducido")) * 0);%>
          </td>
        </tr>
        <tr>
          <td>1</td>
          <td>
            <% out.print(Double.parseDouble(request.getParameter("valorIntroducido")) * 1);%>
          </td>
        </tr>
        <tr>
          <td>2</td>
          <td>
            <% out.print(Double.parseDouble(request.getParameter("valorIntroducido")) * 2);%>
          </td>
        </tr>
        <tr>
          <td>3</td>
          <td>
            <% out.print(Double.parseDouble(request.getParameter("valorIntroducido")) * 3);%>
          </td>
        </tr>
        <tr>
          <td>4</td>
          <td>
            <% out.print(Double.parseDouble(request.getParameter("valorIntroducido")) * 4);%>
          </td>
        </tr>
        <tr>
          <td>5</td>
          <td>
            <% out.print(Double.parseDouble(request.getParameter("valorIntroducido")) * 5);%>
          </td>
        </tr>
        <tr>
          <td>6</td>
          <td>
            <% out.print(Double.parseDouble(request.getParameter("valorIntroducido")) * 6);%>
          </td>
        </tr>
        <tr>
          <td>7</td>
          <td>
            <% out.print(Double.parseDouble(request.getParameter("valorIntroducido")) * 7);%>
          </td>
        </tr>
        <tr>
        <td>8</td>
          <td>
            <% out.print(Double.parseDouble(request.getParameter("valorIntroducido")) * 8);%>
          </td>
        </tr>
        <tr>
          <td>9</td>
          <td>
            <% out.print(Double.parseDouble(request.getParameter("valorIntroducido")) * 9);%>
          </td>
        </tr>
        <tr>
          <td>10</td>
          <td>
            <% out.print(Double.parseDouble(request.getParameter("valorIntroducido")) * 10);%>
          </td>
        </tr>
    </table>
  </body>
</html>
