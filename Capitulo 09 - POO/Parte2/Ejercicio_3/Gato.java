
package ejercicios.Ejercicio_3;

public class Gato extends Mamifero {
    
    public Gato(String sexo, int edad) {
        this.sexo = sexo;
        this.edad = edad;
    }
    
    public Gato() {
        super();
    }
    
    public void maullar() {
        System.out.println("Miauuu..");
    }
}
