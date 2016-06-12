package proyectos.Diccionarios.Ejercicio_13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * Modifica el programa Gestisimal realizado anteriormente añadiendo las 
 * siguientes mejoras:
 * • Utiliza una lista en lugar de un array para el almacenamiento de los datos.
 * • Comprueba la existencia del código en el alta, la baja y la modificación 
 * de artículos para evitar errores.
 * • Cambia la opción “Salida de stock” por “Venta”. Esta nueva opción permitirá 
 * hacer una venta de varios artículos y emitir la factura correspondiente. Se 
 * debe preguntar por los códigos y las cantidades de cada artículo que se 
 * quiere comprar. Aplica un 21% de IVA.
 * 
 * @author Javier Bernal Guerrero
 */
public class Ejer13 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int opcion = 0;
    String codigo = "";
    String descripcion;
    int stock;
    double precioCompra;
    double precioVenta;
    int cantidad;
    double aux;
    boolean esCorrecto;
    
    ArrayList<Articulo> almacen = new ArrayList();
    HashMap<String, Integer> pedido = new HashMap();
    
    almacen.add(new Articulo());
    almacen.add(new Articulo());
    almacen.add(new Articulo());
    almacen.add(new Articulo());
    
    while (opcion != 7) {
      esCorrecto = false;
      
      System.out.println("\nMenu Principal");
      System.out.println("====================");
      System.out.println("1. Listado.");
      System.out.println("2. Alta.");
      System.out.println("3. Baja.");
      System.out.println("4. Modificacion.");
      System.out.println("5. Entrada de mercancia.");
      System.out.println("6. Salida de mercancia.");
      System.out.println("7. Salir");
      
      System.out.print("\nElige una opcion: ");
      opcion = s.nextInt();
      switch (opcion) {
        case 1: // LISTADO
          for (Articulo a : almacen) {
            System.out.println(a);
          }
          
          if (almacen.isEmpty()) {
            System.out.println("\t||El almacen esta vacio.");
          }
          break;
        case 2: // ALTA
          while (!esCorrecto) { // Comprueba que el codigo no se repite.
            System.out.print("\t||Introduce el codigo: ");
            codigo = s.next();
            for (Articulo a : almacen) {
              if (!a.getCodigo().equalsIgnoreCase(codigo)) {
                esCorrecto = true;
              } 
            }
            if (!esCorrecto) {
              System.out.println("\t||El codigo ya existe.");
            }
          }
          
          System.out.print("\t||Introduce la descripcion: ");
          descripcion = s.next();
          System.out.print("\t||Introduce el stock:");
          stock = s.nextInt();
          System.out.print("\t||Introduce el precio de compra: ");
          precioCompra = s.nextDouble();
          System.out.print("\t||Introduce el precio de venta: ");
          precioVenta = s.nextDouble();
          
          System.out.println("\t||El articulo se ha agregado con exito.");
          almacen.add(new Articulo(codigo, descripcion, stock, precioCompra, precioVenta));
          break;
        case 3: // BAJA
          System.out.print("\t||Introduce el codigo del articulo que quieres borrar: ");
          codigo = s.next();
          
          for (Articulo a : almacen) {
            if (a.getCodigo().equals(codigo)) {
              System.out.println("\t||El articulo se ha borrado con exito.");
              almacen.remove(a);
              esCorrecto = true;
            }
          }
          
          if (!esCorrecto) {
            System.out.println("\t||El codigo introducido no es correcto.");
          }
          break;
        case 4: // MODIFICACION
          System.out.print("\t||Introduce el codigo del articulo que "
                              + "quieres modificar: ");
          codigo = s.next();
          
          for (Articulo a : almacen) {
            if (a.getCodigo().equals(codigo)) {
              System.out.println("\t||1. Codigo.");
              System.out.println("\t||2. Descripcion.");
              System.out.println("\t||3. Stock.");
              System.out.println("\t||4. Precio de compra.");
              System.out.println("\t||5. Precio de venta.");
              System.out.println("\t||···················");
              System.out.println("\t||Introduce que valor quieres modificar: ");
              opcion = s.nextInt();
              
              switch (opcion) {
                case 1: // MODIFICACION - CODIGO
                  while (!esCorrecto) { // Comprueba que el codigo no se repite.
                    System.out.print("\t||Introduce el nuevo codigo: ");
                    codigo = s.next();
                  
                    for (Articulo art : almacen) {
                      if (!art.getCodigo().equalsIgnoreCase(codigo)) {
                        esCorrecto = true;
                      }
                    }
                    
                    if (esCorrecto) {
                      System.out.println("\t||El codigo se a modificado con exito.");
                      a.setCodigo(codigo);
                    } else {
                      System.out.println("\t||El codigo ya existe.");
                    }
                  }
                  break;
                case 2: // MODIFICACION - DESCRIPCION
                  System.out.print("\t||Introduce la nueva descripcion: ");
                  descripcion = s.next();
                  
                  System.out.println("\t||La descripcion se a modificado con exito.");
                  a.setDescripcion(descripcion);
                  break;
                case 3: // MODIFICACION - STOCK
                  System.out.print("\t||Introduce el nuevo stock: ");
                  stock = s.nextInt();
                  
                  System.out.println("\t||El stock se a modificado con exito.");
                  a.setStock(stock);
                  break;
                case 4: // MODIFICACION - PRECIO DE COMPRA
                  System.out.print("\t||Introduce el nuevo precio de compra: ");
                  precioCompra = s.nextDouble();
                  
                  System.out.println("\t||El precio de compra se a modificado con exito.");
                  a.setPrecioCompra(precioCompra);
                  break;
                case 5: // MODIFICACION - PRECIO DE VENTA
                  System.out.print("\t||Introduce el nuevo precio de venta: ");
                  precioVenta = s.nextDouble();
                  
                  System.out.println("\t||El precio de venta se a modificado con exito.");
                  a.setPrecioVenta(precioVenta);
                  break;
                default:
              }
              esCorrecto = true;
            }
          }
          
          if (!esCorrecto) {
            System.out.println("\t||El codigo introducido no es correcto.");
          }
          break;
        case 5: // ENTRADA DE MERCANCIA
          System.out.print("\t||Introduce el codigo del articulo: ");
          codigo = s.next();
          for (Articulo a : almacen) {
            if (a.getCodigo().equals(codigo)) {
              System.out.print("\t||Introduce el numero de mercancia que a entrado: ");
              stock = s.nextInt();
              
              System.out.println("\t||La opereacion se a completado con exito.");
              a.setStock(a.getStock() + stock);
              esCorrecto = true;
            }
          }
          
          if (!esCorrecto) {
            System.out.println("\t||El codigo introducido no es correcto.");
          }
          break;
        case 6: // SALIDA DE MERCANCIA - VENTA
          while (opcion != 3) {
            System.out.println("\t||1. Agregar otro articulo.");
            System.out.println("\t||2. Generar factura.");
            System.out.println("\t||3. Salir.");
            System.out.println("\t||···················");
            System.out.print("\t||Escoja una opcion: ");
            opcion = s.nextInt();

            switch (opcion) {
              case 1: // AÑADIR ARTICULO A PEDIDO
                System.out.print("\t||Introduzca el codigo del articulo que "
                        + "quieres agregar: ");
                codigo = s.next();

                for (Articulo a : almacen) {
                  if (a.getCodigo().equals(codigo)) {
                    System.out.println("\t||Disponemos de un stock de " + a.getStock() + " unidades de ese articulo.");
                    System.out.print("\t||Introduzca la cantidad de articulos: ");
                    cantidad = s.nextInt();

                    if (cantidad <= a.getStock()) {
                      pedido.put(a.getCodigo(), cantidad);
                    } else {
                      System.out.println("Se a sobrepasado el maximo de unidades. "
                              + "Error en la transaccion.");
                    }

                    esCorrecto = true;
                  }
                }
                if (!esCorrecto) {
                  System.out.println("\t||El codigo introducido no es correcto.");
                }
                break;
              case 2: // GENERAR FACTURA
                System.out.println("========================================="
                        + "================");
                System.out.println("Codigo\t||Cantidad\t||Precio\t||Precio Total\t||Precio I.V.A.");
                for (Map.Entry p : pedido.entrySet()) {
                  for (Articulo a : almacen) {
                    if (a.getCodigo().equals(p.getKey())){
                      aux = Double.parseDouble("" + p.getValue()); // PARA MAS PRECISION EN EL CALCULO DE LA FACTURA
                      System.out.println("||" + a.getCodigo()+ "\t||" + 
                                    p.getValue() + "\t\t||" + a.getPrecioVenta() 
                                    + "\t\t||" + (a.getPrecioVenta() * aux)+ 
                                    "€\t\t||" + ((a.getPrecioVenta() * aux) 
                                            * 1.21) + "€");
                    }
                  }
                }
                System.out.println("========================================"
                        + "=================");
                opcion = 3; // PARA SALIR AL MENU PRINCIPAL
                pedido.clear();
                break;
              default:
            }
          }
          break;
        default:
      }
    }
  
  }
}
