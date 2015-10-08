/**
 *Realiza un programa que resuelva una ecuación de primer grado (del tipo ax + b = 0).
 * 
 *@author Javier Bernal
 */

public class Ejer05 { 
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca el valor de a: ");
      double valorA = Integer.parseInt(System.console().readLine());

    System.out.print("Por favor, introduzca el valor de b: ");
      double valorB = Double.parseDouble(System.console().readLine());

    double incognita = -valorB/valorA;

    if (valorA == 0) {
      System.out.println("El valor de a no puede ser 0");
    } else {
      System.out.print("El valor de x es: " + incognita);
    }
  }
}
