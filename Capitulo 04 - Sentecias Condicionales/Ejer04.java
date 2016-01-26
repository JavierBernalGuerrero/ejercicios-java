/**
 *Vamos a ampliar uno de los ejercicios de la relación anterior para considerar las horas
 *extras. Escribe un programa que calcule el salario semanal de un trabajador teniendo en
 *cuenta que las horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora.
 *A partir de la hora 41, se pagan a 16 euros la hora.
 * 
 *@author Javier Bernal
 */

public class Ejer04 { 
  public static void main(String[] args) {

    String numero;

    System.out.println("Salario Semanal");
    System.out.print("Introduce el numero de horas ");
    numero = System.console().readLine();
    double horas;
    horas = Double.parseDouble( numero );

    if (horas <= 40) {
      System.out.println("Salario total " + (horas * 12) + "€");
    } else {
      horas = (horas - 40);
      System.out.println("Salario total " + ((horas * 16) + (40 * 12)) + "€");
    }
  }
}
