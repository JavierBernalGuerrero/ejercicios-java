/**
 *Realiza un conversor de Mb a Kb.
 * 
 *@author Javier Bernal
 */

public class Ejer11 { 
  public static void main(String[] args) {

    String numero;

    System.out.println("Conversor Kb/Mb");
    System.out.print("Introduce la cantidad (kb) ");
    numero = System.console().readLine();
    double kb;
    kb = Double.parseDouble( numero );

    System.out.println("Resultado: " + kb / 1024 + "Mb");
  }
}
