/**
 *  Realiza un programa que pida 10 números por teclado y que los almacene en
 * un array. A continuación se mostrará el contenido de ese array junto al
 * índice (0 – 9). Seguidamente el programa pedirá dos posiciones a las que
 * llamaremos “inicial” y “final”. Se debe comprobar que inicial es menor que
 * final y que ambos números están entre 0 y 9. El programa deberá colocar el
 * número de la posición inicial en la posición final, rotando el resto de
 * números para que no se pierda ninguno. Al final se debe mostrar el array
 * resultante.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer12 {
  public static void main(String[] args) {
      
    System.out.println(" Ordenar Array");
    System.out.println("·························");
    
    int posInicial = 0;
    int posFinal = 0;
    
    //////////////// Recogida de datos /////////////////////
    
    int[] numIntroducido;
    numIntroducido = new int [10];
    
    for (int i = 0; i < 10; i++) {
      System.out.print("Introduce un numero: ");
      numIntroducido[i] = Integer.parseInt (System.console().readLine());
    
    }
    
    ////////////////////////////////////////////////////////
    
    System.out.println("\nArray Original: \t");
    
    for (int i = 0; i < 10; i++) {
      System.out.println("[" + i + "] " + numIntroducido[i]);
    }
    
    //////////// Recoger y comprobar peticiones ////////////
    
    boolean esCorrecto = false;
    
    while (!esCorrecto) {
      
      System.out.print("\nPosicion Inicial: ");
      posInicial = Integer.parseInt (System.console().readLine());
      
      System.out.print("Posicion Final: ");
      posFinal = Integer.parseInt (System.console().readLine());
      
      if (posInicial < posFinal) {
        esCorrecto = true;
        
      } else {
        System.out.println("Los valores introducidos no son validos. Vuelve a intentarlo.");
        System.out.println("·····························································");
        
      }
    }
    
    //////////////////////////////////////////////////////
    
    System.out.println("\nArray Ordenado: \t");
    
    int[] numResultado;
    numResultado = new int [10];
    
    for (int i = 0; i < 10; i++) {
      numResultado[i] = numIntroducido[i];
    
    }
    
    /////////// ORDENAR NUMEROS - ASCENDENTE ////////////
    
    int auxiliar = numResultado[9];
    
    for (int i = 9; i > 0; i--) {
      numResultado[i] = numResultado[i-1];
  
    }
    
    numResultado[0] = auxiliar;
    
    /////////////////////////////////////////////////////
    
    numResultado[posFinal] = numIntroducido[posInicial];
    
    
    for (int i = 0; i < 10; i++) {
      if ((i > posInicial) && (i < posFinal)) {
        numResultado[i] = numIntroducido[i];
      }
      System.out.println("[" + i + "] " + numResultado[i]);
    
    }
  }   
}
