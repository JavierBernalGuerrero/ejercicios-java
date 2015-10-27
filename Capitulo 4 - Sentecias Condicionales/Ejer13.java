/**
 *Escribe un programa que ordene tres números enteros introducidos por teclado.
 * 
 *@author Javier Bernal
 */

public class Ejer13 { 
  public static void main(String[] args) {
      
    System.out.println("Ordenar numeros");
    System.out.println("---------------");
    System.out.print("Por favor, introduce el primer valor: ");
      int valor1 = Integer.parseInt (System.console().readLine());

    System.out.print("Por favor, introduce el segundo valor: ");
      int valor2 = Integer.parseInt (System.console().readLine());
    
    System.out.print("Por favor, introduce el tercer valor: ");
      int valor3 = Integer.parseInt (System.console().readLine());
      
    System.out.print("Hola, " + valor1 + valor2 + valor3);
    
  }
}
