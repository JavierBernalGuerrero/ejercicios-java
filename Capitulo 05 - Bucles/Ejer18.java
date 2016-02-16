/**
 * Escribe un programa que obtenga los números enteros comprendidos entre dos
 * números introducidos por teclado y validados como distintos, el programa
 * debe empezar por el menor de los enteros introducidos e ir incrementando de
 * 7 en 7.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer18 {
  public static void main(String[] args) {

    System.out.println(" Calcular numeros");
    System.out.println("··················");
    System.out.print("Introduce un numero: ");
    int valor1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el segundo numero: ");
    int valor2 = Integer.parseInt(System.console().readLine());
    
    if (valor1 > valor2) {
      int valor3 = valor1;
      valor1 = valor2;
      valor2 = valor3;
      
    }
    if (valor1 == valor2) {
      System.out.println("Los numeros no pueden ser iguales.");

    } else {
      System.out.print(valor1);
      
      while ((valor1 < valor2) && ((valor1 + 7) < valor2)) {
        valor1 = valor1 + 7;
        System.out.print(" - " + valor1);

      }
    }
  }
}
