/**
 * Define un array de 12 números enteros con nombre num y asigna los valores
 * según la tabla que se muestra a continuación. Muestra el contenido de todos
 * los elementos del array. ¿Qué sucede con los valores de los elementos que
 * no han sido inicializados?  [PONE UN 0]
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer01 {
  public static void main(String[] args) {
    System.out.println(" Array de 12 numeros enteros");
    System.out.println("·····························");
    System.out.println("Los valores del array son: ");
    int[] num;          // Define "num" como array de numeros enteros
    num = new int [12];   // Reserva "espacio" para el array
    
    num[0] = 39;
    num[1] = -2;
    num[4] = 0;
    num[6] = 14;
    num[8] = 5;
    num[9] = 120;

    /*
    for (int i = 0; i < 12; i++) {
      System.out.println(num[i]);

    }
    */
    
    for (int n : num) {
      System.out.print(n + " ");
      
    }
  }
}
