/**
 * Realiza un programa que haga justo lo contrario a lo que hace el ejercicio
 * 6. El programa intentará adivinar el número que estás pensando - un número
 * entre 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido,
 * el programa debe preguntar si el número que estás pensando es mayor o menor
 * que el que te acaba de decir.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer14 {
  public static void main(String[] args) {
    System.out.println(" Adivinar Numeros entre 0 y 100");
    System.out.println("··································");
    
    boolean esCorrecto = false;
    int numeroIntentos = 4;
    int rangoMaximo = 100;
    int rangoMinimo = 0;
    String respuesta = " ";
    int numeroAleatorio =(int)(Math.random() * 101);
    
    System.out.print("Introduce un numero, te prometo que no miro: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    for (int i = 1; i <= 5 && esCorrecto != true; i++) {
      numeroAleatorio = ((int)(Math.random() * (rangoMaximo - rangoMinimo)) + rangoMinimo);   //ALGORITMO DE BUSQUEDA
      
      if (numeroIntroducido == numeroAleatorio) {
        System.out.print("¡JUAS JUAS JUAS!¡LO LOGRE PRINGAO!");
        esCorrecto = true;                                                     // Fin del programa. EXITO
        
      } else {
        
        System.out.print("¿Es mayor o menor que el " + numeroAleatorio + "? ");
        respuesta = System.console().readLine().toLowerCase();
        
        if (respuesta.equals ("mayor")) {
          if (numeroAleatorio < numeroIntroducido) {
            rangoMinimo = numeroAleatorio + 1;
            System.out.print(" ...seguro que por poco.");
          } else {
            System.out.print("¡MENTIROSO! ¡YA NO JUEGO!");
            esCorrecto = true;
          }
        }
        
        if (respuesta.equals ("menor")) {
          if (numeroAleatorio > numeroIntroducido) {
            rangoMaximo = numeroAleatorio - 1;
            System.out.print(" ...seguro que por poco.");
          } else {
            System.out.print("¡MENTIROSO! ¡YA NO JUEGO!");
            esCorrecto = true;
          }
          
        }
        if (numeroIntentos == 0) {
          System.out.println(" Esto no a terminado, ya nos veremos.");         // Fin del programa. FALTA DE INTENTOS
          
        } else {
          System.out.println(" Me quedan " + numeroIntentos + " que llevo la cuenta.");
          
        }
        numeroIntentos--;
        
      } // Fin de else ganador
    } // Fin de bucle for
    
    
  }
}
