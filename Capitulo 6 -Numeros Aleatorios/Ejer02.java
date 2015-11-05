/**
 * Realiza un programa que muestre al azar el nombre de una carta de la baraja
 * francesa. Esta baraja está dividida en cuatro palos: picas, corazones,
 * diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9
 * cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A
 * (que sería el 1). Para convertir un número en una cadena de caracteres
 * podemos usar String.valueOf(n) .
 *
 * @author Javier Bernal Guerrero
**/

public class Ejer02 {
  public static void main(String[] args) {
    System.out.println(" Baraja Francesa");
    System.out.println("·················");
    String figura = " ";
    String palo = " ";
    int numeroAleatorio = ((int)(Math.random() * 13) + 1);

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
        figura = "8";
      break;
      case 9:
        figura = "9";
        break;
      case 10:
        figura = "10";
      break;
      case 11:
        figura = "J";
      break;
      case 12:
        figura = "Q";
      break;
      case 13:
        figura = "K";
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
      case 8:
      case 9:
      case 10:
        figura = String.valueOf(numeroAleatorio);
      break;
      case 11:
        figura = "J";
      break;
      case 12:
        figura = "Q";
      break;
      case 13:
        figura = "K";
      break;
      default:
      
    } // Fin Switch
    
    numeroAleatorio = ((int)(Math.random() * 4) + 1);

    switch (numeroAleatorio) {
      case 1:
        palo = "Corazones";
      break;
      case 2:
        palo = "Picas";
      break;
      case 3:
        palo = "Diamantes";
      break;
      case 4:
        palo = "Treboles";
      break;
      default:
      
    }

    System.out.println(" " + figura + " de " + palo);
    
  }
}
