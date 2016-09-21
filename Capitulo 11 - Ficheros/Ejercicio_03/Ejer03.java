/**
 * Escribe un programa que guarde en un fichero el contenido de otros dos 
 * ficheros, de tal forma que en el fichero resultante aparezcan las líneas de 
 * los primeros dos ficheros mezcladas, es decir, la primera línea será del 
 * primer fichero, la segunda será del segundo fichero, la tercera será la 
 * siguiente del primer fichero, etc.
 * 
 * Los nombres de los dos ficheros origen y el nombre del fichero destino se 
 * deben pasar como argumentos en la línea de comandos.
 * 
 * Hay que tener en cuenta que los ficheros de donde se van cogiendo las 
 * líneas pueden tener tamaños diferentes.
 * 
 * @author Javier Bernal Guerrero
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejer03 {
  public static void main(String[] args) 
    throws InterruptedException {
    
      if (args.length != 3) {
        System.out.println("El numero de argumentos no es valido.");
        System.exit(-1);
      }
      
      try {
        BufferedReader bf1 = new BufferedReader(new FileReader(args[0]));
        BufferedReader bf2 = new BufferedReader(new FileReader(args[1]));
        BufferedWriter bw = new BufferedWriter(new FileWriter(args[2]));

        String linea1 = "";
        String linea2 = "";

        while (linea1 != null && linea2 != null) {
          linea1 = bf1.readLine();
          linea2 = bf2.readLine();

          if (linea1 != null) {
            bw.write(linea1 + "\n");
          }
          
          if (linea2 != null) {
            bw.write(linea2 + "\n");
          }
        }

        bf1.close();
        bf2.close();
        bw.close();

        System.out.print("Operación resuelta con exito.\nCerrando aplicación.");
          Thread.sleep(800);
          
        System.out.print(".");
          Thread.sleep(800);
          
        System.out.print(".\n");
          Thread.sleep(800);


    } catch (FileNotFoundException e) { 
      System.out.println("No se encuentra el fichero.");

    } catch (IOException ioe) {
      System.out.println("No se ha podido escribir en el fichero.");
      System.err.println(ioe.getMessage());

    }
  }
}
