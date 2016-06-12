/*
 *  
 *
 * @author Javier Bernal Guerrero
 */
       
package ejercicios.Tema_8;

import ejercicios.Tema_8.funciones.Varias;

public class Ejer01_14 {
  public static void main(String[] args) {
    int numeroPropuesto = 1327565;
    
    // esCapicua: Devuelve verdadero si el número que se pasa como parámetro 
    // es capicúa y falso en caso contrario.
      
      System.out.print("1.El " + numeroPropuesto);
      if (Varias.esCapicua(numeroPropuesto)) { // es lo mismo que " == true".
        System.out.println(" es capicua.");
      } else {
        System.out.println(" no es capicua.");
      }
      
    // esPrimo: Devuelve verdadero si el número que se pasa como parámetro es
    // primo y falso en caso contrario.
      System.out.print("2.El " + numeroPropuesto);
      if (Varias.esPrimo(numeroPropuesto)) {
        System.out.println(" no es primo.");
      } else {
        System.out.println(" es primo.");
      }
      
    // siguientePrimo: Devuelve el siguiente numero primo al 
    // numero introducido.
      System.out.println("3.Tras el " + numeroPropuesto + " el " + 
              Varias.siguientePrimo(numeroPropuesto) + " es el siguiente primo.");
      
    // potencia: Dada una base y un exponente devuelve la potencia.
      int base = 2;
      int exponente = 4;
      System.out.println("4.Base: " + base + "\n  Exponente: " + exponente 
              + "\n  Resultado: " + Varias.potencia(base, exponente));
      
    // digitos: Cuenta el número de dígitos de un número entero.
      System.out.println("5.El numero " + numeroPropuesto + " tiene "  
              + Varias.digitos(numeroPropuesto) + " cifras.");
      
    // voltea: Le da la vuelta a un número.
      System.out.println("6.Si le damos la vuelta al numero " + numeroPropuesto 
              + " nos queda " + Varias.voltea(numeroPropuesto) + ".");
      
    // digitoN: Devuelve el dígito que está en la posición n de un número 
    // entero. Se empieza contando por el 0 y de izquierda a derecha.    
      int posicion = 4;
      
      System.out.println("7.En la posicion " + posicion + " del numero " 
              + numeroPropuesto + " tenemos un " + Varias.digitoN(numeroPropuesto, posicion) + ".");
    
    // posicionDeDigito: Da la posición de la primera ocurrencia de un 
    // dígito dentro de un número entero. Si no se encuentra, devuelve -1.   
      int digito = 2;
      
      System.out.println("8.El digito " + digito + " dentro del numero " + 
              numeroPropuesto + " se encuentra en la posicion " + 
              Varias.posicionDeDigito(numeroPropuesto, digito) + ".");
      
    // quitaPorDetras: Le quita a un número n dígitos por detrás 
    // (por la derecha).
      int cantidadQuitar = 3;
      
      System.out.println("9.Al numero " + numeroPropuesto + " le quitamos " + 
              cantidadQuitar + " digitos por detras y se queda como " + 
              Varias.quitaPorDetras(numeroPropuesto, cantidadQuitar) + ".");
      
    // quitaPorDelante: Le quita a un número n dígitos por delante
    // (por la izquierda).
      System.out.println("10.Al numero " + numeroPropuesto + " le quitamos " + 
              cantidadQuitar + " digitos por delante y se queda como " + 
              Varias.quitaPorDelante(numeroPropuesto, cantidadQuitar) + ".");
      
    // pegaPorDetras: Añade un dígito a un número por detrás.
      int cantidadAñadir = 45;
      
      System.out.println("11.Al numero " + numeroPropuesto + " le añadimos el " + 
              cantidadAñadir + " por detras y se queda como " + 
              Varias.pegaPorDetras(numeroPropuesto, cantidadAñadir) + ".");
      
    // pegaPorDelante: Añade un dígito a un número por delante.
      System.out.println("12.Al numero " + numeroPropuesto + " le añadimos el " + 
              cantidadAñadir + " por delante y se queda como " + 
              Varias.pegaPorDelante(numeroPropuesto, cantidadAñadir) + ".");
      
    // trozoDeNumero: Toma como parámetros las posiciones inicial y final 
    // dentro de un número y devuelve el trozo correspondiente.
      int posicionInicial = 1;
      int posicionFinal = 3;
      
      System.out.println("13.Al numero " + numeroPropuesto + " le quitamos un "
              + "trozo desde la posicion " + posicionInicial + " hasta la "
              + "posicion " + posicionFinal + " y se queda como " + 
              Varias.trozoDeNumero(numeroPropuesto, posicionInicial, 
                      posicionFinal) + ".");
      
    // juntaNumeros: Pega dos números para formar uno.
      int numeroAñadir = 7231;
      
      System.out.println("14.Al numero " + numeroPropuesto + " le añadimos el " + 
              cantidadAñadir + " y se queda como " + 
              Varias.juntaNumeros(numeroPropuesto, numeroAñadir) + ".");
  }
}