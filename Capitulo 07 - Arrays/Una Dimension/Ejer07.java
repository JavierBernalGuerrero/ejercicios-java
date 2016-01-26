/**
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
 * muestre por pantalla separados por espacios. El programa pedirá entonces por
 * teclado dos valores y a continuación cambiará todas las ocurrencias del
 * primer valor por el segundo en la lista generada anteriormente.
 * Los números que se han cambiado deben aparecer entrecomillados.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer07 {
  public static void main(String[] args) {
    System.out.println(" Desordenar numeros en array");
    System.out.println("·····························");
    
    int[] num;
    num = new int [100];
    
    for (int i = 0; i <= 99; i++) {
      num[i] = (int)(Math.random() * 20);
    
    }
    for (int i = 0; i <= 99; i++) {
      System.out.print(num[i] + " ");

    }
    System.out.print("\nIntroduce la posicion (numerica) del numero que quieres cambiar: ");
    int primerValor = Integer.parseInt (System.console().readLine());
    
    System.out.print("Introduce la posicion (numerica) donde quieras dejar el numero ");
    int segundoValor = Integer.parseInt (System.console().readLine());
    
    for (int i = 0; i <= 99; i++) {
      if (num[i] == primerValor) {
        System.out.print("'" + segundoValor + "' ");
      } else {
        System.out.print(num[i] + " ");
      }
    }
  }
}
