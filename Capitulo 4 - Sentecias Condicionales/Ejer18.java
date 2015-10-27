/**
 *Escribe un programa que diga cuál es la primera cifra de un número entero introducido
 *por teclado. Se permiten números de hasta 5 cifras.
 * 
 *@author Javier Bernal
 */

public class Ejer18 { 
  public static void main(String[] args) {
      
    System.out.println("Calcular la primera cifra de un numero entero");
    System.out.println("---------------------------------------------");
    System.out.print("Por favor, introduce el primer valor (maximo 5 cifras): ");
      int numero = Integer.parseInt (System.console().readLine());
      
    if ((numero >= 0) && (numero <= 99999)) {
      if ((numero >= 0) && (numero <= 9)) {
        System.out.print(numero % 10);
      }
      
      if ((numero >= 10) && (numero <= 99)) {
        System.out.print("El primer numero es " + (numero / 10) %10);
      }
      
      if ((numero >= 100) && (numero <= 999)) {
        System.out.print("El primer numero es " + (numero / 100) %10);
      }
      
      if ((numero >= 1000) && (numero <= 9999)) {
        System.out.print("El primer numero es " + (numero / 1000) %10);
      }
      
      if ((numero >= 10000) && (numero <= 99999)) {
        System.out.print("El primer numero es " + (numero / 10000) %10);
      }
      
    } else {
      System.out.print("El numero introducido no es valido");
    }
  }
}
