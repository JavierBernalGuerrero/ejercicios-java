/**
 * Generación de números aleatorios.
 *
 * @author Javier Bernal Guerrero
**/


public class Apuntes {
  public static void main(String[] args) {
  System.out.println("20 números aleatorios entre 3 y 12 (sin decimales):");
  
    for (int i = 1; i <= 20; i++) {      //  \/ Cantidad de posibilidades
      System.out.print((int)(Math.random() * 10) + 3 + " ");
                                          //       /\  Primer numero para la cadena
    }
  }
}
