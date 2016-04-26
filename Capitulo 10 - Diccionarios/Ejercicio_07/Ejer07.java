package Diccionarios.Ejercicio_07;

import java.util.ArrayList;

/**
 *
 * La máquina Eurocoin genera una moneda de curso legal cada vez que se pulsa 
 * un botón siguiendo la siguiente pauta: o bien coincide el valor con la 
 * moneda anteriormente generada - 1 céntimo, 2 céntimos, 5 céntimos, 
 * 10 céntimos, 25 céntimos, 50 céntimos, 1 euro o 2 euros - o bien coincide 
 * la posición – cara o cruz. Simula, mediante un programa, la generación
 * de 6 monedas aleatorias siguiendo la pauta correcta. Cada moneda generada 
 * debe ser una instancia de la clase Moneda y la secuencia se debe ir 
 * almacenando en una lista.
 * 
 * Ejemplo:
 * 2 céntimos – cara
 * 2 céntimos – cruz
 * 50 céntimos – cruz
 * 1 euro – cruz
 * 1 euro – cara
 * 10 céntimos – cara
 * 
 * @author Javier Bernal Guerrero
 */

public class Ejer07 {
  public static void main(String[] args) {
    ArrayList<Moneda> monedas = new ArrayList();
    monedas.add(new Moneda());
    
    Moneda aux;
    int indice = 0;
    
    while (monedas.size() != 6) {
      aux = new Moneda();
      
      if ((aux.getValor().equals(monedas.get(indice).getValor())) || (aux.getPosicion().equals(monedas.get(indice).getPosicion()))) {
        monedas.add(aux);
        
        indice++;
      }
    }
    
    for (Moneda m : monedas) {
      System.out.println(m);
    }
  }
}
