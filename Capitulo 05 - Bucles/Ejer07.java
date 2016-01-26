/**
 * Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras.
 * El programa nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el
 * mensaje “Lo siento, esa no es la combinación” y si acertamos se nos dirá “La caja fuerte se
 * ha abierto satisfactoriamente”. Tendremos cuatro oportunidades para abrir la caja fuerte.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer07 {
  public static void main(String[] args) {

    int error = 0;
    int codigo = 0;

    System.out.println("Acceso a caja fuerte ");
    System.out.println("·····················");

    do {
      System.out.print("Introduce la combinacion (4 cifras): ");
      codigo = Integer.parseInt(System.console().readLine());
      
      
          // CONTROLAR VALORES NEGATIVOS Y SUPERIOR O INFERIOR A 4 CIFRAS
      
      
      if (codigo != 1111) {
        System.out.println("La combinación introducida es incorrecta.");
        error++;                                                          // Control de intentos
        if (error == 4) {
          System.out.println("Lo siento, esa no es la combinación.");
        }
      } else {
        System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
        error = 5;
      }
    } while (error < 4);
    
  }
}
