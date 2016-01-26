/**
 * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la
 * baraja de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 *
 * @author Javier Bernal Guerrero
**/

public class Ejer03 {
  public static void main(String[] args) {
    System.out.println(" Baraja Española");
    System.out.println("·················");
    String figura = " ";
    String palo = " ";
    int numeroAleatorio = ((int)(Math.random() * 10) + 1);

/** // FORMA SIMPLE
    switch (numeroAleatorio) {
      case 1:
        figura = "As";
      break;
      case 2:
        figura = "2";
      break;
      case 3:
        figura = "3";
      break;
      case 4:
        figura = "4";
      break;
      case 5:
        figura = "5";
      break;
      case 6:
        figura = "6";
      break;
      case 7:
        figura = "7";
      break;
      case 8:
        figura = "Sota";
      break;
      case 9:
        figura = "Caballo";
        break;
      case 10:
        figura = "Rey";
      break;
      default:
      
    } // Fin switch
**/
    // FORMA PRO
    switch (numeroAleatorio) {
      case 1:
        figura = "As";
      break;
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
        figura = String.valueOf(numeroAleatorio);
      break;
      case 8:
        figura = "Sota";
      break;
      case 9:
        figura = "Caballo";
      break;
      case 10:
        figura = "Rey";
      break;
      default:
      
    } // Fin Switch
    
    numeroAleatorio = ((int)(Math.random() * 4) + 1);

    switch (numeroAleatorio) {
      case 1:
        palo = "Bastos";
      break;
      case 2:
        palo = "Oros";
      break;
      case 3:
        palo = "Espadas";
      break;
      case 4:
        palo = "Copas";
      break;
      default:
      
    }

    System.out.println(" " + figura + " de " + palo);
    
  }
}
