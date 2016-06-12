/*
 *  
 *
 * @author Javier Bernal Guerrero
 */

package ejercicios.Tema_8;

import ejercicios.Tema_8.funciones.Arrays;

/**
 *
 * @author alumno
 */
public class Ejer20_28 {
  public static void main(String[] args) {
    // Genera un array nuevo
      int tamaño = 6;
      int nMinimo = 200;
      int nMaximo = 100;

      int nuevoArray[] = Arrays.generaArrayInt(tamaño, nMinimo, nMaximo);

      for (int x = 0; x < tamaño; x++) {

        System.out.println(nuevoArray[x]);
      }
    // Recoge el valor minimo de un array
      System.out.println(Arrays.minimoArrayInt(nuevoArray));
  }
}
