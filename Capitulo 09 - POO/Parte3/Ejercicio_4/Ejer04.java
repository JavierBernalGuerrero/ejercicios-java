package proyectos.Programacion_Orientada_Objeto.Ejercicio_4;

/**
 *
 * Realiza el programa “Colección de discos” por tu cuenta, mirando lo menos
 * posible el ejemplo que se proporciona. Pruébalo primero para ver cómo
 * funciona y luego intenta implementarlo tú mismo.
 * 
 * @author Javier Bernal Guerrero
 */

import java.util.Scanner;

public class Ejer04 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Indica la cantidad de discos: ");
    int cantidad = s.nextInt();
    
    boolean esCorrecto;
    int eleccion1 = 0;
    int eleccion2;
    int contadorError = 1;
    String nombre;
    String autor;
    int duracion;
    int codigo;
    String dato;
    double minimo;
    double maximo;
    
    Disco[] discos = new Disco[cantidad];
    while (eleccion1 != 5) {
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
          System.out.println("\n====================");
          System.out.println("\t||1. Mostrar por nombre.");
          System.out.println("\t||2. Mostrar por autor.");
          System.out.println("\t||3. Mostrar por duracion.");
          System.out.println("\t||4. Mostrar por codigo.");

          System.out.print("\n\t||Elige una opcion: ");
            eleccion2 = s.nextInt();
          switch (eleccion2) {
            case 1: // Nombre
              System.out.print("\t||Introduce el nombre que quieres buscar: ");
              dato = s.next();
              for (int i = 0; i < cantidad; i++) {
                if (discos[i] != null && discos[i].getNombre().equals(dato)) {
                  System.out.println(discos[i]);
                  esCorrecto = true;
                }
              }
              break;
            case 2: // Autor
              System.out.print("\t||Introduce el autor que quieres buscar: ");
              dato = s.next();
              for (int i = 0; i < cantidad; i++) {
                if (discos[i] != null && discos[i].getAutor().equals(dato)) {
                  System.out.println(discos[i]);
                  esCorrecto = true;
                }
              }
              break;
            case 3: // Duracion
              System.out.print("\t||Introduce la duracion minima y luego la maxima: ");
              minimo = s.nextInt();
              System.out.print("\t||Y ahora la maxima: ");
              maximo = s.nextInt();
              for (int i = 0; i < cantidad; i++) {
                if (discos[i] != null && discos[i].getDuracion() <= maximo && discos[i].getDuracion() >= minimo) {
                  System.out.println(discos[i]);
                  esCorrecto = true;
                }
              }
              break;
            case 4: // Codigo
              System.out.print("\t||Introduce el codigo que quieres buscar: ");
              dato = s.next();
              for (int i = 0; i < cantidad; i++) {
                if (discos[i] != null && discos[i].getCodigo() == Integer.parseInt(dato)) {
                  System.out.println(discos[i]);
                  esCorrecto = true;
                }
              }
              break;
          }
          if ((!esCorrecto) || (cantidad == 0)) {
            System.out.println("\t||La lista de discos se encuentra vacia: ");
          }
          break;
        case 2: // CREAR
          for (int i = 0; (i < cantidad) && (!esCorrecto); i++){
            if (discos[i] == null) {
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
              
              discos[i] = new Disco(nombre, autor, duracion, codigo);
              
              System.out.println("\t||El disco se ha añadido correctamente.");
              esCorrecto = true;
            }
          }
          
          // a. CONTROLA QUE NO SE PUEDAN CREAR NUEVOS DISCOS.
          // Para entrar en el bucle superior debe existir un "disco[i]" con
          // valor nulo, por lo que si no se activa es porque todos los elementos
          // del array estan ocupados. Se controlla si a entrado o no en el bucle
          // mediante la variable boolean "esCorrecto".
          if (!esCorrecto) {
            System.out.println("\t||La lista de discos esta llena, por favor elimine algun disco.");
          }
          break;
        case 3: // MODIFICAR
          while (!esCorrecto) {
            System.out.print("\t||Introduce el codigo del disco que quieres modificar: ");
            codigo = s.nextInt();
            
            for (int i = 0; (i < cantidad) && (!esCorrecto); i++) {
              if ((discos[i] != null) && (discos[i].getCodigo() == codigo)) {
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
                    discos[i].setNombre(s.next());
                    break;
                  case 2:
                    System.out.print("\t||Introduce el nuevo Autor: ");
                    discos[i].setAutor(s.next());
                    break;
                  case 3:
                    System.out.print("\t||Introduce el nuevo Duracion: ");
                    discos[i].setDuracion(s.nextInt());
                    break;
                  case 4:
                    System.out.print("\t||Introduce el nuevo Codigo: ");
                    discos[i].setCodigo(s.nextInt());
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
          while (!esCorrecto){
            System.out.print("\t||Introduce el codigo del"
                    + "\n\t||disco que quieres eliminar"
                    + "\n\t||(introduce el \"-1\" para salir): ");
            codigo = s.nextInt();
            
            for (int i = 0; (i < cantidad) && (!esCorrecto); i++) {
              if (discos[i] != null) {
                if ((discos[i].getCodigo() == codigo) && (discos[i] != null)) {
                  discos[i] = null;
                  esCorrecto = true;
                }
              }
            }
            
            // b. CONTROLA LA EXISTENCIA DE CODIGO DENTRO DE LA COLECCION.
            // Para entrar en la condicion de borrado usamos: 
            // "discos[i].getCodigo() == codigo" para comparar. Si no encuentra
            // ninguna coincidencia "esCorrecto" nunca modifica su valor.
            if (!esCorrecto) {
              System.out.println("\t||El codigo introducido no es correcto.");
            }
            
            if (codigo == -1) {
              esCorrecto = true;
            }
          }
          break;
      }
    }
  }
}
