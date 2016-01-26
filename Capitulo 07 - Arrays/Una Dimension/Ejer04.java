/**
 * Define tres arrays de 20 números enteros cada una con nombres numero ,
 * cuadrado y cubo . Carga el array numero con valores aleatorios entre 0 y
 * 100. En el array cuadrado se deben almacenar los cuadrados de los valores
 * que hay en el array numero . En el array cubo se deben almacenar los cubos
 * de los valores que hay en numero . A continuación, muestra el
 * contenido de los tres arrays dispuesto en tres columnas.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer04 {
  public static void main(String[] args) {
    System.out.println(" Calculo con 3 array");
    System.out.println("·····················");
    
    int[] num;
    num = new int [20];
    
    int[] cuadrado;
    cuadrado = new int [20];
    
    int[] cubo;
    cubo = new int [20];
    
    System.out.print("Nº Aleatorio\t");
    System.out.print("Cuadrado\t");
    System.out.println("Cubo\t");
    System.out.println("·············································");
    
    
    for (int i = 0; i < 20; i++) {
      num[i] = (int)(Math.random() * 101);  // Da valores aleatorios al array num
      cuadrado[i] = num[i] * num[i];        // El cuadrado del array num
      cubo[i] = cuadrado[i] * num[i];       // El cubo del array num
      
      System.out.print(num[i] + "\t\t" + cuadrado[i] + "\t\t" + cubo[i] + "\n");
    }
  }
}
