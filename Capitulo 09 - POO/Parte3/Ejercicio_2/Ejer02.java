/**
 *
 * Cambia el programa anterior de tal forma que los datos de los gatos se
 * introduzcan directamente en el código de la forma
 * gatito[2].setColor(“marrón”) o bien mediante el constructor, de la forma
 * gatito[3] = new Gato(“Garfield”, “naranja”, “macho”) . Muestra a
 * continuación los datos de todos los gatos utilizando un bucle.
 * 
 * @author Javier Bernal Guerrero
 */

package POO.Parte3.Ejercicio_2;

public class Ejer02 {
  public static void main(String[] args) {
    Gato[] gatito = new Gato[4];
    
    for (int i = 0; i < 4; i++) {
      gatito[i] = new Gato("Gato_" + i);
    }
    
    gatito[2].setColor("marrón");
    gatito[3] = new Gato("Garfield", "naranja", "macho");
    
    for (int i = 0; i < 4; i++) {
      System.out.println(gatito[i] + ".");
    }
  }
}
