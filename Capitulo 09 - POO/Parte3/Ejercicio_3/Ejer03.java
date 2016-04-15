package proyectos.Programacion_Orientada_Objeto.Ejercicio_3;

/**
 *
 * Realiza el programa “Colección de discos” por tu cuenta, mirando lo menos
 * posible el ejemplo que se proporciona. Pruébalo primero para ver cómo
 * funciona y luego intenta implementarlo tú mismo.
 * 
 * @author Javier Bernal Guerrero
 */

import java.util.Scanner;

public class Ejer03 {
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
          for (int i = 0; i < cantidad; i++) {
            if (discos[i] != null) {
              System.out.println(discos[i]);
              esCorrecto = true;
            } else {
              contadorError++;
            }
          }
          if (((contadorError == cantidad) && (!esCorrecto)) || (cantidad == 0)) {
            System.out.println("\t||La lista de discos se encuentra vacia.");
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
              
              discos[i] = new Disco(nombre, autor, duracion, codigo);
              
              System.out.println("\t||El disco se ha añadido correctamente.");
              esCorrecto = true;
            }
          }
          
          if (!esCorrecto) {
            System.out.println("\t||La lista de discos esta llena, por favor elimine algun disco.");
          }
          break;
        case 3: // MODIFICAR
          while (!esCorrecto) {
            System.out.print("\t||Introduce el codigo del disco que quieres modificar: ");
            codigo = s.nextInt();
            
            for (int i = 0; (i < cantidad) && (!esCorrecto); i++) {
              if ((discos[i].getCodigo() == codigo) && (discos[i] != null)) {
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
          while (!esCorrecto) {
            System.out.print("\t||Introduce el codigo del disco que quieres eliminar: ");
            codigo = s.nextInt();
            
            for (int i = 0; (i < cantidad) && (!esCorrecto); i++) {
              if (discos[i] != null) {
                if ((discos[i].getCodigo() == codigo) && (discos[i] != null)) {
                  discos[i] = null;
                  esCorrecto = true;
                }
              }
            }
          }
          break;
      }
    }
  }
}
