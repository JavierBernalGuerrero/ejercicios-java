/**
 *Realiza un programa que calcule la media de tres notas.
 * 
 *@author Javier Bernal
 */

public class Ejer07 { 
  public static void main(String[] args) {

      System.out.println("Calcular la media de 3 notas");
      System.out.print("Por favor, introduzce la nota 1: ");
        double nota1 = Integer.parseInt(System.console().readLine());

      System.out.print("Por favor, introduzce la nota 2: ");
        double nota2 = Integer.parseInt(System.console().readLine());
        
      System.out.print("Por favor, introduzce la nota 3: ");
        double nota3 = Integer.parseInt(System.console().readLine());

      double media = (nota1 + nota2 + nota3)/3;
      
      if ((nota1 >= 0) && (nota1 <= 10) &&
         (nota2 >= 0) && (nota2 <= 10) &&
         (nota3 >= 0) && (nota3 <= 10)) {    
      
         if (media < 5) {
          System.out.println("Has sacado un  " + media + " ¡Animo, a la proximo lo conseguiras!");
        } else {
          System.out.print("¡Enhorabuena! ¡Has sacado un " + media +"!");
        }
      } else {
          System.out.print("Lo valores introducido no son correctos");
      }
  }
}
