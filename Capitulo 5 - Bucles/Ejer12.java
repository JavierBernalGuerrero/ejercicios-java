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
// a + b = c  | c = a + b

// 1 + 2 = 3
// b + c = a

// 2 + 3 = 5
// c + a = b

public class Ejer12 {
  public static void main(String[] args) {

    System.out.println("Seria Fibonacci");
    System.out.println("················");
    System.out.print("¿Cuantos numeros quiere que muestre? ");
    int valorIntroducido = Integer.parseInt(System.console().readLine());
    int control = 0;
    int terminoA = 0;
    int terminoB = 1;
    int terminoC = 0;

    do {
      terminoC = terminoA + terminoB;
      //System.out.printf("%d + %d = %d\n" , terminoA , terminoB , terminoC);
      System.out.print(terminoC + ", ");
      
      terminoA = terminoB + terminoC;
      //System.out.printf("%d + %d = %d\n" , terminoB , terminoC , terminoA);
      System.out.print(terminoA + ", ");
      
      terminoB = terminoC + terminoA;
      //System.out.printf("%d + %d = %d\n" , terminoC , terminoA , terminoB);
      System.out.print(terminoB + ", ");
      
      control++;
      
    } while (valorIntroducido > control);
    System.out.print("... ");
    
  }
}
