/**
 * Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos)
 * separados por espacios.
 *
 * @author Javier Bernal Guerrero
**/

public class Ejer04 {
  public static void main(String[] args) {
    System.out.println(" Numeros Enteros entre 0 y 10"); // 11 posibles numeros
    System.out.println("······························");
    String figura = " ";
    String palo = " ";
    for (int i = 1; i <= 20; i++) {
      System.out.print((int)(Math.random() * 11) + " ");
      
    }
  }
}
