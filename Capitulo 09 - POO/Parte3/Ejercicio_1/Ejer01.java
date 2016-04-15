/**
 *
 * Utiliza la clase Gato para crear un array de cuatro gatos e introduce los
 * datos de cada uno de ellos mediante un bucle. Muestra a continuación los
 * datos de todos los gatos utilizando también un bucle.
 * 
 * @author Javier Bernal Guerrero
 */

package POO.Parte3.Ejercicio_1;

public class Ejer01 {
  public static void main(String[] args) {
    Gato[] gatos = new Gato[4];
    
    for (int i = 0; i < 4; i++) {
      gatos[i] = new Gato("Gato_" + i);
    }
    
    for (int i = 0; i < 4; i++) {
      System.out.println(gatos[i]);
    }
    
  }
}
