/**
 *Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una altura
 *h. Aplica la fórmula t = √2h/g siendo g = 9.81/s²
 * 
 *@author Javier Bernal
 */

public class Ejer06 { 
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca la altura: ");
      double altura = Integer.parseInt(System.console().readLine());

    double solucion = Math.sqrt(2*altura/9.81);

    if (solucion < 0) {
      System.out.println("El valor de a no puede ser menos de 0");
    } else {
      System.out.print("El valor de t es: " + solucion + "segundos");
    }
  }
}
