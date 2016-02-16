/**
 * Realiza un programa que sume los 100 números siguientes a un número entero y
 * positivo introducido por teclado. Se debe comprobar que el dato introducido
 * es correcto (que es un número positivo).
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer17 {
  public static void main(String[] args) {

    System.out.println(" Calcular numeros");
    System.out.println("··················");
    System.out.print("Introduce un numero entero positivo: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    int suma = 0;
    
    if (numeroIntroducido > 0) {    
      for (int i = 1; i <= 100; i++) {
        suma += numeroIntroducido++;
        
      }
      System.out.println("La suma de sus 100 siguientes numeros es " + suma);
      
    } else {
      System.out.println("El numero introducido no es positivo");
      
    }
  }
}
