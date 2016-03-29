
package ejercicios.Ejercicio_3;

public class Lagarto extends Animal {
    
    public Lagarto(double peso) {
        this.sexo = "Macho";
        this.peso = peso;
    }
    
    @Override
    public void andar() {
        System.out.println("Yo no ando, pero me arrastro.");
    }
}
