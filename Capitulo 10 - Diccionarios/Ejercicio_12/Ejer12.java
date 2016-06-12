
package proyectos.Diccionarios.Ejercicio_12;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * Escribe un programa que genere una secuencia de 5 cartas de la baraja 
 * española y que sume los puntos según el juego de la brisca. El valor de las 
 * cartas se debe guardar en una estructura HashMap que debe contener parejas 
 * (figura, valor), por ejemplo (“caballo”, 3). La secuencia de cartas debe ser 
 * una estructura de la clase ArrayList que contiene objetos de la clase Carta. 
 * El valor de las cartas es el siguiente: as → 11, tres → 10, sota → 2, 
 * caballo → 3, rey → 4; el resto de cartas no vale nada.
 * 
 * Ejemplo:
 * as de oros
 * cinco de bastos
 * caballo de espadas
 * sota de copas
 * tres de oros
 * Tienes 26 puntos
 * 
 * @author Javier Bernal Guerrero
 */
public class Ejer12 {
  public static void main(String[] args) {
    
    Carta aux;
    int puntuacion = 0;
    ArrayList<Carta> baraja = new ArrayList();
    HashMap<String, Integer> puntuaciones = new HashMap();
    
    puntuaciones.put("as", 11);
    puntuaciones.put("3", 10);
    puntuaciones.put("sota", 2);
    puntuaciones.put("caballo", 3);
    puntuaciones.put("rey", 4);
    
    while (baraja.size() != 5) { // Escoge 5 cartas, no repetidas.
      aux = new Carta();
      
      if (!baraja.contains(aux)) {
        baraja.add(aux);
      }
    }
    
    System.out.println("Las cartas escogidas son: ");
    for (Carta c : baraja) {
      System.out.println(c);
    }
    
    for (Carta c : baraja) { // Se recogen los valores
      if (puntuaciones.get(c.getValor()) != null) {
        puntuacion += puntuaciones.get(c.getValor());
      }
    }
    
    System.out.println("Tienes " + puntuacion + " puntos");
  }
}
