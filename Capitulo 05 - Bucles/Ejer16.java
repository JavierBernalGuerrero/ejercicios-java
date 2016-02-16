/**
 * Escribe un programa que diga si un número introducido por teclado es o no
 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la
 * unidad.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer16 {
  public static void main(String[] args) {

    System.out.println(" Calculo de numeros primos");
    System.out.println("···························");
    System.out.print("Introduce un numero: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    int contador = 2;
    int moduloResultado = 1;
    int control = 0;            // 0 número primo, 1 no primo
                                            //  \/ = salta el bucle
    while ((contador < numeroIntroducido) && (control == 0)) {
      moduloResultado = numeroIntroducido % contador++;

      if (moduloResultado == 0) {
        control = 1;
        
      }
    }
    
    if (control == 1) {
      System.out.println("No es un numero primo.");
        
    } else {
      System.out.println("Si es un numero primo.");
    }
  }
}
