package proyectos.Diccionarios.Ejercicio_10;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras 
 * (con su correspondiente traducción). Utiliza un objeto de la clase HashMap 
 * para almacenar las parejas de palabras. El programa pedirá una palabra en 
 * español y dará la correspondiente traducción en inglés.
 * 
 * @author Javier Bernal Guerrero
 */
public class Ejer10 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    String peticion = "";
    
    HashMap<String, String> diccionario = new HashMap();
    
    diccionario.put("uno", "one");
    diccionario.put("dos", "two");
    diccionario.put("tres", "three");
    diccionario.put("cuatro", "four");
    diccionario.put("cinco", "five");
    diccionario.put("seis", "six");
    diccionario.put("siete", "seven");
    diccionario.put("ocho", "eight");
    diccionario.put("nueve", "nine");
    diccionario.put("diez", "ten");
    diccionario.put("once", "eleven");
    diccionario.put("doce", "twelve");
    diccionario.put("trece", "thirteen");
    diccionario.put("catorce", "fourteen");
    diccionario.put("quince", "fifteen");
    diccionario.put("dieciseis", "sixteen");
    diccionario.put("diecisiete", "seventeen");
    diccionario.put("dieciocho", "eighteen");
    diccionario.put("dicinueve", "nineteen");
    diccionario.put("veinte", "twenty");
    
    System.out.println("Para cerrar el programa introduce un \".\".");
    System.out.println("===========================================");
    
    while (!peticion.equals(".")) {
      System.out.println("Introduce (en letras) un numero para ver su "
              + "correspondiente en ingles.");
      System.out.print("En Español: ");
      peticion = s.next();
      
      if (!peticion.equals(".")) {
        System.out.println("El equivalente en ingles es " + diccionario.get(peticion) + ".");
      } else {
        System.out.println("Pues adios...");
      }
    }
  }
}
