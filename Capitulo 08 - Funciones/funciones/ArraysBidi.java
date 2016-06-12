/*
 * Funciones Arrays Bidimensionales
 *
 * @author Javier Bernal Guerrero
 */

package ejercicios.Tema_8.funciones;

public class ArraysBidi {
  
  /**
   * Genera un array de tamaño n x m con números aleatorios cuyo intervalo 
   * (mínimo y máximo) se indica como parámetro.
   * 
   * @param nFilas Numero de filas que tendra el array generado.
   * @param nColumnas Numero de columnas que tendra el array generado.
   * @param nMinimo Intervalo minimo de los numeros que tendra el array generado.
   * @param nMaximo Intervalo maximo de los numeros que tendra el array generado.
   * @return Devuelve el array bidimensional generado.
   */
  public static int[][] generaArrayBiInt (int nFilas, int nColumnas, int nMinimo, int nMaximo) {
    int[][] arrayBiGenerado = new int[nFilas][nColumnas];
    for (int y = 0; y < nFilas; y++) {
      for (int x = 0; x < nColumnas; x++) {
        arrayBiGenerado[y][x] = (((int)(Math.random() * ((nMaximo-nMinimo)+1)) + nMinimo));
        
      }
    }
    return arrayBiGenerado;
  }
  
  /**
   * Devuelve la fila i-ésima del array que se pasa como parámetro.
   * 
   * @param arrayBi Array bidimensional del cual se quiere extraer la fila.
   * @param nFilaEscogido Numero de fila escogido para extraer del array 
   *                      bidimesional.
   * @return Devuelve, en forma de array, la fila escogida.
   */
  public static int[] filaDeArrayBiInt (int arrayBi[][], int nFilaEscogido) {
    int[] arrayFila = new int[arrayBi[0].length];
    
    for (int y = 0; y < arrayBi.length; y++) {
      for (int x = 0; ((x < arrayFila.length) && (y == nFilaEscogido)); x++) {
        arrayFila[x] = arrayBi[y][x];
        
      }
    }
    return arrayFila;
  }
  
  /**
   * Devuelve la columna j-ésima del array que se pasa como parámetro.
   * 
   * @param arrayBi Array bidimensional del cual se quiere extraer la columna.
   * @param nColumnaEscogido Numero de columna escogido para extraer del array 
   *                         bidimesional.
   * @return Devuelve, en forma de array, la columna escogida.
   */
  public static int[] columnaDeArrayBiInt (int arrayBi[][], int nColumnaEscogido) {
    int[] arrayColumna = new int[arrayBi.length];
    
    for (int y = 0; y < arrayColumna.length; y++) {
      for (int x = 0; x < arrayBi[0].length; x++) {
        if (x == nColumnaEscogido) {
          arrayColumna[y] = arrayBi[y][x];
        }
      }
    }
    return arrayColumna;
  }
  
  /**
   * Devuelve la fila y la columna (en un array con dos elementos) de la 
   * primera ocurrencia de un número dentro de un array bidimensional. Si el 
   * número no se encuentra en el array, la función devuelve el array {-1, -1}.
   * 
   * @param arrayBi Array bidimensional del cual se quiere extraer las 
   *                coordenadas del numero.
   * @param nIntroducido Numero del cual queremos extraer las coordenadas.
   * @return Devuelve las coordenadas del numero dentro del array bidimensional.
   */
  public static int[] coordenadasEnArrayBiInt (int arrayBi[][], int nIntroducido) {
    int[] coordenadasNumero = {-1, -1};
    
    for (int y = 0; ((y < arrayBi.length) && (coordenadasNumero[0] == -1)); y++) {
      for (int x = 0; x < arrayBi[0].length; x++) {
        if (arrayBi[y][x] == nIntroducido) {
          coordenadasNumero[0] = y;
          coordenadasNumero[1] = x;
        }
      }
    }
    return coordenadasNumero;
  }
  
