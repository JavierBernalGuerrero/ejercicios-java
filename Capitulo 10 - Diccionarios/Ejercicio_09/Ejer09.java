package proyectos.Diccionarios.Ejercicio_09;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * Modifica el programa anterior de tal forma que las cartas se muestren 
 * ordenadas. Primero se ordenarán por palo: bastos, copas, espadas, oros. 
 * Cuando coincida el palo, se ordenará por número: as, 2, 3, 4, 5, 6, 7, 
 * sota, caballo, rey.
 * 
 * @author Javier Bernal Guerrero
 */
public class Ejer09 {
  public static void main(String[] args) {
    ArrayList<Carta> baraja = new ArrayList();
    
    Carta cartaAuxiliar;
    
    while (baraja.size() != 10) {
      cartaAuxiliar = new Carta();
      
      if (!baraja.contains(cartaAuxiliar)) {
        baraja.add(cartaAuxiliar);
        
      }
    }
    
    System.out.println("La baraja desordenada:");
    for (Carta c : baraja) {
      System.out.println(c);
    }
    
    Collections.sort(baraja);
    
    System.out.println("La baraja ordenada:");
    for (Carta c : baraja) {
      System.out.println(c);
    }
  }
}
