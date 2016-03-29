
package ejercicios.POO.Ejercicio_7;

import java.util.Scanner;

/**
 *
 * Queremos gestionar la venta de entradas (no numeradas) de Expocoches
 * Campanillas que tiene 3 zonas, la sala principal con 1000 entradas
 * disponibles, la zona de compra-venta con 200 entradas disponibles y la zona
 * vip con 25 entradas disponibles. Hay que controlar que existen entradas antes
 * de venderlas.
 * 
 * @author Javier Bernal Guerrero
 */

public class Ejer7 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    Zona principal = new Zona(1000);
    Zona compraVenta = new Zona(250);
    Zona vip = new Zona(25);
    
    int eleccion1 = 0;
    int eleccion2 = 0;
    int cantidad;
    
    while (eleccion1 != 3) {
      System.out.println("========");
      System.out.println("1. Mostrar número de entradas libres");
      System.out.println("2. Vender entradas");
      System.out.println("3. Salir");
      
      System.out.print("Elige una opcion: ");
      eleccion1 = s.nextInt();
      switch (eleccion1) {
        case 1:
          System.out.println(principal);
          System.out.println(compraVenta);
          System.out.println(vip);
          break;
          
        case 2:
          System.out.println("·······················");
          System.out.println("\t1. Zona Principal.");
          System.out.println("\t2. Zona Compra-Venta.");
          System.out.println("\t3. Zona VIP.");
          System.out.println("\t4. Salir.");
          
          System.out.print("\tElige una opcion: ");
          eleccion2 = s.nextInt();
          switch (eleccion2) {
            case 1:
              System.out.print("\tQuedan " + principal.getEntradasPorVender() 
                      + " entradas. ¿Cuantas quieres? ");
              cantidad = s.nextInt();
              if (cantidad <= principal.getEntradasPorVender() && (cantidad > 0)) {
                principal.vender(cantidad);
              } else {
                System.out.println("\tError en la transaccion.");
              }
              break;
            case 2:
              System.out.print("\tQuedan " + compraVenta.getEntradasPorVender() 
                      + " entradas. ¿Cuantas quieres? ");
              cantidad = s.nextInt();
              if (cantidad <= compraVenta.getEntradasPorVender() && (cantidad > 0)) {
                compraVenta.vender(cantidad);
              } else {
                System.out.println("\tError en la transaccion.");
              }
              break;
            case 3:
              System.out.print("\tQuedan " + vip.getEntradasPorVender() 
                      + " entradas. ¿Cuantas quieres? ");
              cantidad = s.nextInt();
              if (cantidad <= vip.getEntradasPorVender() && (cantidad > 0)) {
                vip.vender(cantidad);
              } else {
                System.out.println("\tError en la transaccion.");
              }
              break;
          }
          break;
      }

      
    }
  }
}
