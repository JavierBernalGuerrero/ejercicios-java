package proyectos.Diccionarios.Ejercicio_05;

/**
 *
 * Realiza el programa “Colección de discos” por tu cuenta, mirando lo menos
 * posible el ejemplo que se proporciona. Pruébalo primero para ver cómo
 * funciona y luego intenta implementarlo tú mismo.
 * 
 * @author Javier Bernal Guerrero
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Ejer05 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Indica la cantidad de discos: ");
    int cantidad = s.nextInt();
    
    boolean esCorrecto;
    int eleccion1 = 0;
    int eleccion2;
    String nombre;
    String autor;
    int duracion;
    int codigo;
    String dato;
    double minimo;
    double maximo;
    int indice;
    
    ArrayList<Disco> discos = new ArrayList();
    
    
    discos.add(new Disco("cancion1", "autor1", 4, 1));
    discos.add(new Disco("cancion2", "autor2", 6, 2));
    discos.add(new Disco("cancion3", "autor3", 10, 3));
    discos.add(new Disco("cancion4", "autor4", 1, 4));
    
    
    
    
    while (eleccion1 != 5) {
      indice = 0;
      esCorrecto = false;
      
      System.out.println("\n====================");
      System.out.println("1. Mostrar discos");
      System.out.println("2. Introducir discos");
      System.out.println("3. Modificar discos");
      System.out.println("4. Borrar discos");
      System.out.println("5. Salir");
      
      System.out.print("\nElige una opcion: ");
      eleccion1 = s.nextInt();
      switch (eleccion1) {
        case 1: // MOSTRAR
          if (discos.isEmpty()) {
            System.out.println("\t||La lista de discos se encuentra vacia.");
            
          } else {
            System.out.println("\n====================");
            System.out.println("\t||1. Mostrar todo.");
            System.out.println("\t||2. Mostrar por nombre.");
            System.out.println("\t||3. Mostrar por autor.");
            System.out.println("\t||4. Mostrar por duracion.");
            System.out.println("\t||5. Mostrar por codigo.");

            System.out.print("\n\t||Elige una opcion: ");
              eleccion2 = s.nextInt();
            switch (eleccion2) {
              case 1: // Todo
                for (Disco d : discos) {
                  System.out.println(d);
                  esCorrecto = true;
                }
                break;
                
              case 2: // Nombre
                System.out.print("\t||Introduce el nombre que quieres buscar: ");
                dato = s.next();

                for (Disco d : discos) {
                  if (d.getNombre().equals(dato)) {
                    System.out.println(d);
                    esCorrecto = true;
                  }
                }
                break;

              case 3: // Autor
                System.out.print("\t||Introduce el autor que quieres buscar: ");
                dato = s.next();

                for (Disco d : discos) {
                  if (d.getAutor().equals(dato)) {
                    System.out.println(d);
                    esCorrecto = true;
                  }
                }
                break;

              case 4: // Duracion
                System.out.print("\t||Introduce la duracion minima y luego la maxima: ");
                minimo = s.nextInt();
                System.out.print("\t||Y ahora la maxima: ");
                maximo = s.nextInt();

                for (Disco d : discos) {
                  if (d.getDuracion()<= maximo && d.getDuracion() >= minimo) {
                    System.out.println(d);
                    esCorrecto = true;
                  }
                }
                break;

              case 5: // Codigo
                System.out.print("\t||Introduce el codigo que quieres buscar: ");
                dato = s.next();

                for (Disco d : discos) {
                  if (d.getCodigo() == Integer.parseInt(dato)) {
                    System.out.println(d);
                    esCorrecto = true;
                  }
                }
                break;
            }
            if (!esCorrecto) {
              System.out.println("\t||El valor introducido no se encuentra esta en la coleccion.");
            }
          }
          break;
          
        case 2: // CREAR
          // a. CONTROLA QUE NO SE PUEDAN CREAR NUEVOS DISCOS.
          // Para entrar en el bucle superior debe existir un "disco[i]" con
          // valor nulo, por lo que si no se activa es porque todos los elementos
          // del array estan ocupados. Se controlla si a entrado o no en el bucle
          // mediante la variable boolean "esCorrecto".
          if (discos.size() == cantidad) {
            System.out.println("\t||La lista de discos esta llena, por favor elimine algun disco.");
            
          } else {
            System.out.print("\t||Nombre: ");
            nombre = s.next();
            System.out.print("\t||Autor: ");
            autor = s.next();
            System.out.print("\t||Duracion: ");
            duracion = s.nextInt();
            System.out.print("\t||Codigo: ");
            codigo = s.nextInt();

            // c. CONTROLA QUE EL CODIGO INTRODUCIDO NO EXISTA
            // He creado un metodo para la clase Disco que permite
            // controlar si existe o no un codigo repetido.
            while (Disco.buscaCodigo(discos, codigo)) {
              System.out.println("El codigo introducido ya existe."
                      + " Por favor, vuelva a introducir el codigo: ");
              codigo = s.nextInt();
            }

            discos.add(new Disco(nombre, autor, duracion, codigo));

            System.out.println("\t||El disco se ha añadido correctamente.");
            
          }
          
          
          break;
        case 3: // MODIFICAR
          while (!esCorrecto) {
            System.out.print("\t||Introduce el codigo del disco que quieres modificar: ");
            codigo = s.nextInt();
            
            for (Disco d : discos) {
              if ((d.getCodigo() == codigo)) {
                esCorrecto = true;
            
                System.out.println("\t||1. Nombre.");
                System.out.println("\t||2. Autor.");
                System.out.println("\t||3. Duracion.");
                System.out.println("\t||4. Codigo.");
                System.out.println("\t||5. Salir.");

                System.out.print("\t||Elige la opcion que quieres modificar: ");
                eleccion2 = s.nextInt();
                switch (eleccion2) {
                  case 1:
                    System.out.print("\t||Introduce el nuevo nombre: ");
                    d.setNombre(s.next());
                    break;
                  case 2:
                    System.out.print("\t||Introduce el nuevo Autor: ");
                    d.setAutor(s.next());
                    break;
                  case 3:
                    System.out.print("\t||Introduce el nuevo Duracion: ");
                    d.setDuracion(s.nextInt());
                    break;
                  case 4:
                    System.out.print("\t||Introduce el nuevo Codigo: ");
                    d.setCodigo(s.nextInt());
                    break;
                }
              }
            }
            
            if (!esCorrecto) {
              System.out.println("\t||El codigo introducido no es correcto.");
            }
          }
          break;
        case 4: // BORRAR
          System.out.print("\t||Introduce el codigo del disco que quieres eliminar: ");
          codigo = s.nextInt();

          for (Disco n : discos) {
            if (n.getCodigo() == codigo) {
              indice = discos.indexOf(n);
              System.out.println(indice);
              esCorrecto = true;
            }
          }
          discos.remove(indice);

          // b. CONTROLA LA EXISTENCIA DE CODIGO DENTRO DE LA COLECCION.
          // Para entrar en la condicion de borrado usamos: 
          // "discos[i].getCodigo() == codigo" para comparar. Si no encuentra
          // ninguna coincidencia "esCorrecto" nunca modifica su valor.
          if (!esCorrecto) {
            System.out.println("\t||El codigo introducido no es correcto.");
          }
        break;
      }
    }
  }
}
