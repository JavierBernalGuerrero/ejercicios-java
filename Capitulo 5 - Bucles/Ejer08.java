/**
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer08 {
  public static void main(String[] args) {

    System.out.println("Tablas de Multiplicacion");
    System.out.println("························");
    int control = 0;
    int cifra = 0;

    do {
      System.out.print("Introduce un numero: ");
      cifra = Integer.parseInt(System.console().readLine());

      System.out.println(cifra * 1);
      System.out.println(cifra * 2);
      System.out.println(cifra * 3);
      System.out.println(cifra * 4);
      System.out.println(cifra * 5);
      System.out.println(cifra * 6);
      System.out.println(cifra * 7);
      System.out.println(cifra * 8);
      System.out.println(cifra * 9);
      System.out.println("·····················");

    } while (control == 0);
  }
}
