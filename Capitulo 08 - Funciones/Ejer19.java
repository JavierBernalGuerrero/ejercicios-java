/*
 * Escribe un programa que pase de decimal a hexadecimal.
 *
 * Informacion sacada de:
 * ···········
 *
 * @author Javier Bernal Guerrero
 */
package ejercicios.Tema_8;

import ejercicios.Tema_8.funciones.Matematicas;

public class Ejer19 {
  public static void main(String[] args) {
    int numBinario = 1111111111;
    int numDecimal = 1023;
    
    System.out.println("1.Decimal - Binario");
      System.out.println(Matematicas.decimalBinario(numDecimal));
      
    System.out.println("\n2.Decimal - Hexadecimal");
      System.out.println(Matematicas.decimalHexadecimal(numDecimal));
      
    System.out.println("\n3.Decimal - Octal");
    
    System.out.println("\n4.Binario - Decimal");
     System.out.println(Matematicas.binarioDecimal(numBinario));
     
    System.out.println("\n5.Binario - Hexamdecimal");
      System.out.println(Matematicas.binarioHexadecimal(numBinario));
      
    System.out.println("\n6.Binario - Octal");
    
    System.out.println("\n7.Hexamdecimal - Decimal");
    
    System.out.println("\n8.Hexamdecimal - Binario");
    
    System.out.println("\n9.Hexamdecimal - Octal");
    
    System.out.println("\n10.Octal - Decimal");
    
    System.out.println("\n11.Octal - Binario");
    
    System.out.println("\n12.Octal - Hexadecimal");
    
  }
}