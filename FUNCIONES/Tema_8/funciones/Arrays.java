/*
 * Funciones Varias
 *
 * @author Javier Bernal Guerrero
 */

package ejercicios.Tema_8.funciones;

public class Arrays {
  
  /**
   * Genera un array de tamaño n con números aleatorios cuyo
   * intervalo (mínimo y máximo) se indica como parámetro.
   * @param n define el tamaño del array
   * 
   * @param minimo define en rango minimo de los numeros aleatorios dentro
   *               del array
   * @param maximo define en rango maximo de los numeros aleatorios dentro
   *              del array
   * @return devuelve el array generado
   */
  
  public static int[] generaArrayInt (int n, int minimo, int maximo) {
    int[] arrayGenerado = new int[n];
    for (int x = 0; x < n; x++) {
      arrayGenerado[x] = (((int)(Math.random() * (maximo-minimo)) + minimo));
    }
    return arrayGenerado;
  }
  
  /**
   * 
   * @param arrayBuscarMinimo recoge el array donde queremos buscar el minimo.
   * @return devuelve el numero minimo
   */
  
  public static int minimoArrayInt (int arrayBuscarMinimo[]) {
    int minimo = Integer.MAX_VALUE;
    
    for (int n : arrayBuscarMinimo) { // for al estilo foreach
      if (n < arrayBuscarMinimo[n]) {
        minimo = arrayBuscarMinimo[n];
      }
    }
    return minimo;
  }
}
