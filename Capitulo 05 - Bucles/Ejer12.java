/**
 * Escribe un programa que muestre los n primeros términos de la serie de 
 * Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo 
 * es 1 y el resto se calcula sumando los dos anteriores, por lo que tendríamos
 * que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... 
 * El número n se debe introducir por teclado.
 *
 * @author Javier Bernal Guerrero
 */

// 1 + 1 = 2
// a + b = c

// 1 + 2 = 3
// b + c = a

// 2 + 3 = 5
// c + a = b

public class Ejer12 {
  public static void main(String[] args) {

    System.out.println("Serie Fibonacci");
    System.out.println("················");
    System.out.print("¿Cuantos numeros quiere que muestre? ");
    int valorIntroducido = Integer.parseInt(System.console().readLine());

    int valorA = 0;
    int valorB = 1;
    int suma = 0;
    
    if (valorIntroducido == 1) {
      System.out.print("0");
    } else {
      System.out.print(valorA + " ");
      for (int i = 1; i < valorIntroducido; i++) {
        System.out.print(valorB + " ");
        suma = valorA + valorB;
        valorA = valorB;
        valorB = suma;
      }
    }
  }
}
