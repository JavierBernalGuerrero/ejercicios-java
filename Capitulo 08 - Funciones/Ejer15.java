/*
 * Muestra los números primos que hay entre 1 y 1000.
 *
 * @author Javier Bernal Guerrero
 */
package ejercicios.Tema_8;

import ejercicios.Tema_8.funciones.Matematicas;

public class Ejer15 {
  public static void main(String[] args) {
    for (int i = 1; i <= 1000; i++) {
      if (Matematicas.esPrimo(i)) {
        System.out.println(i);
      }
    }
  }
}
