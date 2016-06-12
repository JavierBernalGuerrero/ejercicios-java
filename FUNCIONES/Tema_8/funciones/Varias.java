/*
 * Funciones Varias
 *
 * @author Javier Bernal Guerrero
 */

package ejercicios.Tema_8.funciones;

public class Varias {
  public static void main(String[] args) {
    
    
  }
  
  
    // esCapicua
    /**
     * Devuelve verdadero si el número que se pasa como parámetro es capicúa y
     * falso en caso contrario.
     * 
     * Un número capicúa es el que se lee igual de izquierda a derecha que de
     * derecha a izquierda.
     * 
     * @param   numIntroducido número del que se quiere saber si es capicúa
     * @return  verdadero si el número que se pasa como parámetro es capicúa y
     *          falso en caso contrario
     */
  public static boolean esCapicua (int numIntroducido) {
    int numReves = 0;
    int numIntroducidoOriginal = numIntroducido;
    
    while (numIntroducido != 0) {
      numReves = (numReves * 10) + (numIntroducido % 10);
      numIntroducido = numIntroducido / 10;
      
    }
    if (numIntroducidoOriginal == numReves) {
      return true;
    }
    return false;
  }
  
    // esPrimo
    /**
     * Devuelve verdadero si el número que se pasa como parámetro es primo y 
     * falso en caso contrario.
     * Un número es primo cuando es divisible únicamente entre el mismo y 
     * entre 1.
     *
     * @param   numIntroducido número del que se quiere saber si es primo
     * @return  true si el número que se pasa como parámetro es primo y false
     *          en caso contrario
     */
  public static boolean esPrimo (int numIntroducido) {
    for (int x = 2; x < (numIntroducido / 2); x++) {
      if (numIntroducido % x == 0) {
        return true;
      }
    }
    return false;
  }
  
  /**
   * Devuelve el siguiente numero primo al numero introducido.
   * 
   * @param numIntroducido el numero a partir del cual queremos buscar el primo
   * @return Devuelve el proximo numero primo
   */
  public static int siguientePrimo (int numIntroducido) {
    
    boolean esPrimo;
    int posiblePrimo = numIntroducido;
    
    do {
      esPrimo = true; // Reinicia el bucle. Partiendo de que cualquier numero 
                      // es primo hasta que el bucle for demuestre lo contrario.
      posiblePrimo++;
      for (int x = 2; (x < (posiblePrimo / 2)) && (esPrimo); x++) {
        if (posiblePrimo % x == 0) {
          esPrimo = false; // NO ES PRIMO
        }
      }
      
    } while (!esPrimo);
    return posiblePrimo;
  } //////////////////////// RETOCAR ////////////////////////////////////////////////////////////////
  
  /**
   * Dada una base y un exponente devuelve la potencia.
   * 
   * @param base Base del numero para resolver.
   * @param exponente.
   * @return Devuelve el resultado.
   */
  public static int potencia (int base, int exponente) {
    int contador = 1;
    int resultado = 1;
    
    do {
      resultado *= base;
      contador++;
    } while (contador <= exponente);
    return resultado;
  }
  
  /**
   * Cuenta el número de dígitos de un número entero.
   * 
   * @param numIntroducido numero del cual queremos contar el numero de digitos.
   * @return Devuelve el numero de digitos del numero.
   */
  public static int digitos (int numIntroducido) {
    int contadorDigitos = 1;
    
    while (numIntroducido >= 10) {
      numIntroducido /= 10;
      contadorDigitos++;
    }
    
    return contadorDigitos;
  }
  /**
   * Le da la vuelta a un número.
   * 
   * @param numIntroducido numero del cual queremos darle la vuelta.
   * @return numero volteado.
   */
  public static int voltea (int numIntroducido) {
    int numReves = 0;
    
    while (numIntroducido != 0) {
      numReves = (numReves * 10) + (numIntroducido % 10);
      numIntroducido = numIntroducido / 10;
      
    }
    return numReves;
  }
  
  /**
   * Devuelve el dígito que está en la posición n de un número entero. 
   * Se empieza contando por el 0 y de izquierda a derecha.
   * 
   * @param numIntroducido Numero a partir del cual vamos a buscar la posicion.
   * @param posicionIntroducida Posicion que estamos pidiendo del numero.
   * @return Devuelve el digito que se encuentra en la posicion que pedimos.
   */
  public static int digitoN (int numIntroducido, int posicionIntroducida) {
    int numeroReves = 0;
    int posicion = 0;
    int resultado = 0;
    
    while (numIntroducido != 0) {
      numeroReves = (numeroReves * 10) + (numIntroducido % 10);
      numIntroducido = numIntroducido / 10;
      
    } // Si le damos la vuelta al numero, podemos calcular su posicion exacta.
    
    while (posicion <= posicionIntroducida) {
      if (posicion == posicionIntroducida) {
        resultado = numeroReves % 10;
      }
      numeroReves = numeroReves / 10;
      posicion++;
      
      }
    return resultado;
  }
  
