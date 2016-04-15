
package proyectos.Diccionarios.Ejercicio_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * Escribe un programa que ordene 10 números enteros introducidos por teclado y
 * almacenados en un objeto de la clase ArrayList.
 * 
 * @author Javier Bernal Guerrero
 */
public class Ejer03 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    ArrayList<Integer> numero = new ArrayList();
    
    for (int i = 0; i < 10; i++) {
      System.out.print("Escribe el " + (i + 1) + "º numero: ");
      numero.add(s.nextInt());
    }
    
    int aux = 1;
    
    for (int n : numero) {
      System.out.println(aux + ". " + n);
      aux++;
    }
    
    System.out.println("\n");
    Collections.sort(numero);
    
    aux = 1;
    for (int n : numero) {
      System.out.println(aux + ". " + n);
      aux++;
    }
  }
}
