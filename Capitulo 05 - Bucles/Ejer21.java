/**
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un
 * numero negativo y nos diga cuantos números se han introducido, la media de
 * los impares y el mayor de los pares. El número negativo sólo se utiliza para
 * indicar el final de la introducción de datos pero no se incluye en el
 * cómputo.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer21 {
  public static void main(String[] args) {

    System.out.println(" Operaciones Varias");
    System.out.println("····················");

    int numeroIntroducido = 1;
    int contadorNumerico = -1;
    int numeroImpar = 0;
    int numeroPar = 0;
    int contadorMedia = 0;
    
    while (numeroIntroducido > 0) {
      System.out.print("Introduce un numero: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
  
      if ((numeroIntroducido % 2 != 0) && (numeroIntroducido > 0)){
        numeroImpar = numeroImpar + numeroIntroducido;
        
        contadorMedia++;
      }
      
      if ((numeroIntroducido % 2 == 0) && (numeroPar < numeroIntroducido)) {
        numeroPar = numeroIntroducido;
      }
      
      contadorNumerico++;
    } 

    System.out.println("····························");
    System.out.println("Numeros Introducidos: " + contadorNumerico);
    System.out.println("Media de numeros impares: " + numeroImpar / contadorMedia);
    System.out.println("El mayor de los numeros pares: " + numeroPar);

  }
}
