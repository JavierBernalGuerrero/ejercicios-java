/**
 *Realiza un programa que diga si un número entero positivo introducido por teclado es
 *capicúa. Se permiten números de hasta 5 cifras.
 * 
 *@author Javier Bernal
 */

public class Ejer20 { 
  public static void main(String[] args) {
      
    System.out.println("Calcular la primera cifra de un numero entero");
    System.out.println("---------------------------------------------");
    System.out.print("Por favor, introduce el primer valor (maximo 5 cifras): ");
      int numero = Integer.parseInt (System.console().readLine());
      
    if ((numero >= 0) && (numero <= 99999)) {                                   //dos digitos
      if ((numero >= 10) && (numero <= 99)) {
        int valor1 = ((numero / 10) %10);
        int valor2 = numero %10;
          if (valor1 == valor2) {
            System.out.println ("El numero introducido es capicúa");
          } else {
            System.out.println ("El numero introducido no es capicúa");
          }
      }
      
      if ((numero >= 100) && (numero <= 999)) {                                 //tres digitos
        int valor1 = ((numero / 100) %10);
        int valor2 = numero %10;
          if (valor1 == valor2) {
            System.out.println ("El numero introducido es capicúa");
          } else {
            System.out.println ("El numero introducido no es capicúa");
          }
      }
      
      if ((numero >= 1000) && (numero <= 9999)) {                               //cuatro digitos
      //cifras exteriores  
        int valor1 = ((numero / 1000) %10);
        int valor4 = numero %10;
        
      //cifras interiores
        int valor3 = ((numero / 100) %10);
        int valor2 = ((numero / 10) %10);
          if ((valor1 == valor4) && (valor2 == valor3)) {
            System.out.println ("El numero introducido es capicúa");
          } else {
            System.out.println ("El numero introducido no es capicúa");
          }
      }
      
      if ((numero >= 10000) && (numero <= 99999)) {                             //cinco digitos
      //cifras exteriores  
        int valor1 = ((numero / 10000) %10);
        int valor4 = numero %10;
        
      //cifras interiores
        int valor3 = ((numero / 1000) %10);
        int valor2 = ((numero / 10) %10);
          if ((valor1 == valor4) && (valor2 == valor3)) {
            System.out.println ("El numero introducido es capicúa");
          } else {
            System.out.println ("El numero introducido no es capicúa");
          }
      }
      
    } else {
      System.out.print("El numero introducido no es valido");
    }
  }
}
