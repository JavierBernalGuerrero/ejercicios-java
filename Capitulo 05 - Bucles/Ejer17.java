/**
 * Realiza un programa que sume los 100 números siguientes a un número entero y
 * positivo introducido por teclado. Se debe comprobar que el dato introducido
 * es correcto (que es un número positivo).
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer17 {
  public static void main(String[] args) {

    System.out.println(" Calculo de numeros primos");
    System.out.println("···························");
    System.out.print("Introduce un numero: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    int control = 0;
    
    do {
      System.out.println("Numero: " + numeroIntroducido++);
      
      control++;
    } while (control <= 100);
    
  }
}
