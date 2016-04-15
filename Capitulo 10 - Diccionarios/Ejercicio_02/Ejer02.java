
package proyectos.Diccionarios.Ejercicio_02;

import java.util.ArrayList;

/**
 *
 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de
 * esos números. El tamaño de la lista también será aleatorio y podrá oscilar
 * entre 10 y 20 elementos ambos inclusive.
 * 
 * @author Javier Bernal Guerrero
 */
public class Ejer02 {
  public static void main(String[] args) {
    
    int total = 0;
    int media = 0;
    int minimo = Integer.MAX_VALUE;
    int maximo = Integer.MIN_VALUE;
    
    
    int tamaño = (int)(Math.random() * 10) + 10;
    
    ArrayList<Integer> numAleatorio = new ArrayList();
    
    for (int i = 0; i < tamaño; i++) {
      numAleatorio.add((int)(Math.random() * 100));
    }
    
    int aux = 1;
    
    for (int n : numAleatorio) {
      System.out.println(aux + ". " + n);
      aux++;
    }
    
    // SUMA
    for (int n : numAleatorio) {
      total += n;
    }
    System.out.println("La suma total de su contenido es: " + total + ".");
    
    // MEDIA
    for (int n : numAleatorio) {
      media += n;
    }
    media /= numAleatorio.size();
    System.out.println("La media de su contenido es: " + media + ".");
    
    // MINIMO
    for (int n : numAleatorio) {
      if (minimo >= n) {
        minimo = n;
      }
    }
    System.out.println("El valor minimo es " + minimo + ".");
    
    // MAXIMO
    for (int n : numAleatorio) {
      if (maximo <= n) {
        maximo = n;
      }
    }
    System.out.println("El valor maximo es " + maximo + ".");
             
  }
}
