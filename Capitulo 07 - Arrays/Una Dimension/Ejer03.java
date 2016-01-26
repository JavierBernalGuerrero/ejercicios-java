/**
 * Escribe un programa que lea 10 números por teclado y que luego los muestre
 * en orden inverso, es decir, el primero que se introduce es el último en
 * mostrarse y viceversa.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer03 {
  public static void main(String[] args) {
    System.out.println(" Array Inverso");
    System.out.println("···············");
    
    int[] num;          // Define "simbolo" como array de numeros enteros
    num = new int [10];   // Reserva "espacio" para el array
    
    for (int i = 0; i < 10; i++) {
      System.out.print("Introduce un numero: ");
      num[i] = Integer.parseInt (System.console().readLine());
    
    }
    for (int i = 9; i >= 0; i--) {
      System.out.print(num[i] + " ");
      
    }
  }
}
