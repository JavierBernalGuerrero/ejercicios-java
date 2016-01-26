/**
 * Escribe un programa que pida 10 números por teclado y que luego muestre los
 * números introducidos junto con las palabras “máximo” y “mínimo” al lado del
 * máximo y del mínimo respectivamente.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer05 {
  public static void main(String[] args) {
    System.out.println(" Maximo y Minimo dentro de un array");
    System.out.println("····································");
    
    int numMax = 0;
    int numMin = 99999999;
    
    int[] num;
    num = new int [10];
    
    for (int i = 0; i < 10; i++) {
      System.out.print("Introduce un numero: ");
      num[i] = Integer.parseInt (System.console().readLine());
    
      if (num[i] > numMax) {
        numMax = num[i];
      }
      if (num[i] < numMin) {
        numMin = num[i];
      }
    }
    
    System.out.print("Los numero introducidos son: ");
    
    for (int i = 0; i < 10; i++) {
      System.out.print(num[i] + " ");
      
    }
    System.out.print("\nEl numero maximo es el " + numMax + " y el minimo es " + numMin);
  }
}
