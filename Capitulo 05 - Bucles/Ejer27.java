/**
 * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay entre 1 y un número
 * leído por teclado.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer27 {
  public static void main(String[] args) {

    System.out.println(" Calcular multiplos de 3");
    System.out.println("·························");
    System.out.print("Introduce un numero: ");
    int limiteIntroducido = Integer.parseInt(System.console().readLine());
    
    int multiplo = 3;
    int contador = 0;
    int suma = 0;
    
    while ((multiplo + 3) < limiteIntroducido) {
      contador++;
      multiplo = 3 * contador;
      System.out.print((multiplo) + " ");
      suma = suma + multiplo;

    }
    System.out.print("\nEntre el 1 y el " + limiteIntroducido + " hay " + contador + 
                                        " multiplos de 3 y la suma total de ellos es " + suma);

  }
}
