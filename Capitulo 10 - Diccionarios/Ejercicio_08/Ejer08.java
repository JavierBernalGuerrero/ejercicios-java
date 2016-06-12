package proyectos.Diccionarios.Ejercicio_08;

import java.util.ArrayList;

/**
 *
 * Realiza un programa que escoja al azar 10 cartas de la baraja española 
 * (10 objetos de la clase Carta). Emplea un objeto de la clase ArrayList 
 * para almacenarlas y asegúrate de que no se repite ninguna.
 * 
 * @author Javier Bernal Guerrero
 */
public class Ejer08 {
  public static void main(String[] args) {
    ArrayList<Carta> baraja = new ArrayList();
    
    Carta cartaAuxiliar;
    
    while (baraja.size() != 10) {
      cartaAuxiliar = new Carta();
      
      if (!baraja.contains(cartaAuxiliar)) {
        baraja.add(cartaAuxiliar);
        
      }
    }
    
    for (Carta c : baraja) {
      System.out.println(c);
    }
  }
}
