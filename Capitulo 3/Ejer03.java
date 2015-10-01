/**
 *Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere convertir
 *debe ser introducida por teclado.
 * 
 *@author Javier Bernal
 */

public class Ejer03 { 
  public static void main(String[] args) {

    String numero;

    System.out.print("Conversor pesetas/euros\nIntroduce la cantidad en pesetas ");
    numero = System.console().readLine();
    double pts;
    pts = Integer.parseInt( numero );

    System.out.printf("Resultado: %.0fpts equivale a %.2f€", pts, (pts / 166));
  }
}
