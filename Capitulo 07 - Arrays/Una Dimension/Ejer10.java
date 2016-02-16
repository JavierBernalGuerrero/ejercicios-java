/**
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
 * y que los almacene en un array. El programa debe ser capaz de pasar todos
 * los números pares a las primeras posiciones del array (del 0 en adelante) y
 * todos los números impares a las celdas restantes. Utiliza arrays auxiliares
 * si es necesario.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer10 {
  public static void main(String[] args) {
      
    System.out.println(" Ordenar Pares e Impares");
    System.out.println("·························");
    
    //////////////// Recogida de datos /////////////////////
    
    int[] numAleatorio;
    numAleatorio = new int [20];
      
    for (int i = 0; i < 20; i++) {
      numAleatorio[i] = (int)(Math.random() * 101);
    
    }
      
    ////////////////////////////////////////////////////////
    
    System.out.println("Array Original: \t");
    
    for (int i = 0; i < 20; i++) {
      System.out.print(numAleatorio[i] + " ");
    
    }
    
    int posicion = 0;
    
    int[] numParImpar;
    numParImpar = new int [20];

    for (int i = 0; i < 20; i++) {
      if (numAleatorio[i] %2 == 0) {
        numParImpar[posicion] = numAleatorio[i];
        posicion++;
      }
    }
    for (int i = 0; i < 20; i++) {
      if (numAleatorio[i] %2 != 0) {
        numParImpar[posicion] = numAleatorio[i];
        posicion++;
      }
    }
    
    System.out.println("\n\nArray Ordenado: \t");
    
    for (int i = 0; i < 20; i++) {
      System.out.print(numParImpar[i] + " ");
    
    }
  }
}
