/**
 * Realiza un programa que diga si un número introducido por teclado es par y/o
 * divisible entre 5.
 * 
 *@author Javier Bernal
 */

public class Ejer14 { 
  public static void main(String[] args) {
      
    System.out.println(" Par y/o divisible entre 5");
    System.out.println("···························");
    System.out.print("Por favor, introduce el primer valor: ");
    int numeroIntroducido = Integer.parseInt (System.console().readLine());
    
    if (numeroIntroducido % 2 == 0) {
      System.out.print("El numero introducido es par ");
    } else {
      System.out.print("El numero introducido es impar ");
    }
    if (numeroIntroducido % 5 == 0) {
      System.out.print("y es divisible entre 5");
    } else {
      System.out.print("y no es divisible entre 5");
    }
  }
}
