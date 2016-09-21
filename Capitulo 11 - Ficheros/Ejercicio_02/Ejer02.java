/**
 * Realiza un programa que lea el fichero creado en el ejercicio anterior y 
 * que muestre los números por pantalla.
 * 
 * @author Javier Bernal Guerrero
 */
package Ficheros.Ejercicio_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejer02 {
  public static void main(String[] args) {
    try {
      BufferedReader bf = new BufferedReader(new FileReader(
              "/home/alumno/NetBeansProjects/Ejercicios/src/Ficheros/Ejercicio_01/prueba.txt"));
      BufferedWriter bw = new BufferedWriter(new FileWriter(
              "/home/alumno/NetBeansProjects/Ejercicios/src/Ficheros/Ejercicio_02/prueba.txt"));
      
      String linea = "";
      
      while (linea != null) {
        linea = bf.readLine();
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
