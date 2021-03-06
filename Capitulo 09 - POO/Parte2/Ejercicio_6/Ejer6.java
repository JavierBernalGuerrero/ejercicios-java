
package ejercicios.POO.Ejercicio_6;

/**
 *
 * Crea la clase Tiempo con los métodos suma y resta. Los objetos de la clase
 * Tiempo son intervalos de tiempo y se crean de la forma Tiempo t = new
 * Tiempo(1, 20, 30) donde los parámetros que se le pasan al constructor son las
 * horas, los minutos y los segundos respectivamente. Crea el método toString
 * para ver los intervalos de tiempo de la forma 10h 35m 5s. Si se suman por
 * ejemplo 30m 40s y 35m 20s el resultado debería ser 1h 6m 0s. Realiza un
 * programa de prueba para comprobar que la clase funciona bien.
 * 
 * @author Javier Bernal Guerrero
 */

public class Ejer6 {
    public static void main(String[] args) {
        Tiempo temp1 = new Tiempo(0, 59, 59);
        Tiempo temp2 = new Tiempo(2, 800, 20);
        
        System.out.println(temp1);
        System.out.println(temp2);
        
        temp1.suma(temp2);
        System.out.println("La suma de ambos =" + temp1);
        
        temp1.resta(temp2);
        System.out.println("La resta de ambos =" + temp1);
        
    }
}
