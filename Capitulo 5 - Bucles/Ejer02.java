/**
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer02 {
  public static void main(String[] args) {

    System.out.println("Todos los multiplos de 5 del 0 al 100");
    
    int resultado = 0;
    int incremento = 1;
    
    while (resultado < 100) {
      
      resultado = 5 * incremento++;
      System.out.println(resultado);
    }
  }
}
