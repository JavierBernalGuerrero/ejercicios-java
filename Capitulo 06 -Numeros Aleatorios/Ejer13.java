/**
 * Escribe un programa que simule la tirada de dos dados. El programa deberá
 * continuar tirando los dados una y otra vez hasta que en alguna tirada los
 * dos dados tengan el mismo valor.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer13 {
  public static void main(String[] args) {
    System.out.println(" Doble tirada de dados");
    System.out.println("·······················");
    
    int dado1 = 0;
    int dado2 = 1;
    int contador = 0;

    while (dado1 != dado2) {
      dado1 = ((int)(Math.random() * 6) + 1);
      System.out.print(dado1 + " y ");

      dado2 = ((int)(Math.random() * 6) + 1);
      System.out.println(dado2);
      
      contador++;
      
    }
    System.out.println("El dado se a lanzado " + contador + " veces.");
  }
}
