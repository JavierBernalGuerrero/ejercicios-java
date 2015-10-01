/**
 *Escribe un programa que sume, reste, multiplique y divida dos números introducidos por
 *teclado.
 * 
 *@author Javier Bernal
 */

public class Ejer04 { 
  public static void main(String[] args) {

    String numero;

    System.out.print("Introduce un numero ");
    numero = System.console().readLine();
    double numero1;
    numero1 = Double.parseDouble( numero );

    System.out.print("Introduce el segundo ");
    numero = System.console().readLine();
    double numero2;
    numero2 = Double.parseDouble( numero );
  
    System.out.println("Suma: " + (numero1 + numero2));
    System.out.println("Resta: " + (numero1 - numero2));
    System.out.println("Multiplicacion: " + (numero1 * numero2));
    System.out.println("Division: " + (numero1 / numero2));
  }
}
