/*
 * Funciones Varias
 *
 * @author Javier Bernal Guerrero
 */

package funciones;

public class Varias {
  public static void main(String[] args) {
    
    
  }
  
  
    // esCapicua
    /**
     * Devuelve verdadero si el número que se pasa como parámetro es capicúa y
     * falso en caso contrario.
     * 
     * Un número capicúa es el que se lee igual de izquierda a derecha que de
     * derecha a izquierda.
     * 
     * @param   numIntroducido número del que se quiere saber si es capicúa
     * @return  verdadero si el número que se pasa como parámetro es capicúa y
     *          falso en caso contrario
     */
  public static int esCapicua (int numIntroducido) {
    int numReves = 0;
    
    while (numIntroducido != 0) {
      numReves = (numReves * 10) + (numIntroducido % 10);
      numIntroducido = numIntroducido / 10;
      
    }
    return numReves;
  }
  
    // esPrimo
    /**
     * Devuelve verdadero si el número que se pasa como parámetro es primo y 
     * falso en caso contrario.
     * Un número es primo cuando es divisible únicamente entre el mismo y 
     * entre 1.
     *
     * @param   numIntroducido número del que se quiere saber si es primo
     * @return  true si el número que se pasa como parámetro es primo y false
     *          en caso contrario
     */
  public static boolean esPrimo (int numIntroducido) {
    for (int x = 2; x < (numIntroducido / 2); x++) {
      if (numIntroducido % x == 0) {
        return true;
      }
    }
    return false;
  }
}
