/*
 *  
 *
 * @author Javier Bernal Guerrero
 */

package ejercicios.Tema_8;

import ejercicios.Tema_8.funciones.ArraysBidi;

public class Ejer29_34 {
  public static void main(String[] args) {
    // generaArrayBiInt: Genera un array de tamaño n x m con números aleatorios
    // cuyo intervalo (mínimo y máximo) se indica como parámetro.
      int nFilas = 4;
      int nColumnas = 8;
      int nMinimo = 0;
      int nMaximo = 99;

      int nuevoArray[][] = ArraysBidi.generaArrayBiInt
                                        (nFilas, nColumnas, nMinimo, nMaximo);
            
      System.out.println("1.El array bidimensional generado es:");
      for (int y = 0; y < nFilas; y++) {
        for (int x = 0; x < nColumnas; x++) {
          System.out.printf("[%2d]",nuevoArray[y][x]);

        }
        System.out.println();
      }
    // filaDeArrayBiInt: Devuelve la fila i-ésima del array que se pasa como 
    // parámetro.
      int filaEscogida = 0;
      
      System.out.println("\n2.La fila " + filaEscogida + 
              " tiene los valores: ");
      
      for (int x = 0; x < nColumnas; x++) {
          System.out.printf("[%2d]",ArraysBidi.filaDeArrayBiInt(
                  nuevoArray, filaEscogida)[x]);

      }
      
    // columnaDeArrayBiInt: Devuelve la columna j-ésima del array que se pasa
    // como parámetro.
      int columnaEscogida = 2;
      
      System.out.println("\n\n3.La columna " + columnaEscogida + 
              " tiene los valores: ");
      
      for (int x = 0; x < nFilas; x++) {
          System.out.printf("[%2d]",ArraysBidi.columnaDeArrayBiInt(
                  nuevoArray, columnaEscogida)[x]);

      }
      
    // coordenadasEnArrayBiInt: Devuelve la fila y la columna (en un array con 
    // dos elementos) de la primera ocurrencia de un número dentro de un array 
    // bidimensional. Si el número no se encuentra en el array, la función 
    // devuelve el array {-1, -1}.
      int nPropuesto = 45;
      
      System.out.println("\n\n4.El numero " + nPropuesto + 
              " esta en las coordenadas: ");
      
      for (int x = 0; x < 2; x++) {
          System.out.printf("[%2d]",ArraysBidi.coordenadasEnArrayBiInt
        (nuevoArray, nPropuesto)[x]);

      }
      
    // esPuntoDeSilla: Dice si un número es o no punto de silla, es decir, 
    // mínimo en su fila y máximo en su columna.
      int coordenadaY = 1;
      int coordenadaX = 1;
      
      System.out.println("\n\n5.El numero que se encuentra en la posicion [" 
              + coordenadaY + "][" + coordenadaX + "] ");
      if (ArraysBidi.esPuntoDeSilla(nuevoArray, coordenadaY, coordenadaX)) {
        System.out.println("es punto de silla.");
      } else {
        System.out.println("no es punto de silla.");
      }
      
    // diagonal: Devuelve un array que contiene una de las diagonales del 
    // array bidimensional que se pasa como parámetro.
      String direccion = "neso";
      int[] diagonal = ArraysBidi.diagonal(nuevoArray, coordenadaY, coordenadaX, direccion);
      
      System.out.println("\n6.La diagonal " + direccion + " de las "
              + "coordenadas [" + coordenadaY + "][" + coordenadaX + "] es:");
      for (int i = 0; i < diagonal.length; i++) {
          System.out.printf("[%2d]", diagonal[i]);

      } 
  }
}
