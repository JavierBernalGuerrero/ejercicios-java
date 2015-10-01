/**
 *Escribe un programa que calcule el total de una factura a partir de la base imponible (precio
 *sin IVA). La base imponible estará almacenada en una variable.
 *
 *@author Javier Bernal
 * 
 */

public class Ejer06 { 
  public static void main(String[] args) {

    double basImp = 100;

    System.out.println("Base imponible " + basImp + "€");
    System.out.println("I.V.A. " + 21 + "%");
    System.out.println("Precio total " + ((basImp * 21) / 100) + "€");
  }
}
