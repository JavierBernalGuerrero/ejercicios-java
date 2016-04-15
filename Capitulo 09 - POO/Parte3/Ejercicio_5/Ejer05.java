package proyectos.Programacion_Orientada_Objeto.Ejercicio_5;

import java.util.Scanner;

public class Ejer05 {

  private static Scanner sc;

  public static void main(String[] args) {
    sc = new Scanner(System.in);

    Articulo[] artic = new Articulo[Articulo.capacidadAlmacen];

    // Variables para alta
    int stock;
    double pVen;
    double pCom;
    String descrip;
    int opcion = 0;

    boolean confirmacion; 

    // Variables para baja
    int cod;
    int articCounter = 0;

    // Variables genericas
    String aux = "";

    // Valores de ejemplo
    for (int i = 0; i < 4; i++) {
      artic[i] = new Articulo();
      articCounter++;
    }
    
    while (opcion != 7) {
      // Menu
      System.out.println(" Arcticulos");
      System.out.println("============");

      System.out.println("1. Listado.");
      System.out.println("2. Alta.");
      System.out.println("3. Baja.");
      System.out.println("4. Modificacion.");
      System.out.println("5. Entrada de mercancia.");
      System.out.println("6. Salida de mercancia.");
      System.out.println("7. Salida.");

      System.out.print("\nElige una opcion (1-7): ");
      opcion = sc.nextInt();
      System.out.println("=======================");
      
      confirmacion = false; // Reinicia confirmacion.
      switch (opcion) {
        case 1:	// LISTADO
          System.out.println("\n1. Listado:");

          if (articCounter > 0) {
            // Muestra el contenido de los objetos artic
            for (int i = 0; i < artic.length; i++) {
              Articulo articulo = artic[i];
              if (articulo != null) {
                if (articulo.getCodigo() != -1) {
                  System.out.println(articulo.toString());
                }
              }
            }
          } else {
            System.out.println("No hay articulos a listar");
          }
          break;

        case 2:	// ALTA
          if (articCounter == artic.length) {
            System.out.println("Se ha excedido el limite maximo de articulos.");
          } else {
            System.out.println("\n2. Alta:");
            System.out.print("Stock: ");
                    stock = sc.nextInt();
            System.out.print("Precio de Venta: ");
                    pVen = sc.nextInt();
            System.out.print("Precio de Compra: ");
                    pCom = sc.nextInt();
            System.out.print("Descripcion: ");
                    descrip = sc.next();
            for (int i = 0; (i < artic.length && (!confirmacion)); i++) {
              Articulo articulo = artic[i];

              // Busca la primera posicion libre.
              if (articulo == null) {
                if (i != 0) {
                  cod = artic[i-1].getCodigo() + 1;	// Como no esta siendo utilizada esta posicion, tambien es un codigo libre.
                  artic[i] = new Articulo(cod, descrip, stock, pCom, pVen);
                  articCounter++;
                  confirmacion = true;
                }
              }
            }
          }

          break;

          case 3: // BAJA
            System.out.println("\n3. Baja:");
            System.out.print("Introduce el codigo del producto: ");
              cod = sc.nextInt();
            for (int i = 0; i < artic.length; i++) {
              Articulo articulo = artic[i];
              if (articulo != null) {
                if (articulo.getCodigo() == cod) {
                  artic[i] = null;
                  articCounter--;
                  confirmacion = true;
                }

                if ((i == artic.length - 1) && (!confirmacion)) { // Si el contador llega al limite y 
                                                                  // no recibe confirmacion, esque el codigo no existe el codigo.
                  System.out.println("El articulo no se encuentra en la base de datos.");
                }
              }
            }
            break;

          case 4: // MODIFICACION
            System.out.println("\n4. Modificacion:");
            System.out.print("Introduce el codigo del producto: ");
              cod = sc.nextInt();

            for (int i = 0; i < artic.length; i++) {
              Articulo articulo = artic[i];
              if (articulo != null) {
                if (articulo.getCodigo() == cod) { // Busca el codigo introducido.

                  while (confirmacion != true) {
                    System.out.print("Modificar valor (codigo, stock, venta (precio de venta, "
                                  + "compra (precio de compra y descripcion): ");
                      aux = sc.next();
                    if (aux.equalsIgnoreCase("codigo") || aux.equalsIgnoreCase("stock") || aux.equalsIgnoreCase("venta") 
                                    || aux.equalsIgnoreCase("compra") || aux.equalsIgnoreCase("descripcion")) {
                      confirmacion = true;
                    } else {
                      System.out.println("El valor introducido no es correcto.");
                    }
                  }

                  switch (aux) {
                    case "codigo":
                      System.out.print("Introduce el nuevo codigo: ");
                        cod = sc.nextInt();
                      articulo.setCodigo(cod);
                      break;

                    case "stock":
                      System.out.print("Introduce el nuevo stock: ");
                        stock = sc.nextInt();
                      articulo.setStock(stock);
                      break;

                    case "venta":
                      System.out.print("Introduce el nuevo precio de venta: ");
                        pVen = sc.nextInt();
                      articulo.setPrecioVenta(pVen);
                      break;

                    case "compra":
                      System.out.print("Introduce el nuevo precio de compra: ");
                        pCom = sc.nextInt();
                      articulo.setPrecioCompra(pCom);
                      break;

                    case "descripcion":
                      System.out.print("Introduce la nueva descripcion: ");
                        descrip = sc.next();
                      articulo.setDescripcion(descrip);
                      break;

                  }
                } // if - busca codigo
                
                // Si el contador llega al limite y no recibe confirmacion, esque el codigo no existe el codigo.                
                if ((i == artic.length - 1) && (!confirmacion)) { 
                  System.out.println("El articulo no se encuentra en la base de datos.");
                }
              } // if - controla null
            } // bucle for - modificacion
            break;

          case 5: // ENTRADA MERCANCIA
            System.out.println("\n6. Salidade mercancia:");
            System.out.print("Codigo del articulo: ");
              cod = sc.nextInt();
            for (int i = 0; i < artic.length; i++) {
              Articulo articulo = artic[i];
              if (articulo != null) {
                if (articulo.getCodigo() == cod) {
                  System.out.print("Cantidad de mercancia: ");
                    stock = sc.nextInt();
                  articulo.setStock(articulo.getStock() + stock);
                  System.out.println("Se ha invertido " + articulo.getPrecioVenta() * stock + "€ en articulos.");
                }
              }
            }
            break;

          case 6: // SALIDA MERCANCIA
            System.out.println("\n5. Entrada de mercancia:");
            System.out.print("Codigo del articulo: ");
              cod = sc.nextInt();
            for (int i = 0; i < artic.length; i++) {
              Articulo articulo = artic[i];
              if (articulo != null) {
                if (articulo.getCodigo() == cod) {
                  while (!confirmacion) {
                    System.out.print("Cantidad de mercancia: ");
                      stock = sc.nextInt();

                    if (articulo.getStock() >= stock) {
                      articulo.setStock(articulo.getStock() - stock);	
                      System.out.println("Has ganado " + articulo.getPrecioVenta() * stock + "€ con la venta.");
                      if (articulo.getStock() == 0) {
                        System.out.println("Tenemos que reponer este articulo.");

                      }

                      confirmacion = true;
                    } else {
                      System.out.println("La cantidad introducida es incorrecta.");
                    }
                  }
                }
              }
            }
            break;

          case 7: //SALIDA
            System.out.println("\n7. Salida:");
            break;

          default:
            System.out.println("El valor introducido no es correcto.");
      }
    }
  }
}
