/**
 * Realiza un programa que sea capaz de ordenar alfabéticamente las palabras 
 * contenidas en un fichero de texto. El nombre del fichero que contiene las 
 * palabras se debe pasar como argumento en la línea de comandos. El nombre del 
 * fichero resultado debe ser el mismo que el original añadiendo la coletilla 
 * sort , por ejemplo palabras_sort.txt. Suponemos que cada palabra ocupa una 
 * línea.
 * 
 * @author Javier Bernal Guerrero
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Ejer04 {
  public static void main(String[] args) {
    try {
      String archivo = args[0];
      
      int t = archivo.length();                       //Recoge el tamaño del argumento.
      String nombre = archivo.substring(0, t - 4);    //Recoge todo el nombre, sin extension.
      String extension = archivo.substring(t - 4, t); //Recoge solo la extension, sin nombre.
      
      BufferedReader bf = new BufferedReader(new FileReader(archivo));
      BufferedWriter bw = new BufferedWriter(new FileWriter(
              nombre + "_sort" + extension)); //Se agrega el nombre y la extension.
      
      String linea = "";
      ArrayList<String> palabras = new ArrayList<String>();
      
      while (linea != null) {
        palabras.add(linea);
        System.out.println(linea);
        linea = bf.readLine();
      }
      
      
      Collections.sort(palabras);
      
      for (int i = 0; i < palabras.size(); i++) {
        linea = palabras.get(i);
        bw.write(linea + "\n");
      }
      
      bf.close();
      bw.close();
      
    } catch (FileNotFoundException e) { 
      System.out.println("No se encuentra el fichero prueba.txt");
    
    } catch (IOException ioe) {
      System.out.println("No se ha podido escribir en el fichero.");
    
    }
  }
}
