/**
 * Realiza un programa que vaya generando números aleatorios pares entre 0 y
 * 100 y que no termine de generar números hasta que no saque el 24. El
 * programa deberá decir al final cuántos números se han generado.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer09 {
  public static void main(String[] args) {
    System.out.println(" Numeros Aleatorios");
    System.out.println("····················");
    
    int numeroAleatorio = 0;
    int contador = 0;

    while (numeroAleatorio != 24) {
      numeroAleatorio =(int)(Math.random() * 101);
      
      if (numeroAleatorio % 2 == 0) {
        contador++;
      }
    }
    System.out.println("¡Por fin! He tardado " + contador + " intentos para encontrar el 24");
  }
}
