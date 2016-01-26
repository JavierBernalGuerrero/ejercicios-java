/**
 * Escribe un programa que lea una lista de diez números y determine 
 * cuántos son positivos, y cuántos son negativos.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer13 {
  public static void main(String[] args) {

    System.out.println(" Contar numeros negativos y positivos");
    System.out.println("······································");
    int numeroNegativo = 0;
    int numeroPositivo = 0;
    int control = 0;
    int cantidad = 1;
    do {
      System.out.print("Introduce el " + cantidad++ + "º numero entero, positivo o negativo: ");
      int numeroIntroducido = Integer.parseInt(System.console().readLine());
      if (numeroIntroducido < 0) {
        numeroNegativo++;
      } else {
        numeroPositivo++;
      }
      control++;
    } while (control < 10);
    System.out.print("Has introducido " + numeroPositivo + " numero positivos y "
     + numeroNegativo + " numero negativos");
  }
}