  /**
   * Da la posición de la primera ocurrencia de un dígito dentro de un 
   * número entero. Si no se encuentra, devuelve -1.
   * 
   * @param numIntroducido Numero donde vamos a buscar la posicion del digito.
   * @param digitoIntroducido Digito del que queremos conocer su posicion
   * @return Devuelve la posicion del digito. Si no se encuentra el digito 
   *         introducido, devolvemos un -1.
   */
  public static int posicionDeDigito (int numIntroducido, int digitoIntroducido) {
    int numeroReves = 0;
    int posicion = 0;
    
    while (numIntroducido != 0) {
      numeroReves = (numeroReves * 10) + (numIntroducido % 10);
      numIntroducido = numIntroducido / 10;
      
    } // Si le damos la vuelta al numero, podemos calcular su posicion exacta.
    
     do {
      if (numeroReves % 10 == digitoIntroducido) {
        return posicion;
      }
      numeroReves = numeroReves / 10;
      posicion++;
      
      } while (numeroReves != 0);
    return -1; // si no se encuentra el digito introducido, devolvemos un -1.
  }
  
  /**
   * Le quita a un número n dígitos por detrás (por la derecha).
   * 
   * @param numIntroducido Numero del cual queremos quitar los digitos.
   * @param numDigitos Cantidad de digitos que queremos quitar al numero.
   * @return Numero resultado tras quitarle la cantidad de digitos.
   */
  public static int quitaPorDetras (int numIntroducido, int numDigitos) {
    if (numDigitos != 0) {
      numIntroducido = numIntroducido / Varias.potencia(10, numDigitos);
                                                    // ... asi, al dividirlo,
                                                    // quitamos la cantidad de 
                                                    // digitos que hemos elegido.
    } // Para escapar del error de 0 digitos.
                                                    
    return numIntroducido;
  }
  
  /**
   * Le quita a un número n dígitos por delante (por la izquierda).
   * 
   * @param numIntroducido Numero del cual queremos quitar los digitos.
   * @param numDigitos Cantidad de digitos que queremos quitar al numero.
   * @return Numero resultado tras quitarle la cantidad de digitos.
   */
  public static int quitaPorDelante (int numIntroducido, int numDigitos) {
    if (numDigitos != 0) {
      numIntroducido = numIntroducido % (
              Varias.potencia(10, Varias.digitos(numIntroducido)) / 
              Varias.potencia(10, numDigitos));
                                                    // ... asi, al hacerle el
                                                    // modulo, quitamos la 
                                                    // cantidad de digitos 
                                                    // que hemos elegido.
    } // Para escapar del error de 0 digitos.
    return numIntroducido;
  }
  
  /**
   * Añade un dígito a un número por detrás.
   * 
   * @param numIntroducido Numero al cual le queremos añadir los digitos.
   * @param digitoAñadido Digitos que queremos añadir al numero.
   * @return Devuelve el numero con los digitos añadidos.
   */
  public static int pegaPorDetras (int numIntroducido, int digitoAñadido) {
    numIntroducido = (numIntroducido * 
            Varias.potencia(10, Varias.digitos(digitoAñadido))) + digitoAñadido; 
    
    return numIntroducido;
  }
  
  /**
   * Añade un dígito a un número por delante.
   * 
   * @param numIntroducido Numero al cual le queremos añadir los digitos.
   * @param digitoAñadido Digitos que queremos añadir al numero.
   * @return Devuelve el numero con los digitos añadidos.
   */
  public static int pegaPorDelante (int numIntroducido, int digitoAñadido) {
    numIntroducido = (digitoAñadido * 
            Varias.potencia(10, Varias.digitos(numIntroducido))) + numIntroducido; 
    
    return numIntroducido;
  }
  
  
  public static int trozoDeNumero (int numIntroducido, int posicionInicial, int posicionFinal) {
    numIntroducido = Varias.quitaPorDelante(numIntroducido, posicionInicial);
    numIntroducido = Varias.quitaPorDetras(numIntroducido, 
            Varias.digitos(numIntroducido) - posicionFinal);
    
    return numIntroducido;
  }
  
  /**
   * Pega dos números para formar uno.
   * 
   * @param numIntroducido1 Primer numero que queremos combinar.
   * @param numIntroducido2 Segundo numero que queremos combinar.
   * @return Numero resultado de la combinacion.
   */
  public static int juntaNumeros (int numIntroducido1, int numIntroducido2) {
    int numeroCombinado = Varias.pegaPorDetras(numIntroducido1, numIntroducido2);
    
    return numeroCombinado;
  }
}
