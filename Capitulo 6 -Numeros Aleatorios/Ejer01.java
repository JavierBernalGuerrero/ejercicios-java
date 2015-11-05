/**
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
 * también la suma total (los puntos que suman entre los tres dados).
 *
 * @author Javier Bernal Guerrero
**/

public class Ejer01 {
  public static void main(String[] args) {
    System.out.println(" Numeros Aleatorios");
    System.out.println("····················");
    int numeroAleatorio = 0;
    int sumaTotal = 0;
    
    for (int i = 1; i <= 3; i++) {
      numeroAleatorio = ((int)(Math.random() * 3) + 1);
      System.out.print(numeroAleatorio + " ");
      sumaTotal += numeroAleatorio;
      
    }
    System.out.println();
    System.out.print("La suma total es " + sumaTotal);
    
  }
}
