/*
 *  Modifica el programa anterior de tal forma que las sumas parciales y la 
 * suma total aparezcan en la pantalla con un pequeño retardo, dando la
 * impresión de que el ordenador se queda “pensando” antes de mostrar los números.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer04 {
  public static void main(String[] args)
    throws InterruptedException {
    
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
          Thread.sleep(2000);
        }
        if ((x == 4) && (!esCorrecto)){
          System.out.println("···············································");
          Thread.sleep(2000);
          esCorrecto = true;
        }
        System.out.print("|" + num[x][y] + "\t");
        
      }
      System.out.println();
      
    } // Bucle for, muestra la tabla
  }
}
