/*
 *  Realiza un programa que rellene un array de 6 filas por 10 columnas con
 * números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
 * continuación, el programa deberá dar la posición tanto del máximo como del
 * mínimo.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer05 {
  public static void main(String[] args)
    throws InterruptedException {
    
    int numeroMaximo = 0;
    int numeroMinimo = 0;
    int xMaximo = 0;
    int yMaximo = 0;
    int xMinimo = 0;
    int yMinimo = 0;
    String blanco = "\033[37m";
    String verde = "\033[32m";
    String azul = "\033[34m";
    
    //////////////// Recogida de datos /////////////////

    int x;      //fila
    int y;      //columna

    int[][] num = new int [6] [10];
    
    for (x = 0; x < 6; x++) {
      for (y = 0; y < 10; y++) {
        num [x][y] = (int)(Math.random() * 1001);
        
        if (num[x][y] > numeroMaximo) {    // Maximo
        numeroMaximo = num[x][y];
        xMaximo = x;
        yMaximo = y;
        
        }
        if ((num[x][y] < numeroMinimo) || (numeroMinimo == 0)) { // Minimo
        numeroMinimo = num[x][y];
        xMinimo = x;
        yMinimo = y;
        
        }
      }
    }
    
    ///////////////////////////////////////////////////
    
    for (x = 0; x < 6; x++) {
      for (y = 0; y < 10; y++) {
        if ((xMaximo == x) && (yMaximo == y)) {
          System.out.print("|" + azul + num[x][y] + "\t" + blanco);
        } else {
          if ((xMinimo == x) && (yMinimo == y)) {
            System.out.print("|" + verde + num[x][y] + "\t" + blanco);
          } else {
            System.out.print(blanco + "|" + num[x][y] + "\t");
          }
        }
      }
      System.out.println();
      
    } // Bucle for, muestra la tabla
    
    System.out.println(azul + "El numero maximo es " + numeroMaximo + " y esta en la posicion [" + xMaximo + "][" + yMaximo + "]");
    System.out.println(verde + "El numero minimo es " + numeroMinimo + " y esta en la posicion [" + xMinimo + "][" + yMinimo + "]");
  }
}
