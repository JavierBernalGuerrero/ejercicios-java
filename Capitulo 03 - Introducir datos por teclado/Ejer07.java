/**
 *Escribe un programa que calcule el total de una factura a partir de la base 
 *imponible.
 * 
 *@author Javier Bernal
 */

public class Ejer07 { 
  public static void main(String[] args) {

    String numero;

    System.out.println("Factura");
    System.out.print("Introduce la base imponible ");
    numero = System.console().readLine();
    double baseImp;
    baseImp = Double.parseDouble( numero );

    System.out.println("Precio total " + (baseImp + (baseImp * 21) / 100) + "€");

  }
}
