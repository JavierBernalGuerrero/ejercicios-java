/**
 *Realiza un programa que nos diga cuántos dígitos tiene un número entero que puede ser
 *positivo o negativo. Se permiten números de hasta 5 dígitos.
 * 
 *@author Javier Bernal
 */

public class Ejer19 { 
  public static void main(String[] args) {
    
    System.out.println("Calculo de unidades de un numero");
    System.out.println("--------------------------------");
    System.out.print("Por favor, introduce un numero entero (maximo 5 cifras): ");
    int numero = Integer.parseInt (System.console().readLine());

    int cifras = 0;
    
    if ((numero >= -99999) && (numero <= 99999))  {
      if ((numero >= 0) && (numero <= 9) || (numero <= 0) && (numero >= -9))  {
        cifras = 1;
      }
      
      if ((numero >= 10) && (numero <= 99) || (numero <= -10) && (numero >= -99)) {
        cifras = 2;
      }
      
      if ((numero >= 100) && (numero <= 999) || (numero <= -100) && (numero >= -999)) {
        cifras = 3;
      }
      
      if ((numero >= 1000) && (numero <= 9999) || (numero <= -1000) && (numero >= -9999)) {
        cifras = 4;
      }
      
      if ((numero >= 10000) && (numero <= 99999) || (numero <= -10000) && (numero >= -99999)) {
        cifras = 5;
      }

      System.out.printf("El numero introducido tiene " + cifras + " cifras");

    } else {
      System.out.print("El numero introducido no es valido.");
    }
    
  }
}
