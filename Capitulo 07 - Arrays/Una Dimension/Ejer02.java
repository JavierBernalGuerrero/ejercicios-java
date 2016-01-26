/**
 * Define un array de 10 caracteres con nombre simbolo y asigna valores a los
 * elementos según la tabla que se muestra a continuación. Muestra el contenido
 * de todos los elementos del array. ¿Qué sucede con los valores de los
 * elementos que no han sido inicializados? [PONE UN NULL]
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer02 {
  public static void main(String[] args) {
    System.out.println(" Array de 10 simbolos");
    System.out.println("······················");
    System.out.println("Los valores del array son: ");

    String[] simbolo;          // Define "simbolo" como array de caracteres
    simbolo = new String [10];   // Reserva "espacio" para el array
    
    simbolo[0] = "a";
    simbolo[1] = "x";
    simbolo[4] = "@";
    simbolo[6] = " ";
    simbolo[7] = "+";
    simbolo[8] = "Q";

    /*
    for (int i = 0; i < 10; i++) {
      System.out.print(simbolo[i] + " ");

    }
    */
    
    for (String n : simbolo) {
      System.out.print(n + " ");
      
    }
  }
}
