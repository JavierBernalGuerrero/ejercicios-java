/**
 * Bucle while que termina cuando se introduce por teclado un
 * número negativo.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejemplo {
  public static void main(String[] args) {
    System.out.println("Por favor, vaya introduciendo números y pulsando INTRO.");
    System.out.println("Para terminar, introduzca un número negativo.");
    
    int numero;
    
    do {
      System.out.print("Dime un número: ");
      numero = Integer.parseInt(System.console().readLine());
      
      if (numero % 2 == 0) {                                            // comprueba si el número introducido es par
        System.out.println("Qué bonito es el " + numero);
      } else {
        System.out.println("No me gustan los números impares.");
        
        System.out.print("¿Quieres seguir jugando? (s/n) ");            // pregunta para continuar
        String respuesta = System.console().readLine().toLowerCase();
        System.out.println("--------------------------------");
        
        if (respuesta.equals("s")) {
          numero = 2;                                                   // reinicia el bucle
        } else {
          System.out.println("Tu te lo pierdes, adiós.");
        }
      }
    
    } while (numero % 2 == 0);
  }
}
