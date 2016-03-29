
package ejercicios.Ejercicio_3;

public class Canario extends Ave {
    
    public Canario(String sexo, int edad) {
        this.sexo = sexo;
        this.edad = edad;
    }
    
    public Canario() {
        super();
    }
    
    public void piar() {
        System.out.println("¡Pio! ¡Pio!");
    }
}
