/**
 * Escribe un programa que pinte una pirámide rellena con un carácter
 * introducido por teclado que podrá ser una letra, un número o un símbolo como
 * *, +, -, $, &, etc. El programa debe permitir al usuario mediante un menú
 * elegir si el vértice de la pirámide está apuntando hacia arriba, hacia abajo,
 * hacia la izquierda o hacia la derecha.
 * 
 *@author Javier Bernal
 */

public class Ejer15 { 
  public static void main(String[] args) {
      
    System.out.println(" Piramide");
    System.out.println("··········");
    System.out.print("Por favor, introduce un simbolo para pintar la piramide: ");
    String simbolo = System.console().readLine();
    
    System.out.println("Existen varias opciones para el vertice");
    System.out.println(" a. Arriba \n b. Abajo \n c. Izquierda \n d. Derecha");
    System.out.print("Elige el lado para el vertice: ");
    
    String opcion = System.console().readLine().toLowerCase();
    
    if (opcion.equals ("a")) {
      System.out.println("        " + simbolo );
      System.out.println("       " + simbolo + simbolo + simbolo);
      System.out.println("      " + simbolo + simbolo + simbolo + simbolo + simbolo);
    }
    if (opcion.equals ("b")) {
      System.out.println("      " + simbolo + simbolo + simbolo + simbolo + simbolo);
      System.out.println("       " + simbolo + simbolo + simbolo);
      System.out.println("        " + simbolo );
    }
    if (opcion.equals ("c")) {
      System.out.println("        " + simbolo);
      System.out.println("       " + simbolo + simbolo);
      System.out.println("      " + simbolo + simbolo + simbolo);
      System.out.println("       " + simbolo + simbolo);
      System.out.println("        " + simbolo);
    }
    if (opcion.equals ("d")) {
      System.out.println("       " + simbolo);
      System.out.println("       " + simbolo + simbolo);
      System.out.println("       " + simbolo + simbolo + simbolo);
      System.out.println("       " + simbolo + simbolo);
      System.out.println("       " + simbolo);
    }
  }
}
