/**
 * Realiza un programa que llene la pantalla de caracteres aleatorios (a lo
 * Matrix) con el código ascii entre el 32 y el 126. Puedes hacer casting con
 * (char) para convertir un entero en un carácter.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer12 {
  public static void main(String[] args) {
    System.out.println(" Matrix");
    System.out.println("········");
    
    while (0 == 0) {
      System.out.print((char)((int)(Math.random() * 95) + 32));

    }
  }
}
