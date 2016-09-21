/**
 * Realiza un programa que diga cuántas ocurrencias de una palabra hay en un fichero. Tanto el
 * nombre del fichero como la palabra se deben pasar como argumentos en la línea de comandos.
 *  
 * @author Javier Bernal Guerrero
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejer06 {
  public static void main(String[] args) {
    try {
      String ruta = args[0];
      
      BufferedReader bf = new BufferedReader(new FileReader(ruta));
            
      String linea;
      int indice;
      String palabra = args[1];
      int contador = 0;
      
      while ((linea = linea = bf.readLine()) != null) {        
        while ((indice = linea.indexOf(palabra)) != -1) {
          linea = linea.substring(indice + palabra.length(), linea.length());
          contador++;
        }
      }
      
      System.out.println("La palabra " + palabra + " aparece " + contador 
                                                      + " veces en el fichero " + ruta);
      
      bf.close();
      
    } catch (FileNotFoundException e) { 
      System.out.println("No se encuentra el fichero.");
    
    } catch (IOException ioe) {
      System.out.println("No se ha podido escribir en el fichero.");
    
    }
  }
}
