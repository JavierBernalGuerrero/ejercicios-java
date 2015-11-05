/**
 * Realiza un programa que pinte por pantalla diez líneas formadas por
 * caracteres. El carácter con el que se pinta cada línea se elige de forma
 * aleatoria entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben
 * tener una longitud aleatoria entre 1 y 40 caracteres.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer10 {
  public static void main(String[] args) {
    System.out.println(" Lineas de caracteres aleatorias");
    System.out.println("·································");
    
    String caracter = " ";
    int longitudAleatoria = 0;
    int caracterAleatorio = 1;

    for (int i = 1; i <= 10; i++) {
      longitudAleatoria = ((int)(Math.random() * 40) + 1);
      int contador = 1;
      
      while (longitudAleatoria >= contador) {
        caracterAleatorio = ((int)(Math.random() * 6) + 1);
        
        switch (caracterAleatorio) {
          case 1:
            caracter = "*";
            break;
          case 2:
            caracter = "-";
            break;
          case 3:
            caracter = "=";
            break;
          case 4:
            caracter = ".";
            break;
          case 5:
            caracter = "|";
            break;
          case 6:
            caracter = "@";
            break;
          default:
            break;
        }
        System.out.print(caracter);
        contador++;
      } // Fin bucle while
      
      System.out.println();
    } // Fin bucle for
  }
}
