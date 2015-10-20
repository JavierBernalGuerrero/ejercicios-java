/**
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás 
 * utilizando un bucle for.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer06 {
  public static void main(String[] args) {

    System.out.println("Cuenta atras (de 20) del 320 al 160, ");
    int numero = 320;
    System.out.println(numero);

    do {
      numero = numero - 20;
      System.out.println(numero);
    } while (numero > 160);
  }
}
