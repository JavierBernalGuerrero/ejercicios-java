/**
 *Amplía el programa anterior para que diga la nota del boletín (insuficiente, suficiente, bien,
 *notable o sobresaliente).
 * 
 *@author Javier Bernal
 */

public class Ejer08 { 
  public static void main(String[] args) {

    System.out.println("Calcular la media de 3 notas");
    System.out.print("Por favor, introduzce la nota 1: ");
      double nota1 = Integer.parseInt(System.console().readLine());

    System.out.print("Por favor, introduzce la nota 2: ");
      double nota2 = Integer.parseInt(System.console().readLine());
      
    System.out.print("Por favor, introduzce la nota 3: ");
      double nota3 = Integer.parseInt(System.console().readLine());

    double media = (nota1 + nota2 + nota3)/3;
    
    if ((media >= 0) && (media <=10)) {
      if (media < 5) {
        System.out.println("Insuficiente ");
      }
      if ((media >= 5) && (media < 6)) {
        System.out.println("Suficiente ");
      }
      if ((media >= 6) && (media < 8)) {
        System.out.println("Bien ");
      }
      if ((media >= 8) && (media < 9)){
        System.out.println("Notable ");
      }
      if ((media >= 9) && (media <= 10)){
        System.out.println("Sobresaliente");
      }

    } else {
      System.out.print("Los valores introducidos no son validos.");
    }
  }
}
