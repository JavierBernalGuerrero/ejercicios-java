/*
 * Funciones Arrays
 *
 * @author Javier Bernal Guerrero
 */

package ejercicios.Tema_8.funciones;

public class Arrays {
  
  /**
   * Genera un array de tamaño n con números aleatorios cuyo
   * intervalo (mínimo y máximo) se indica como parámetro.
   * 
   * @param n Define el tamaño del array
   * @param minimo Define en rango minimo de los numeros aleatorios dentro
   *               del array
   * @param maximo Define en rango maximo de los numeros aleatorios dentro
   *               del array
   * @return Devuelve el array generado
   */
  public static int[] generaArrayInt (int n, int minimo, int maximo) {
    int[] arrayGenerado = new int[n];
    for (int x = 0; x < n; x++) {
      arrayGenerado[x] = (((int)(Math.random() * ((maximo-minimo)+1)) + minimo));
    }
    return arrayGenerado;
  }
  
  /**
   * Devuelve el mínimo del array que se pasa como parámetro.
   * 
   * @param arrayIntroducido Recoge el array donde queremos buscar el minimo.
   * @return Devuelve el numero minimo
   */
  public static int minimoArrayInt (int arrayIntroducido[]) {
    int minimo = Integer.MAX_VALUE;
    
    for (int x = 0; x < arrayIntroducido.length; x++) {
      if (arrayIntroducido[x] < minimo) {
        minimo = arrayIntroducido[x];
      }
    }
    /*for (int n : arrayBuscarMinimo) { // for al estilo foreach
      if (n < arrayBuscarMinimo[n]) {
        minimo = arrayBuscarMinimo[n];
      }
    } REVISAR */
    return minimo;
  }
  
  /**
   * Devuelve el máximo del array que se pasa como parámetro.
   * 
   * @param arrayIntroducido Recoge el array donde queremos buscar el maximo.
   * @return Devuelve el numero maximo.
   */
  public static int maximoArrayInt (int arrayIntroducido[]) {
    int maximo = Integer.MIN_VALUE;
    
    for (int i = 0; i < arrayIntroducido.length; i++) {
      if (arrayIntroducido[i] > maximo) {
        maximo = arrayIntroducido[i];
      }
    }
    return maximo;
  }
  
  /**
   * Devuelve la media del array que se pasa como parámetro.
   * 
   * @param arrayIntroducido Recoge el array para realizar la media.
   * @return Devuelve la media
   */
  public static int mediaArrayInt (int arrayIntroducido[]) {
    int media = 0;
    
    for (int i = 0; i < arrayIntroducido.length; i++) {
      media += arrayIntroducido[i];
    }
    media = media / arrayIntroducido.length;
    return media;
  }
  
  /**
   * Dice si un número está o no dentro de un array.
   * 
   * @param arrayIntroducido Array donde queremos buscar el numero.
   * @param numIntroducido Numero que queremos buscar en el array.
   * @return Devuelve true si el numero se encuentra en el array. En caso 
   *         contrario, devuelve false.
   */
  public static boolean estaEnArrayInt (int arrayIntroducido[], int numIntroducido) {
    for (int i = 0; i < arrayIntroducido.length; i++) {
      if (arrayIntroducido[i] == numIntroducido) {
        return true;
      }
    }
    return false;
  }
  
  /**
   * Busca un número en un array y devuelve la posición (el índice) 
   * en la que se encuentra.
   * 
   * @param arrayIntroducido Array donde queremos buscar el numero.
   * @param numIntroducido Numero que queremos buscar en el array.
   * @return Devuelve la posicion donde se encuentra el numero en el array. 
   *         En caso de no encontrar el numero, devuelve un -1.
   */
  public static int posicionEnArray (int arrayIntroducido[], int numIntroducido) {
    int posicion = -1;
    
    for (int i = 0; i < arrayIntroducido.length; i++) {
      if (arrayIntroducido[i] == numIntroducido) {
        posicion = i;
      }
    }
    return posicion;
  }
  
  /**
   * Le da la vuelta a un array.
   * 
   * @param arrayIntroducido Introduce el array al cual queremos aplicar el 
   *                         volteo.
   */
  public static void voltea (int arrayIntroducido[]) {
    int limiteArray = arrayIntroducido.length - 1;
    int auxiliar;
    
    for (int i = 0; i <= limiteArray / 2; i++) { 
      auxiliar = arrayIntroducido[i];
      arrayIntroducido[i] = arrayIntroducido[limiteArray-i];
      
      arrayIntroducido[limiteArray-i] = auxiliar;
      
    } // Reducimos a la mitad el numero de iteracions porque se modifican 2 
      // valores a la vez. 
      // Primero almacenamos el primer valor en una variable auxiliar, luego
      // igualamos ese valor por el segundo valor y por ultimo igualamos
      // el segundo valor por el primero(que esta almacenado en la 
      // variable auxiliar.

  }
  
  /**
   * Rota n posiciones a la derecha los números de un array.
   * 
   * @param arrayIntroducido Introduce el array al cual queremos aplicar la 
   *                         rotacion a la derecha.
   */
  public static void rotaDerechaArrayInt (int arrayIntroducido[]) {
    int limiteArray = arrayIntroducido.length - 1;
    int auxiliar = arrayIntroducido[limiteArray];
    
    for (int i = limiteArray; i > 0; i--) { 
      arrayIntroducido[i] = arrayIntroducido[i-1];
      
    }
    arrayIntroducido[0] = auxiliar;
  }
  
  /**
   * Rota n posiciones a la izquierda los números de un array.
   * 
   * @param arrayIntroducido Introduce el array al cual queremos aplicar la 
   *                         rotacion a la izquierda.
   */
  public static void rotaIzquierdaArrayInt (int arrayIntroducido[]) {
    int limiteArray = arrayIntroducido.length - 1;
    int auxiliar = arrayIntroducido[0];
    
    for (int i = 0; i < limiteArray; i++) { 
      arrayIntroducido[i] = arrayIntroducido[i+1];
      
    }
    arrayIntroducido[limiteArray] = auxiliar;
  }
}