  /**
   * Dice si un número es o no punto de silla, es decir, mínimo en su fila y 
   * máximo en su columna.
   * 
   * @param arrayBi Array bidimensional del cual queremos averiguar si es o no 
   *                punto de silla.
   * @param coordenadaY El numero de la fila que corresponde al numero que 
   *                    queremos averiguar si es o no punto de silla.
   * @param coordenadaX El numero de la columna que corresponde al numero que 
   *                    queremos averiguar si es o no punto de silla.
   * @return Devuelve true si es punto de silla, por el contrario, si no lo 
   *         es devuelve false.
   */
  public static boolean esPuntoDeSilla (int arrayBi[][], int coordenadaY, int coordenadaX) {
    boolean esPunSilla = false;
    int minFila = Integer.MAX_VALUE;
    int maxColum = Integer.MIN_VALUE;
    
    for (int y = 0; y < arrayBi.length; y++) {
      for (int x = 0; x < arrayBi[0].length; x++) {
        if (arrayBi[coordenadaY][x] < minFila) {
          minFila = arrayBi[coordenadaY][x];
        } // Busca el minimo en la fila.
      }
      if (arrayBi[y][coordenadaX] > maxColum) {
          maxColum = arrayBi[y][coordenadaX];
      } // Busca el maximo en la columna.
    }
    
    if ((arrayBi[coordenadaY][coordenadaX] == minFila) && 
                (arrayBi[coordenadaY][coordenadaX] == maxColum)) {
          esPunSilla = true;
    } // Comprueba si es o no punto de silla.
    
    return esPunSilla;
  }
  
  public static int[] diagonal (
          int arrayBi[][], int coordenadaY, int coordenadaX, String direccion) {
    int[] diagonal = new int [0]; // COMPROBAR SI ESTE VALRO SE BORRA.
    int tamañoArray = 1;
    
    
    if (direccion.equals("nose")) {
      
      for (int x = 0; ((coordenadaY > 0) && coordenadaX > 0); x++) {
        coordenadaY -= 1;
        coordenadaX -= 1;
      } // Comprueba el inicio de la diagonal.
      
      for (int i = 0; ((coordenadaY + i <= arrayBi.length) &&
              coordenadaX + i <= arrayBi[0].length); i++) {
        tamañoArray = i;
      } // Coge el tamaño de la diagonal. Se suba i (numero de iteraciones) 
        // para no modificar el punto de partida de la diagonal.
      
      diagonal = new int[tamañoArray]; // Crea el array.
      
      for (int i = 0; i < tamañoArray; i++) {
        diagonal[i] = arrayBi[coordenadaY][coordenadaX];
        coordenadaY++;
        coordenadaX++;
      } // Introduce los valores de la diagonal en el array.
      
    } // DIAGONAL NOSE = "NOROESTE - SURESTE".
    
    if (direccion.equals("neso")) {
      
      for(int x = 0;((coordenadaY > 0) && (coordenadaX < arrayBi[0].length - 1)); x++) {
        coordenadaY -= 1;
        coordenadaX += 1;
      } // Comprueba el inicio de la diagonal. 
      
      for (int i = 0; ((coordenadaY + i <= arrayBi.length) &&
              coordenadaX - i >= -1); i++) { // Ponemos -1 porque si le damos el valor 0 no entraria en el bucle.
        tamañoArray = i;
      } // Coge el tamaño de la diagonal. Se suba i (numero de iteraciones) 
        // para no modificar el punto de partida de la diagonal.
      
      diagonal = new int[tamañoArray]; // Crea el array.
      
      for (int i = 0; i < tamañoArray; i++) {
        diagonal[i] = arrayBi[coordenadaY][coordenadaX];
        coordenadaY++;
        coordenadaX--;
      } // Introduce los valores de la diagonal en el array.
      
    } // DIAGONAL NESO = "NORESTE - SUROESTE".
    
    
    return diagonal;
  }
  
  /**
   * Comprueba si el borde del array bidimensional es homogeneo.
   * 
   * @param arrayBi Array bidimensional del cual queremos averiguar si tiene  
   *                o no el borde homogeneo.
   * @return Devuelve true si el borde es homogeneo. Por el contrario, si no 
   *         lo es, devuelve false.
   */
  public static boolean bordeHomogeneo (int arrayBi[][]) {
    boolean esHomogeneo = false;
    int numBorde = arrayBi[0][0];
    int limiteBordeDerecha = arrayBi[0].length -1;
    int limiteBordeInferior = arrayBi.length -1;
    
    for (int y = 0; y < arrayBi.length; y++) {
      for (int x = 0; x < arrayBi[0].length; x++) {
        if ((arrayBi[0][x] == numBorde) &&                      // Fila Superior
                (arrayBi[limiteBordeInferior][x] == numBorde)&& // Fila Inferior
                (arrayBi[y][0] == numBorde) &&                  // Colum Izquierda
                (arrayBi[y][limiteBordeDerecha] == numBorde)) { // Colum Derecha
          esHomogeneo = true;
        }
      }
    }
    return esHomogeneo;
  }
}
