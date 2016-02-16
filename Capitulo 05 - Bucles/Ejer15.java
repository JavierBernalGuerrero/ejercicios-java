/**
 * Escribe un programa que dados dos números, uno real (base) y un entero
 * positivo (exponente), saque por pantalla todas las potencias con base el
 * numero dado y exponentes entre uno y el exponente introducido. No se deben
 * utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y
 * el 5, se deberán mostrar 2¹, 2², 2³, 2⁴ y 2⁵.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer15 {
  public static void main(String[] args) {

    System.out.println(" Calculo de potencias");
    System.out.println("······················");
    System.out.print("Introduce la base (numero real): ");
    double base = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce el exponente: ");
    int exponente = Integer.parseInt(System.console().readLine());
    
    int contador = 1;

    do {
      if (exponente >= 0) {
        System.out.println("Base: " + base + " - Exponente: " + contador);
        contador++;
      } else {
        System.out.println("El exponente no puede ser negativo.");
      }
    } while (exponente >= contador);
  }
}
