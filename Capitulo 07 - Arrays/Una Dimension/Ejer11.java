/**
 *  Realiza un programa que pida 10 números por teclado y que los almacene en un
 * array. A continuación se mostrará el contenido de ese array junto al índice
 * (0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
 * primos a las primeras posiciones, desplazando el resto de números (los que
 * no son primos) de tal forma que no se pierda ninguno. Al final se debe
 * mostrar el array resultante.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer11 {
  public static void main(String[] args) {
      
    System.out.println(" Ordenar Prmos");
    System.out.println("·························");
    
    //////////////// Recogida de datos /////////////////////
    
    int[] numIntroducido;
    numIntroducido = new int [10];
      
    for (int i = 0; i < 10; i++) {
      System.out.print("Introduce un numero: ");
      numIntroducido[i] = Integer.parseInt (System.console().readLine());
    
    }
      
    ////////////////////////////////////////////////////////
    
    int[] resultado;
    resultado = new int [10];
    
    int posicionArrayResultado = 0;
    
    System.out.println("Array Original: \t");
    
    for (int i = 0; i < 10; i++) {
      System.out.println("[" + i + "] " + numIntroducido[i]);
    }
    
    for (int i = 0; i < 10; i++) {
      
      //////////////// DETECTA NUMEROS PRIMOS ///////////////
      int contador = 2;
      int esPrimo = 1;
      
      while ((contador < numIntroducido[i]) && (esPrimo != 0)) {
        esPrimo = numIntroducido[i] % contador;
        contador++;
      }
      
      ///////////////////////////////////////////////////////
      
      if (esPrimo != 0) {
        resultado[posicionArrayResultado] = numIntroducido[i];
        posicionArrayResultado++;
      }
    }
    
    for (int i = 0; i < 10; i++) {
      
      //////////////// DETECTA NUMEROS PRIMOS ///////////////
      
      int contador = 2;
      int esPrimo = 1;
      
      while ((contador < numIntroducido[i]) && (esPrimo != 0)) {
        esPrimo = numIntroducido[i] % contador;
        contador++;
      }
      
      ///////////////////////////////////////////////////////
      
      if (esPrimo == 0) {
        resultado[posicionArrayResultado] = numIntroducido[i];
        posicionArrayResultado++;
      }
    }
  
    System.out.println("Array Ordenado: \t");
    
    for (int i = 0; i < 10; i++) {
      System.out.println("[" + i + "] " + resultado[i]);
    }
  }
}
