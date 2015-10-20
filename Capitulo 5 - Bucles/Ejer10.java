/**
 * Escribe un programa que calcule la media de un conjunto de números positivos introduci-
 * dos por teclado. A priori, el programa no sabe cuántos números se introducirán. El usuario
 * indicará que ha terminado de introducir los datos cuando meta un número negativo.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer10 {
  public static void main(String[] args) {

    System.out.println("Media de 3 numero enteros");
    System.out.println("·························");
    int valor1 = 0;
    int valor2 = 0;
    int valor3 = 0;

    do {
      System.out.print("Introduce un numero: ");
      valor1 = Integer.parseInt(System.console().readLine());
      
      System.out.print("Introduce un numero: ");
      valor2 = Integer.parseInt(System.console().readLine());
      
      System.out.print("Introduce un numero: ");
      valor3 = Integer.parseInt(System.console().readLine());

      System.out.println("La media de las 3 notas es: " + (valor1 + valor2 + valor3) /3);
      System.out.println("·······························");
      
    } while ((valor1 > 0) && (valor2 > 0) && (valor3 > 0));
    System.out.println("Te he pedido un numero entero. Adios.");
  }
}
