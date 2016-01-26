/**
 * Realiza un programa que pida primero un número y a continuación un dígito.
 * El programa nos debe dar la posición (o posiciones) contando de izquierda a
 * derecha que ocupa ese dígito en el número introducido.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer26 {
  public static void main(String[] args) {

    System.out.println(" Contar posiciones de un numero");
    System.out.println("································");
    System.out.print("Introduce un numero: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce un digito: ");
    int digitoIntroducido = Integer.parseInt(System.console().readLine());

    int numeroReves = 0;
    int posicion = 1;
    
    System.out.println("El digito introducido se encuentra en las siguientes posiciones ");

    while (numeroIntroducido != 0) {
      numeroReves = (numeroReves * 10) + (numeroIntroducido % 10);
      numeroIntroducido = numeroIntroducido / 10;
      
    } // Le da la vuelta al numero introducido para contar la posicion del digito de manera eficaz
    
    while (numeroReves != 0) {
      if (numeroReves % 10 == digitoIntroducido) {
        System.out.print(posicion + " ");
        
      }
      numeroReves = numeroReves / 10;
      posicion++;
      
    } // Cuenta la posicion del digito
    

  }
}
