/**
 *Escribe un programa que calcule el salario semanal de un empleado en base a las horas
 *trabajadas, a razón de 12 euros la hora.
 * 
 *@author Javier Bernal
 */

public class Ejer08 { 
  public static void main(String[] args) {

    String numero;

    System.out.println("Salario Semanal");
    System.out.print("Introduce el numero de horas ");
    numero = System.console().readLine();
    double horas;
    horas = Double.parseDouble( numero );

    System.out.println("Precio total " + (horas * 12) + "€");
  }
}
