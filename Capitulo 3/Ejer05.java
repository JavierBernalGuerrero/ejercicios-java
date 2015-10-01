/**
 *Escribe un programa que calcule el área de un rectángulo.
 * 
 *@author Javier Bernal
 */

public class Ejer05 { 
  public static void main(String[] args) {

    String numero;

    System.out.println("Area del Rectangulo (m²)");
    System.out.print("Introduce la base ");
    numero = System.console().readLine();
    double numero1;
    numero1 = Double.parseDouble( numero );

    System.out.print("Introduce altura ");
    numero = System.console().readLine();
    double numero2;
    numero2 = Double.parseDouble( numero );
  
    System.out.println("Area: " + (numero1 * numero2));
  }
}
