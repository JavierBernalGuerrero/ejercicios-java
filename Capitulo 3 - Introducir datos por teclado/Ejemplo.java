/**
 *
 * 
 *@author Javier Bernal
 */

public class Ejemplo { // Clase principal 
  public static void main(String[] args) {
    String nombre;
    String numero;

    System.out.print("Por favor, dime como te llamas: ");
    nombre = System.console().readLine();
    System.out.println("Hola " + nombre + ", ¡encantado de conocerte!");


    System.out.println("Base imponible ");
    numero = System.console().readLine();
    int basImp;
    basImp = Integer.parseInt( numero );
    //int basImp = Integer.parseInt( Numero );
    System.out.println("I.V.A. " + 21 + "%");
    System.out.println("Precio total " + (((basImp * 21) / 100) + basImp) + "€");

  }
}
