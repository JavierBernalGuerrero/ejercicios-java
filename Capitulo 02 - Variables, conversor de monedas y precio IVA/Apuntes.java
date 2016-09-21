/**
 *Variables de numeros enteros (int y long) y numeros decimales (double y float)
 *
 * int (solo numeros enteros), long (numero enteros mas largos)
 * 
 *@author Javier Bernal
 */

public class Importante { // Clase principal 
  public static void main(String[] args) {
    int x; // int declara la variable x como entera

// int VARIABLE = NUMERO; puede contener numeros enteros cortos
// long VARIABLE = NUMERO; puede contener numeros enteros mas grandes
// double VARIABLE = NUMERO; puede contener numeros decimales
// float VARIABLE = NUMERO; puede contener numero decimales mas grandes


//    x = 100; // Se asigna el valor 5 en la variable x
//    System.out.println(x + " " + (x + 5) + " " + (x - 5));
//    System.out.println((x * 5) + " " + (x / 5) + " " + (x % 5));

    double pesetas = 25;
    double euros = 10;

    System.out.printf("%4.2f pts son %10.2f euros", pesetas, euros); // %C - Caracter, %S - Cadena, %d - numero entero, %f - numero con decimales.

//     4.2
//    32.23 //rellena cifras desde el punto: si ponemos %4.2f, reserva 4 digitos delante del numero y 2 despues del punto
//  0032.23 //y si añadimos un cero(%04.2) rellena con 0 los digitos que faltan hasta alcanzar la cantidad determinada.
  }
}
