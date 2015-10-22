/**
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer09 {
  public static void main(String[] args) {

                                            // para este ejercicio, es mejor utilizar el bucle "while"

    System.out.println("Calcular el numero de cifras");
    System.out.println("····························");
    System.out.print("Introduce un numero: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    int digitos = 1;

    while (numeroIntroducido >= 10) {
      numeroIntroducido /= 10;              // /= equivale a la operacion realizada por la variable
                                            // Ej: cifra /= 10       ->    cifra = cifra / 10
      digitos++;

    }
    System.out.println(digitos);
  }
}
