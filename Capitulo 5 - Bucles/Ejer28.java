/**
 * Escribe un programa que calcule el factorial de un número entero leído por
 * teclado.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer28 {
  public static void main(String[] args) {

    System.out.println(" Calcular factoriales");
    System.out.println("······················");
    System.out.print("Introduce un numero positivo que no sea 0: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    int factorial = numeroIntroducido;
    
    for (int i = 1; i < numeroIntroducido ; i++) {
      factorial *= i;
    }
    System.out.print(factorial);
  }
}
