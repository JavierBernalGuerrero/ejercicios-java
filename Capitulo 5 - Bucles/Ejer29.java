/**
 * Escribe un programa que muestre por pantalla todos los números enteros positivos menores
 * a uno leído por teclado que no sean divisibles entre otro también leído de igual forma.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer29 {
  public static void main(String[] args) {

    System.out.println(" Calcular numeros");
    System.out.println("··················");
    System.out.print("Introduce un numero: ");
    int valor1 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce otro numero: ");
    int valor2 = Integer.parseInt(System.console().readLine());
    
    for (int i = 1; i < valor1; i++) {
      if (i % valor2 != 0) {
        System.out.print(i + " ");
      }
    }
  }
}
