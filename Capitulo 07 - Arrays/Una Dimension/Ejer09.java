/**
 * Realiza un programa que pida 8 números enteros y que luego muestre esos
 * números junto con la palabra “par” o “impar” según proceda.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer09 {
  public static void main(String[] args) {
      
    System.out.println(" Numeros Pares e Impares");
    System.out.println("·························");
    
    //////////////// Recogida de datos /////////////////////
    
    int[] numeroIntroducido;
    numeroIntroducido = new int [8];
      
    for (int i = 0; i < 8; i++) {
      System.out.print("Introduce un numero: ");
      numeroIntroducido[i] = Integer.parseInt (System.console().readLine());
    
    }
      
    ////////////////////////////////////////////////////////
    
    for (int i = 0; i < 8 ; i++) {
      System.out.print("El numero " + numeroIntroducido[i] + " es ");
      if (numeroIntroducido[i] % 2 == 0) {
        System.out.println("par.");
      } else {
        System.out.println("impar.");
      }
    }
  }
}
