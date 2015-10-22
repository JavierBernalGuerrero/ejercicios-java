/**
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer08 {
  public static void main(String[] args) {

    System.out.println("Tablas de Multiplicacion");
    System.out.println("························");
    System.out.print("Introduce un numero: ");
    int valorIntroducido = Integer.parseInt(System.console().readLine());
    int control = 0;
    int multiplo = 0;
    int cifra = 0;

    do {
      System.out.println(valorIntroducido + "x" + cifra++ + "=" + valorIntroducido * multiplo++);

      control++;
    } while (control <= 9);
  }
}
