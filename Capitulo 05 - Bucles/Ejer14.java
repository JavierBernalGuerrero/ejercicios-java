/**
 * Escribe un programa que pida una base y un exponente (entero positivo) 
 * y que calcule la potencia.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer14 {
  public static void main(String[] args) {

    System.out.println(" Calculo de potencias");
    System.out.println("······················");
    System.out.print("Introduce la base: ");
    int base = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce el exponente: ");
    int exponente = Integer.parseInt(System.console().readLine());
    
    int resultado = base;
    int control = 1;

    do {
      resultado = resultado * base;

      control++;
      
    } while (exponente > control);
    
    System.out.println(resultado);
  }
}
