/**
 * Escribe un programa en el que se declaren las variables enteras x e y . Asignales los valores
 *144 y 999 respectivamente. A continuación, muestra por pantalla el valor de cada variable,
 *la suma, la resta, la división y la multiplicación.
 * 
 *@author Javier Bernal
 * 
 */

public class Ejer01 { 
  public static void main(String[] args) {
    int x = 144;
    int y = 999;

    System.out.println("El valor de la variable x es " + x);
    System.out.println("El valor de la variable y es " + y);
    System.out.println("La suma de las variables x e y es " + (x + y));
    System.out.println("La resta de las variables x e y es " + (x - y));
    System.out.println("La multiplicacion de las variable x e y es " + (x * y));
    System.out.println("La division de las variables x e y " + (x / y));
  }
}
