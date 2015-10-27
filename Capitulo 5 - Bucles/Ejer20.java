/**
 * Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide
 * hueca.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer20 {
  public static void main(String[] args) {

    System.out.println(" Dibujar una piramide");
    System.out.println("······················");
    System.out.print("Introduce la altura de la piramide: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce el simbolo para rellenar: ");
    String simbolo = System.console().readLine();
    
    String espacio = " ";
    int contador = 2;
    int contadorEspacio = altura - 2;
    int contadorFila = 1;
    
    for (int e = 0; e <= contadorEspacio; e++) {
        System.out.print(espacio);
    }
    System.out.println(simbolo);
    //contadorEspacio -= 1;
    
    while (contador < altura) {
      for (int e = 0; e < contadorEspacio; e++) {
        System.out.print(espacio);
      }
      System.out.print(simbolo);
      
      for (int i = 0; i < contadorFila; i++) {
        System.out.print(espacio);
      }
      System.out.println(simbolo);
      
      contadorEspacio -= 1;
      contadorFila += 2;
      contador++;
    }
    if (altura != 1) {
      contadorFila = (altura * 2) - 1;
      for (int i = 0; i < contadorFila; i++) {
        System.out.print(simbolo);
      }
    }
  }
}
