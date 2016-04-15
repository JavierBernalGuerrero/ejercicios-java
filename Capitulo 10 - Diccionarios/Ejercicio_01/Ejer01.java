
package proyectos.Diccionarios.Ejercicio_01;

import java.util.ArrayList;

/**
 *
 * Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación,
 * muestra esos nombres por pantalla. Utiliza para ello un bucle for que
 * recorra todo el ArrayList sin usar ningún índice.
 * 
 * @author Javier Bernal Guerrero
 */
public class Ejer01 {
  public static void main(String[] args) {
    ArrayList<String> alumnos = new ArrayList();
    
    alumnos.add("alumno1");
    alumnos.add("alumno2");
    alumnos.add("alumno3");
    alumnos.add("alumno4");
    alumnos.add("alumno5");
    alumnos.add("alumno6");
    
    for (String nombre : alumnos) {
      System.out.println(nombre);
    }
  }
}
