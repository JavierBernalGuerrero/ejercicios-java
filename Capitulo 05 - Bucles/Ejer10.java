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
    int cifra = 0;
    int suma = 0;
    int cantidad = 0;

    while (cifra >= 0) {
      System.out.print("Introduce un numero: ");
      cifra = Integer.parseInt(System.console().readLine());

      if (cifra >= 0) {
        suma += cifra;
        cantidad++;
      }
    }
    System.out.println("La media de las notas es: " + suma / cantidad);

  }
}
