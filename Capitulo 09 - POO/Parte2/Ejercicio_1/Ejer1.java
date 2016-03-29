package ejercicios.POO.Ejercicio_1;

/**
 *
 * Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
 * instancias y aplicándole algunos métodos.
 * 
 * @author Javier Bernal Guerrero
 */
public class Ejer1 {
    public static void main(String[] args) {
        Caballo caballo1 = new Caballo();
        Caballo caballo2 = new Caballo("Mustang", 25.3, 2);
        
        System.out.print(caballo1);
        System.out.println(caballo2);
        
        caballo1.trotar();
        caballo1.setPeso(19.0);
        
        caballo2.galopar();
        caballo2.setPeso(23.5);
        
        System.out.print(caballo1);
        System.out.println(caballo2);
        
        // Preguntar como obtener el nombre del objeto creado.
    }
}
