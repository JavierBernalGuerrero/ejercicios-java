/**
 * Modifica el programa anterior para que la probabilidad de que salga un 1
 * sea de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de
 * que salga 2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.
 *
 * @author Javier Bernal Guerrero
 */
 
//  3/6=1      2/6=X     1/6=2

public class Ejer08 {
  public static void main(String[] args) {
    System.out.println(" Quiniela Trucada");
    System.out.println("··················");
    
    int numeroAleatorio = 0;
    String apuesta = " ";
    int contadorLinea = 1;

    for (int i = 1; i <= 15; i++) {
      numeroAleatorio =((int)(Math.random() * 6) + 1);
      
      if ((numeroAleatorio >= 1) && (numeroAleatorio <= 3)) {
        apuesta = "[1| | ]";
      }

      if ((numeroAleatorio >= 4) && (numeroAleatorio <= 5)) {
        apuesta = "[ |X| ]";
      }

      if (numeroAleatorio == 6) {
        apuesta = "[ | |2]";
      }
      
      System.out.println("Apuesta linea..... " + contadorLinea++ + " \t " + apuesta);
    }
  }
}
