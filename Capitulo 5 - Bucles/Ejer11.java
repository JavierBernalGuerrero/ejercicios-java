/**
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros
 * números enteros a partir de uno que se introduce por teclado.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer11 {
  public static void main(String[] args) {

    System.out.println("Operaciones varias");
    System.out.println("·························");
    System.out.print("Introduce un numero: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    int control = 0;

    do {
      System.out.printf("El numero es %d, su cuadrado es %d y su cubo es %d.\n" , numeroIntroducido , (numeroIntroducido * numeroIntroducido) , (numeroIntroducido * numeroIntroducido * numeroIntroducido));
      numeroIntroducido++;
      control++;
      
    } while (control < 5);
  }
}
