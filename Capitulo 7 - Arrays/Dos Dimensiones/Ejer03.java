/*
 *  Modifica el programa anterior de tal forma que los números que se
 * introducen en el array se generen de forma aleatoria (valores entre 100 y
 * 999).
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer03 {
  public static void main(String[] args) {

    boolean esCorrecto = false;
    
    //////////////// Recogida de datos /////////////////

    int x;      //fila
    int y;      //columna

    int[][] num = new int [5] [6];
    
    for (x = 0; x < 4; x++) {
      for (y = 0; y < 5; y++) {
        num [x][y] = ((int)(Math.random() * 899) + 100);
      }
    }
    
    ///////////////////////////////////////////////////

    ////////////// Calculo de sumatorios //////////////
    
    for (x = 0; x < 4; x++) {
      for (y = 0; y < 5; y++) {
        num [x][5] += num [x][y];
      }
      num [4][5] += num [x][5];
    } // suma filas
    
    for (y = 0; y < 5; y++) {
      for (x = 0; x < 4; x++) {
        num [4][y] += num [x][y];
      }
      num [4][5] += num [4][y];
    } // suma columnas
    
    ///////////////////////////////////////////////////
    
    for (x = 0; x < 5; x++) {
      for (y = 0; y < 6; y++) {
        if (y == 5) {
          System.out.print("|");
        }
        if ((x == 4) && (!esCorrecto)){
          System.out.println("···············································");
          esCorrecto = true;
        }
        System.out.print("|" + num[x][y] + "\t");
        
      }
      System.out.println();
      
    } // Bucle for, muestra la tabla
  }
}
