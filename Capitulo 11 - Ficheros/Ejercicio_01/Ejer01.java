/**
 * Escribe un programa que guarde en un fichero con nombre primos.dat los 
 * números primos que hay entre 1 y 500.
 * 
 * @author Javier Bernal Guerrero
 */
package Ejercicio_01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejer01 {
  public static void main(String[] args) {
    try {   
      //LA RUTA ES A PARTIR DE LA RAIZ DEL SISTEMA
      BufferedWriter bw = new BufferedWriter(new FileWriter(
              "/home/alumno/NetBeansProjects/Ejercicios/src/Ficheros/Ejercicio_01/prueba.txt"));
      
      for (int i = 0; i < 500; i++) {
        if (esPrimo(i)) {
          System.out.println(i);
          bw.write(i + "\n");
        }
      }
      
      bw.close();
      
    } catch (IOException ioe) {
      System.out.println("No se ha podido escribir en el fichero.");
      
    }
  }
  
  public static boolean esPrimo (int numIntroducido) {
    for (int x = 2; x < (numIntroducido / 2); x++) {
      if (numIntroducido % x == 0) {
        
        return false;
      }
    }
    
    return true;
  }
}
