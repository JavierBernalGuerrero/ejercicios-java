/**
 *Escribe un programa que calcule el volumen de un cono según la 
 *fórmula V = 13 πr² 2 h
 * 
 *@author Javier Bernal
 */

public class Ejer09 { 
  public static void main(String[] args) {

    String numero;

    System.out.println("Volumen de un cono (m³)");
    System.out.print("Introduce el radio ");
    numero = System.console().readLine();
    double radio;
    radio = Double.parseDouble( numero );

    System.out.print("Introduce altura ");
    numero = System.console().readLine();
    double altura;
    altura = Double.parseDouble( numero );
  
    System.out.println("Volumen: " + ((3.1416 * (radio * radio) * altura) / 3) + "m³");
  }
}
