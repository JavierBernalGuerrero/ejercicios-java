/**
 *Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere convertir debe
 *ser introducida por teclado.
 * 
 *@author Javier Bernal
 */

public class Ejer02 { 
  public static void main(String[] args) {

    String numero;
    double pts = 166.386;

    System.out.print("Conversor euros/pesetas\nIntroduce la cantidad en euros ");
    numero = System.console().readLine();
    double euros;
    euros = Double.parseDouble( numero );

    //System.out.print("Resultado: " + euros * pts + "pts");
    System.out.printf("Resultado: %.2f€ equivale a %.0fpts", euros, (euros * pts));
  }
}
