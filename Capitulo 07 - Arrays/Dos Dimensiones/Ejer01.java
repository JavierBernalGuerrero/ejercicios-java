/*
 *  Define un array de números enteros de 3 filas por 6 columnas con nombre num
 * y asigna los valores según la siguiente tabla. Muestra el contenido de todos
 * los elementos del array dispuestos en forma de tabla como se muestra en la
 * figura.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer01 {
  public static void main(String[] args) {

    //////////////// Recogida de datos /////////////////

    int x;      //fila
    int y;      //columna

    int[][] num = new int [3] [6];

    num[0][0] = 0;
    num[0][1] = 30;
    num[0][2] = 2;
    num[0][5] = 5;
    
    num[1][0] = 75;
    num[1][4] = 0;
    
    num[2][2] = -2;
    num[2][3] = 9;
    num[2][5] = 11;

    ///////////////////////////////////////////////////

    for (x = 0; x < 3; x++) {
      for (y = 0; y < 6; y++) {
        System.out.print("|" + num[x][y] + "\t");
      }
      System.out.println();
      
    } // Bucle for, muestra la tabla
  }
}
