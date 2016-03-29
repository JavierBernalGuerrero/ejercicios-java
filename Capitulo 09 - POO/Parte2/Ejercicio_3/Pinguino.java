
package ejercicios.Ejercicio_3;

public class Pinguino extends Ave {
    
    public Pinguino(String sexo, int edad) {
        this.sexo = sexo;
        this.edad = edad;
    }
    
    public Pinguino() {
        super();
    }
    
    public void nadar() {
        System.out.println("Mira como nado.");
    }
    
    @Override
    public void volar() {
        System.out.println("Yo no vuelo.");
    }
}
