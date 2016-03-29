
package ejercicios.POO.Ejercicio_4;

/**
 *
 * Crea la clase Fracción. Los atributos serán numerador y denominador. Y 
 * algunos de los métodos pueden ser invierte, simplifica, multiplica, divide, 
 * etc.
 * 
 * @author Javier Bernal Guerrero
 */

public class Ejer4 {
    public static void main(String[] args) {
        Fraccion fraccion1 = new Fraccion(40, 20);
        Fraccion fraccion2 = new Fraccion(6, 12);

        fraccion1.simplifica();
        fraccion2.simplifica();
        
        System.out.println(fraccion1);
        System.out.println(fraccion2);
        
        fraccion1.multiplica(fraccion2);
        fraccion2.multiplica(2);
        
        System.out.println(fraccion1);
        System.out.println(fraccion2);
    }
}
