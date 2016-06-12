/*
 *  
 *
 * @author Javier Bernal Guerrero
 */

package ejercicios.Tema_8;

import ejercicios.Tema_8.funciones.Arrays;

public class Ejer20_28 {
  public static void main(String[] args) {
    // generaArrayInt: Genera un array de tamaño n con números aleatorios cuyo
    // intervalo (mínimo y máximo) se indica como parámetro.
      int tamaño = 6;
      int nMinimo = 100;
      int nMaximo = 200;

      int nuevoArray[] = Arrays.generaArrayInt(tamaño, nMinimo, nMaximo);

      System.out.print("1.");
      for (int x = 0; x < tamaño; x++) {
        System.out.print("[" + nuevoArray[x] + "]");
        
      }
      
    // minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro.
      System.out.println("\n2.El valor minimo dentro del array es " + 
              Arrays.minimoArrayInt(nuevoArray) + ".");
      
    // maximoArrayInt: Devuelve el máximo del array que se pasa como parámetro.
      System.out.println("3.El valor maximo dentro del array es " + 
              Arrays.maximoArrayInt(nuevoArray) + ".");
      
    // mediaArrayInt: Devuelve la media del array que se pasa como parámetro.
      System.out.println("4.La media del array es " + 
              Arrays.mediaArrayInt(nuevoArray) + ".");
    // estaEnArrayInt: Dice si un número está o no dentro de un array.
      int numIntroducido = 101;
    
      System.out.print("5.El numero " + numIntroducido);
      if (Arrays.estaEnArrayInt(nuevoArray, numIntroducido)) {
        System.out.println(" si se encuentra en el array generado.");
      } else {
        System.out.println(" no se encuentra en el array generado.");
      }
      
    // estaEnArrayInt: Dice si un número está o no dentro de un array.
      System.out.println("6.El numero " + numIntroducido + " se encuentra en la "
              + "posicion " + Arrays.posicionEnArray(nuevoArray, numIntroducido)
              + ".");
      
    // volteaArrayInt: Le da la vuelta a un array.
      Arrays.voltea(nuevoArray);
      
      System.out.println("7.Si volteamos el array se queda:");
      for (int x = 0; x < tamaño; x++) {
        System.out.print("[" + nuevoArray[x] + "]");
        
      }
      
    // rotaDerechaArrayInt: Rota n posiciones a la derecha los números de un array.
      Arrays.rotaDerechaArrayInt(nuevoArray);
      
      System.out.println("\n8.Si rotamos el array a la derecha se queda:");
      for (int x = 0; x < tamaño; x++) {
        System.out.print("[" + nuevoArray[x] + "]");
        
      }
      
    // rotaIzquierdaArrayInt: Rota n posiciones a la izquierda los números de un array.
      Arrays.rotaIzquierdaArrayInt(nuevoArray);
      
      System.out.println("\n9.Si rotamos el array a la izquierda se queda:");
      for (int x = 0; x < tamaño; x++) {
        System.out.print("[" + nuevoArray[x] + "]");
        
      }
  }
}
