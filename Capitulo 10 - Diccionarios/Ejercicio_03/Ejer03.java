
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
    
    ArrayList<Integer> numeros = new ArrayList();
    
    for (int i = 0; i < 10; i++) {
      System.out.print("Escribe el " + (i + 1) + "º numero: ");
      numeros.add(s.nextInt());
    }
    
    int aux = 1; // SOLO SIRVE PARA UTILIZAR UN INDICE A LA HORA DE MOSTRARLO
    
    System.out.println("Numeros sin ordenar:");
    for (int n : numeros) {
      System.out.println(aux + ". " + n); // MUESTRA UN INDICE Y UN VALOR
      aux++;
    }
    
    System.out.println("\n");
    Collections.sort(numeros);
    
    aux = 1;
    System.out.println("Numeros ordenados:");
    for (int n : numeros) {
      System.out.println(aux + ". " + n);
      aux++;
    }
    
    // Y AHORA UNA ORDENACION INVERSA
    Collections.sort(numeros, Collections.reverseOrder()); // UTILIZAMOS ESTA SOBRECARGA PARA INVERTIR LA ORDENACION
    
    System.out.println("Numeros ordenados de forma inversa:");
    for (int n : numeros) {
      System.out.println(aux + ". " + n);
      aux++;
    }
  }
}
