
package ejercicios.POO.Ejercicio_2;

import java.util.Scanner;

/**
 *
 * Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases
 * de la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreadosykilometrosTotales,
 * así como el atributo de instancia kilometrosRecorridos. Crea también algún
 * método específico para cada una de las subclases.
 * 
 * @author Javier Bernal Guerrero
 */
public class Ejer2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    
        Coche coche1 = new Coche();
        Bicicleta bici1 = new Bicicleta();
        
        int eleccion = 0;
        int distancia;
        
        System.out.println(" VEHICULOS");
        System.out.println("===========");
        
        while (eleccion != 8) {
            System.out.println("1. Anda con la bicicleta.");
            System.out.println("2. Haz el caballito con la bicicleta.");
            System.out.println("3. Anda con el coche.");
            System.out.println("4. Quema rueda con el coche.");
            System.out.println("5. Ver kilometraje de la bicicleta.");
            System.out.println("6. Ver kilometraje del coche.");
            System.out.println("7. Ver kilometraje total.");
            System.out.println("8. Salir.");
            System.out.println("·····································");
            
            System.out.print("Elige una opcion: ");
            eleccion = s.nextInt();
            
            switch (eleccion) {
                case 1:
                    System.out.print("¿Cuanta distancia quieres recorrer? ");
                    distancia = s.nextInt();
                    bici1.recorrer(distancia);
                    break;
                case 2:
                    System.out.print("¿Cuanta distancia quieres recorrer? ");
                    distancia = s.nextInt();
                    bici1.hacerCaballito(distancia);
                    break;
                case 3:
                    System.out.print("¿Cuanta distancia quieres recorrer? ");
                    distancia = s.nextInt();
                    coche1.recorrer(distancia);
                    break;
                case 4:
                    System.out.print("¿Cuanta distancia quieres recorrer? ");
                    distancia = s.nextInt();
                    coche1.quemarRueda();
                    break;
                case 5:
                    System.out.println("Con la bicicleta has recorrido un "
                            + "total de " + bici1.getKilometrosRecorridos()
                            + "km.");
                    break;
                case 6:
                    System.out.println("Con el coche has recorrido un "
                            + "total de " + coche1.getKilometrosRecorridos()
                            + "km.");
                    break;
                case 7:
                    System.out.println("En total has recorrido un total de " 
                            + Vehiculo.getKilometrosTotales() + "km.");
                    break;
            }
            System.out.println("\n=================");
        }
    }
}
