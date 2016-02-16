/*
 *  Modifica el programa anterior de tal forma que no se repita ningún 
 * número en el array.
 *
 * @author Javier Bernal Guerrero
 */

package ejercicios;

public class Ejer06 {
  public static void main(String[] args)
    throws InterruptedException {
	  
	boolean repetido;
    
    int numeroMaximo = 0;
    int numeroMinimo = 0;
    int xMaximo = 0;
    int yMaximo = 0;
    int xMinimo = 0;
    int yMinimo = 0;
    
    //////////////// Recogida de datos /////////////////

    int x;      //fila
    int y;      //columna

    int[][] num = new int [6] [10];
    
    for (y = 0; y < 6; y++) {
      for (x = 0; x < 10; x++) {
        
        do {		
            num[y][x] = (int)(Math.random() * 60); // Asigna los valores

            repetido = false;
            for (int n = 0; n < 10 * y + x; n++) {
              if (num[y][x] == num[n / 10][n % 10]) {
                repetido = true;
              }
            }
          } while (repetido); // Comprueba si hay numeros repetidos
        
        if (num[y][x] > numeroMaximo) {    // Maximo
        numeroMaximo = num[y][x];
        xMaximo = x;
        yMaximo = y;
        
        }
        if ((num[y][x] < numeroMinimo) || (numeroMinimo == 0)) { // Minimo
        numeroMinimo = num[y][x];
        xMinimo = x;
        yMinimo = y;
        
        }
      }
    }
    
    ///////////////////////////////////////////////////
    
    for (y = 0; y < 6; y++) {
      for (x = 0; x < 10; x++) {
        if ((xMaximo == x) && (yMaximo == y)) {
          System.out.print("|" + num[y][x] + "\t");
        } else {
          if ((xMinimo == x) && (yMinimo == y)) {
            System.out.print("|" + num[y][x] + "\t");
          } else {
            System.out.print("|" + num[y][x] + "\t");
          }
        }
      }
      System.out.println();
      
    } // Bucle for, muestra la tabla
    
    System.out.println("El numero maximo es " + numeroMaximo + " y esta en la posicion [" + yMaximo + "][" + xMaximo + "]");
    System.out.println("El numero minimo es " + numeroMinimo + " y esta en la posicion [" + yMinimo + "][" + xMinimo + "]");
  }
}
