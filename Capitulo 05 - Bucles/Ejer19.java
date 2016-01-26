/**
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
 * pedir por teclado. El carácter con el que se pinta la pirámide también se
 * debe pedir por teclado.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer19 {
  public static void main(String[] args) {

    System.out.println(" Dibujar una piramide");
    System.out.println("······················");
    System.out.print("Introduce la altura de la piramide: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce el simbolo para rellenar: ");
    String simbolo = System.console().readLine();
    
    String espacio = " ";
    int contador = 0;
    int contadorEspacio = altura - 1;   // Limita el numero de espacios
    int contadorFila = 1;
    
    while (contador < altura) {
      for (int e = 0; e < contadorEspacio; e++) {
        System.out.print(espacio);
      }
      
      
      for (int i = 0; i < contadorFila; i++) {
        System.out.print(simbolo);
      }
      System.out.println();
      
      contadorEspacio -= 1;
      contadorFila += 2;
      contador++;
    }
  }
}
