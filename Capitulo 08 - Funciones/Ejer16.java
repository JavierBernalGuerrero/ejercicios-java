/*
 * Muestra los números capicúa que hay entre 1 y 99999.
 *
 * @author Javier Bernal Guerrero
 */
package ejercicios.Tema_8;

import ejercicios.Tema_8.funciones.Matematicas;

public class Ejer16 {
  public static void main(String[] args) {
    for (int i = 1; i <= 99999; i++) {
      if (Matematicas.esCapicua(i)) {
        System.out.println(i + " ");
      }
    }
  }
}
