/**
 * Escribe un programa capaz de quitar los comentarios de un programa de Java. Se utilizaría de la 
 * siguiente manera: 
 * 
 * quita_commentarios PROGRAMA_ORIGINAL PROGRAMA_LIMPIO 
 * 
 * Por ejemplo: 
 * 
 * quita_comentarios hola.java holav2.java 
 * 
 * crea un fichero con nombre holav2.java que contiene el código de hola.java pero sin los 
 * comentarios.
 * 
 * @author Javier Bernal Guerrero
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class Ejer05 {
  public static void main(String[] args) {
    try {
      String archivo = args[0];
      
      int t = archivo.length();                       //Recoge el tamaño del argumento.
      String nombre = archivo.substring(0, t - 5);    //Recoge todo el nombre, sin extension.
      String extension = archivo.substring(t - 5, t); //Recoge solo la extension, sin nombre.
      
      BufferedReader bf = new BufferedReader(new FileReader(archivo));
      BufferedWriter bw = new BufferedWriter(new FileWriter(
              nombre + "v2" + extension)); //Se agrega el nombre y la extension.
      
      String linea = "";
      
      while (linea != null) {
        System.out.println(linea);
        linea = bf.readLine();
        if (linea != null) {
          linea = linea.replace("//", "");
          linea = linea.replace("/*", "");
          linea = linea.replace("*/", "");
          bw.write(linea + "\n");
        }
      }
      
      bf.close();
      bw.close();
      
    } catch (FileNotFoundException e) { 
      System.out.println("No se encuentra el fichero.");
    
    } catch (IOException ioe) {
      System.out.println("No se ha podido escribir en el fichero.");
    
    }
  }
}
