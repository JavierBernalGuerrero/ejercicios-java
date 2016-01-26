/**
 *Modifica el programa anterior añadiendo colores. Puedes mostrar cada asignatura de un
 *color diferente.
 *
 *@author Javier Bernal
 */

public class c01ejercicio05 { // Clase principal
  public static void main(String[] args) {

    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";

    System.out.println(azul + "FOL \t" + rojo + "PROG \t" + morado + "SIN \t" + rojo + "PROG \t" + naranja + "BBDD");
    System.out.println(azul + "FOL \t" + rojo + "PROG \t" + morado + "SIN \t" + rojo + "PROG \t" + naranja + "BBDD");
    System.out.println(azul + "FOL \t" + rojo + "PROG \t" + morado + "SIN \t" + rojo + "PROG \t" + naranja + "BBDD");
    System.out.println(blanco + " \t  \t RECREO \t  \t ");
    System.out.println(rojo + "PROG \t" + naranja + "BBDD \t" + morado + "SIN \t" + verde + "ED \t" + rojo + "PROG");
    System.out.println(verde + "ED \t" + naranja + "BBDD \t" + blanco + "LM \t" + blanco + "LM \t" + morado + "SIN");
    System.out.println(verde + "ED \t" + naranja + "BBDD \t" + blanco + "LM \t" + blanco + "LM \t" + morado + "SIN" +blanco);
  }
}
