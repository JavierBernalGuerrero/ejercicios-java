/*
 *  Escribe un programa que pida 20 números enteros. Estos números se deben 
 * introducir en un array de 4 filas por 5 columnas. El programa mostrará las 
 * sumas parciales de filas y columnas igual que si de una hoja de cálculo se 
 * tratara. La suma total debe aparecer en la esquina inferior derecha.
 *
 * @author Javier Bernal Guerrero
 */

import java.util.Scanner;

public class Ejer02 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    boolean esCorrecto = false;
    
    //////////////// Recogida de datos /////////////////

    int x;      //fila
    int y;      //columna

    int[][] num = new int [5] [6];
    
    for (x = 0; x < 4; x++) {
      System.out.println("Fila " + (x + 1) + ": ");
      for (y = 0; y < 5; y++) {
        System.out.print("Introduce un numero: ");
        num [x][y] = Integer.parseInt(s.nextLine());
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
