/**
 * Escribe un programa que muestre tres apuestas de la quiniela en tres
 * columnas para los 14 partidos y el pleno al quince (15 filas).
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer07 {
  public static void main(String[] args) {
    System.out.println(" Quiniela");
    System.out.println("··········");
    
    int numeroAleatorio = 0;
    String apuesta = " ";
    int contadorLinea = 1;

    for (int i = 1; i <= 15; i++) {
      numeroAleatorio =((int)(Math.random() * 3) + 1);
      
      switch (numeroAleatorio) {
        case 1:
          apuesta = "[1| | ]";
          break;
        case 2:
          apuesta = "[ |X| ]";
          break;
        case 3:
          apuesta = "[ | |2]";
          break;
        default:
          break;
      }
      System.out.println("Apuesta linea..... " + contadorLinea++ + " \t " + apuesta);
    }
  }
}
