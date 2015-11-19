/**
 * Escribe un programa que lea un número n e imprima una pirámide de números
 * con n filas como en la siguiente figura:
 *    1
 *   121
 *  12321
 * 1234321
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer24 {
  public static void main(String[] args) {

    System.out.println(" Dibujar una piramide de numeros");
    System.out.println("·································");
    System.out.print("Introduce la altura de la piramide: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    String espacio = " ";
    int contador = 0;
    int contadorEspacio = altura - 1;   // Limita el numero de espacios
    int contadorFilaPositiva = 1;
    int contadorFilaNegativa = 0;
    
    while (contador < altura) {
      int numero = 0;
      int n = 0;
      
      for (int e = 0; e < contadorEspacio; e++) {
        System.out.print(espacio);
      } //Pinta espacios
      
      for (int i = 0; i < contadorFilaPositiva; i++) {
        numero++;
        System.out.print(numero);
      } //Pinta numeros, orden ascendente
      
      for (int i = contadorFilaNegativa; i > 0; i--) {
        numero--;
        System.out.print(numero);
      } //Pinta numeros, orden descendente
      
      System.out.println();
      
      contadorEspacio -= 1;
      contadorFilaPositiva += 1;
      contadorFilaNegativa += 1;
      contador++;
    }
  }
}
