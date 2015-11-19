/**
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer22 {
  public static void main(String[] args) {

    System.out.println(" Calculo de numeros primos");
    System.out.println("···························");
    System.out.println("Los numeros primos comprendidos entre 2 y 100 son: ");

    int numero = 1;
    int contador = 2;
    int modulo = 1;
    
    for (int i = 2; i <= 100; i++) {
      numero++;
      
      if ((numero == 2) || (numero == 3)) {
        System.out.println(numero);
      }
      
      if ((numero % 2 != 0) && (numero % 3 != 0) && (numero % 5 != 0) && (numero % 7 != 0)) {
        System.out.println(numero);
      }
    }
  }
}
