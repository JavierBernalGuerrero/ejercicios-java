/**
 * Escribe un programa que lea 15 números por teclado y que los almacene en un
 * array. Rota los elementos de ese array, es decir, el elemento de la posición
 * 0 debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se
 * encuentra en la última posición debe pasar a la posición 0. Finalmente,
 * muestra el contenido del array.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer06 {
  public static void main(String[] args) {
    System.out.println(" Desordenar numeros en array");
    System.out.println("·····························");
    
    int auxiliar;
    
    int[] num;
    num = new int [15];
    
    for (int i = 0; i < 15; i++) {
      System.out.print("Introduce un numero: ");
      num[i] = Integer.parseInt (System.console().readLine());
    
    } // Bucle para introducir numeros en un array
    
    System.out.print("Los numero introducidos desordenados: ");
    
    //////////////////////// DESORDENAR NUMEROS /////////////////////
    
    auxiliar = num[14]; // Almacena la posicion del ultimo numero

    for (int i = 14; i > 0; i--) {
      num[i] = num[i-1];
  
    } // Bucle de Desorden Ascendente
    
    num[0] = auxiliar; //Escribe la posicion del ultimo numero, guardado previamente
    
    /////////////////////////////////////////////////////////////////
    
    for (int i = 0; i < 15; i++) {
      System.out.print(num[i] + " ");
      
    } // Bucle para mostrar numeros desordenados
  }
}
