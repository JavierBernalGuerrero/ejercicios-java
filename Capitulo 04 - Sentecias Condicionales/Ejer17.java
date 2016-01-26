/**
 *Escribe un programa que diga cuál es la última cifra de un número entero
 *introducido por teclado.
 *
 *@author Javier Bernal
 */

public class Ejer17 {
  public static void main(String[] args) {

    System.out.println("Calculo de unidades");
    System.out.println("-------------------");
      
    System.out.print("Introduce un numero: ");
    int numero = Integer.parseInt(System.console().readLine());

    int unidades = numero % 10;

    System.out.print("La unidad del numero introducido es: " + unidades);

  }
}
