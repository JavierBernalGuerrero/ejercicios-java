
package proyectos.Diccionarios.Ejercicio_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * Realiza un programa equivalente al anterior pero en esta ocasión, el 
 * programa debe ordenar palabras en lugar de números.
 * 
 * @author Javier Bernal Guerrero
 */
public class Ejer04 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    ArrayList<String> palabra = new ArrayList();
    
    for (int i = 0; i < 10; i++) {
      System.out.print("Escribe la " + (i + 1) + "º palabra: ");
      palabra.add(s.next());
    }
    
    int aux = 1;
    
    for (String n : palabra) {
      System.out.println(aux + ". " + n);
      aux++;
    }
    
    System.out.println("\n");
    Collections.sort(palabra);
    
    aux = 1;
    for (String n : palabra) {
      System.out.println(aux + ". " + n);
      aux++;
    }
  }
}
