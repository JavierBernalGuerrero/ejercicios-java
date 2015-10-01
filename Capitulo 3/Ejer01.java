/**
 *Realiza un programa que pida dos números y que luego muestre el resultado de su
 *multiplicación.
 * 
 *@author Javier Bernal
 */

public class Ejer01 { 
  public static void main(String[] args) {

    String numero;

    System.out.print("Introduce un numero ");
    numero = System.console().readLine();
    int numero1;
    numero1 = Integer.parseInt( numero );

    System.out.print("Introduce el segundo ");
    numero = System.console().readLine();
    int numero2;
    numero2 = Integer.parseInt( numero );
    
    System.out.print("Resultado: " + (numero1 * numero2));
  }
}
