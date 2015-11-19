/**
 * Realiza un programa que pida un número por teclado y que luego muestre ese
 * número al revés.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer25 {
  public static void main(String[] args) {

    System.out.println(" Suma de numeros");
    System.out.println("·················");
    System.out.print("Introduce un numero: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    int numeroReves = 0;
    
    while (numeroIntroducido != 0) {
      numeroReves = (numeroReves * 10) + (numeroIntroducido % 10);
      numeroIntroducido = numeroIntroducido / 10;
      
    }
    System.out.println(numeroReves);

  }
}
