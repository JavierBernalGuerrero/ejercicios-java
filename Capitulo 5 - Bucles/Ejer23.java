/**
 * Escribe un programa que permita ir introduciendo una serie indeterminada de
 * números mientras su suma no supere el valor 10000. Cuando esto último ocurra,
 * se debe mostrar el total acumulado, el contador de los números introducidos
 * y la media.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer23 {
  public static void main(String[] args) {

    System.out.println(" Suma de numeros");
    System.out.println("·················");
    
    int numeroIntroducido = 0;
    int resultado = 0;
    int contador = 0;
    
    while (resultado < 10000) {
      System.out.print("Introduce un numero: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      resultado += numeroIntroducido;
      
      contador++;
      
    }
    System.out.println("Suma total: " + resultado);
    System.out.println("Numeros Introducidos: " + contador);
    System.out.println("Media de numeros introducidos: " + (double)resultado / contador);

  }
}
