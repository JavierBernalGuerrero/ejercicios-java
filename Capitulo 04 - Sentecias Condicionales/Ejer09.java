/**
 *Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax² + bx + c = 0).
 * 
 *@author Javier Bernal
 */



            //CORREGIR











public class Ejer09 { 
  public static void main(String[] args) {

    System.out.println("Por favor, introduzca el valores para resolver la ecuacion de segundo grado: ");
    System.out.print("Introduzce el valor de a: ");
      double valorA = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzce el valor de b: ");
      double valorB = Double.parseDouble(System.console().readLine());

    System.out.print("Introduzce el valor de c: ");
      double valorC = Double.parseDouble(System.console().readLine());

    double discriminante = 0;

    if ((discriminante >= 0) && (valorA != 0)) {
      discriminante = Math.sqrt((valorB * valorB) - 4 * (valorA * valorC));
      System.out.println("El valor positivo de x es: " + ((- valorB + discriminante) / (2 * valorA)));
      System.out.print("El valor negativo de x es: " + ((- valorB - discriminante) / (2 * valorA)));

    } else {
      System.out.println("No tiene solucion, recuerda que el valor de a no puede ser 0.");
    }
  }
}
