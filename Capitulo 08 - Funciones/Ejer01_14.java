/*
 *  
 *
 * @author Javier Bernal Guerrero
 */
       
package ejercicios;

import funciones.Varias;

public class Ejer01_14 {
  public static void main(String[] args) {
    // esCapicua: Devuelve verdadero si el número que se pasa como parámetro 
    // es capicúa y falso en caso contrario.
      int numero1 = 232;
      if (funciones.Varias.esCapicua(numero1) == numero1) {
        System.out.println("El " + numero1 + " es capicua");
      } else {
        System.out.println("El " + numero1 + " no es capicua");
      }
    // esPrimo: Devuelve verdadero si el número que se pasa como parámetro es
    // primo y falso en caso contrario.
      int numero2 = 16;
      if (funciones.Varias.esPrimo(numero2)) {
        System.out.println("El " + numero2 + " no es primo");
      } else {
        System.out.println("El " + numero2 + " es primo");
      }
    
  }
}