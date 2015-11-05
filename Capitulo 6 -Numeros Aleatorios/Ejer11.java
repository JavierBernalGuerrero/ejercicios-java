/**
 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
 * aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente.
 * Al final aparecerá el número de suspensos, el número de suficientes, el
 * número de bienes, etc.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer11 {
  public static void main(String[] args) {
    System.out.println(" Las notas, tu veras que alegria...");
    System.out.println("····································");
    
    String puntuacion = " ";
    int notaAleatoria = 0;
    int contadorSuspenso = 0;
    int contadorSuficiente = 0;
    int contadorBien = 0;
    int contadorNotable = 0;
    int contadorSobresaliente = 0;

    for (int i = 1; i <= 20; i++) {
      notaAleatoria = ((int)(Math.random() * 5) + 1);
      
      switch (notaAleatoria) {
        case 1:
          puntuacion = "suspenso";
          contadorSuspenso++;
          break;
        case 2:
          puntuacion = "suficiente";
          contadorSuficiente++;
          break;
        case 3:
          puntuacion = "bien";
          contadorBien++;
          break;
        case 4:
          puntuacion = "notable";
          contadorNotable++;
          break;
        case 5:
          puntuacion = "sobresaliente";
          contadorSobresaliente++;
          break;
        default:
          break;
      }
      System.out.println(puntuacion);
    } // Fin bucle for
      
    System.out.println("Se han producido " + contadorSuspenso + " suspensos.");
    System.out.println("Se han producido " + contadorSuficiente + " suficientes.");
    System.out.println("Se han producido " + contadorBien + " bienes.");
    System.out.println("Se han producido " + contadorNotable + " notables.");
    System.out.println("Se han producido " + contadorSobresaliente + " sobresalientes.");
  }
}
