package proyectos.Diccionarios.Ejercicio_11;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * Realiza un programa que escoja al azar 5 palabras en español del 
 * mini-diccionario del ejercicio anterior. El programa irá pidiendo que el 
 * usuario teclee la traducción al inglés de cada una de las palabras y 
 * comprobará si son correctas. Al final, el programa deberá mostrar cuántas 
 * respuestas son válidas y cuántas erróneas.
 * 
 * @author Javier Bernal Guerrero
 */
public class Ejer11 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int numAleatorio;
    int aciertos = 0;
    String textoIntroducido = "";
    
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
    
//    diccionario.entrySet().toArray(); // Convierte en array los pares clave/valor
//    diccionario.keySet().toArray();   // Convierte en array SOLO las claves
//    diccionario.values().toArray();   // Convierte en array SOLO los valores
    
    // SE ALMACENAN TODAS LAS POSIBLES CLAVES EN UN ARRAY PARA AGILIZAR LA EXTRACCION DEL NUMERO ALEATORIO
//    String[] claves = new String[diccionario.size()];
//    claves = diccionario.keySet().toArray(claves); // *.toArray(claves); le tenemos que indicar la escturcutra que queremos, por eso ponemos claves, porque queremos la misma estructura que para claves, es decir, String[]
    
    // OTRA OPCION SERIE - by LUIS
    String[] claves = diccionario.keySet().toArray(new String[0]); // Con esto creamos un array de diccionario, y como valor para .toArray mandamos un array de String.
    
    // Las formas anteriores valen para cualquier conversion de .toArray()
    
    System.out.println("Para cerrar el programa introduce un \".\".");
    System.out.println("===========================================");
    
    for (int i = 0; (i < 5) && (!textoIntroducido.equals(".")); i++) { // PARA PODER SALIR DEL BUCLE
      numAleatorio = (int)(Math.random() * 20);
      
      System.out.print("Introduce (en letras) la traduccion correspondiente a \"" + claves[numAleatorio] + ": ");
      textoIntroducido = s.next();
      
      if (textoIntroducido.equals(diccionario.get(claves[numAleatorio]))) {
        System.out.println("Respuesta correcta.\n");
        aciertos++;
      } else {
        System.out.println("Respuesta incorrecta.");
        System.out.println("El equivalente en ingles es " + diccionario.get(claves[numAleatorio]) + ".\n");
      }
      
      if (textoIntroducido.equals(".")) {
        System.out.println("Pues adios...");
      }
    }
    System.out.println("Traducciones correctas: " + aciertos);
    System.out.println("Traducciones erroneas: " + (5-aciertos));
  }
}
