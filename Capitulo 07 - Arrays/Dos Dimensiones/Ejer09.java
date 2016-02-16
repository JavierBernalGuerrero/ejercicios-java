/*
 * Realiza un programa que sea yz de rotar todos los elementos de una
 * matriz cuadrada una posición en el sentido de las agujas del reloj.
 * La matriz debe tener 12 filas por 12 columnas y debe contener números
 * generados al azar entre 0 y 100. Se debe mostrar tanto la matriz original 
 * como la matriz resultado, ambas con los números convenientemente alineados.
 *
 * @author Javier Bernal Guerrero
 */

package ejercicios;

public class Ejer09 {
  public static void main(String[] args) {
    
    int[][] casilla = new int[12][12];
    int auxiliar1;
    int auxiliar2;
    
    ////////////////////// Dibuja la tabla Original ///////////////////////////
    
    System.out.println("┌───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┐");
    
    for (int y = 0; y < 12; y++) {
      System.out.print("│");
      for(int x = 0; x < 12; x++) {
        casilla[y][x] = (int)(Math.random() * 101);
        System.out.printf("%3d│", casilla[y][x]);
      }
      if (y == 11) {
        System.out.println("\n└───┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┘");
      } else {
        System.out.println("\n├───┼───┼───┼───┼───┼───┼───┼───┼───┼───┼───┼───┤");
      }
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    for (int y = 0; y < 6; y++) {
      
      auxiliar1 = casilla[y][11 - y];
      for (int x = 11 - y; x > y; x--) {
        casilla[y][x] = casilla[y][x - 1];
      } // Arriba
      
      auxiliar2 = casilla[11 - y][11 - y];
      for (int x = 11 - y; x > y + 1; x--) {
        casilla[x][11 - y] = casilla[x - 1][11 - y];
      } // Derecha
      casilla [y + 1][11 - y] = auxiliar1;
      
      auxiliar1 = casilla[11 - y][y];
      for (int x = y; x < 11 - y - 1; x++) {
        casilla[11 - y][x] = casilla[11 - y][x + 1];
      } // Abajo
      casilla [11 - y][11 - y - 1] = auxiliar2;
      
      for (int x = y; x < 11 - y - 1; x++) {
        casilla[x][y] = casilla[x + 1][y];
      }
      casilla[11 - y - 1][y] = auxiliar1;

    }
    
    
    ////////////////////// Dibuja la tabla Modificada /////////////////////////
    
    System.out.println("┌───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┐");
    
    for (int y = 0; y < 12; y++) {
      System.out.print("│");
      for(int x = 0; x < 12; x++) {
        System.out.printf("%3d│", casilla[y][x]);
      }
      if (y == 11) {
        System.out.println("\n└───┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┘");
      } else {
        System.out.println("\n├───┼───┼───┼───┼───┼───┼───┼───┼───┼───┼───┼───┤");
      }
    }
    
    ///////////////////////////////////////////////////////////////////////////
  }
}
