/**
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 * separados por espacios. Muestra también el máximo, el mínimo y la media de
 * esos números.
 *
 * @author Javier Bernal Guerrero
**/

public class Ejer05 {
  public static void main(String[] args) {
    System.out.println(" Numeros Enteros entre 100 y 199"); // 100 pisibles numeros
    System.out.println("·································");
    int numeroAleatorio = 0;
    int numeroMaximo = 0;
    int numeroMinimo = 0;
    int Media = 0;
    
    for (int i = 1; i <= 50; i++) {
      numeroAleatorio =(int)(Math.random() * 100) + 100; 
      System.out.print(numeroAleatorio + " ");
      
      if (numeroAleatorio > numeroMaximo) {                           // Maximo
        numeroMaximo = numeroAleatorio;
      }
      if ((numeroAleatorio < numeroMinimo) || (numeroMinimo == 0)) {   // Minimo
        numeroMinimo = numeroAleatorio;
      }
      Media += numeroAleatorio;
    }
    System.out.println();
    System.out.println("El mayor de los numeros es " + numeroMaximo);
    System.out.println("El minimo de los numeros es " + numeroMinimo);
    System.out.println("La media de los numeros es " + Media/50);
    
  }
}
