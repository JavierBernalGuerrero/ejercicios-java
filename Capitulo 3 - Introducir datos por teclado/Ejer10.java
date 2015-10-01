/**
 *Realiza un conversor de Mb a Kb.
 * 
 *@author Javier Bernal
 */

public class Ejer10 { 
  public static void main(String[] args) {

    String numero;

    System.out.println("Conversor Mb/Kb");
    System.out.print("Introduce la cantidad (mb) ");
    numero = System.console().readLine();
    int mb;
    mb = Integer.parseInt( numero );

    System.out.println("Resultado: " + mb * 1024 + "Kb");
  }
}
