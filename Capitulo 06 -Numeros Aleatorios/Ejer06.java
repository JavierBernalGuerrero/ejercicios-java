/**
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario
 * debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
 * fallido, el programa dirá cuántas oportunidades quedan y si el número
 * introducido es menor o mayor que el número secreto.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer06 {
  public static void main(String[] args) {
    System.out.println(" Adivinar Numeros entre 0 y 100");
    System.out.println("··································");
    
    int numeroIntroducido = 0;
    int numeroIntentos = 4;
    int numeroAleatorio =(int)(Math.random() * 101);
    
    System.out.print("Introduce un numero: ");

    for (int i = 1; i <= 5; i++) {
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      if (numeroIntroducido == numeroAleatorio) {
        System.out.print("¡LO LOGRASTE! ");
        i = 6;
      } else {
        if (numeroIntroducido < numeroAleatorio) {
          System.out.println("Estoy pensando en un numero mayor.");

        }
        if (numeroIntroducido > numeroAleatorio) {
          System.out.println("Estoy pensando en un numero menor.");

        }
        if (numeroIntentos == 0) {
          System.out.println("Te has quedado sin intentos.");
          
        } else {
          System.out.println("El numero introducido no es correcto. " +
                                              "Te quedan " + numeroIntentos);
          System.out.print("Introduce otro numero: ");
        }
        numeroIntentos--;
        
      } // Fin de else ganador
    } // Fin de bucle for
    
    System.out.println("El numero que estaba pensando era " + numeroAleatorio);
  }
}
