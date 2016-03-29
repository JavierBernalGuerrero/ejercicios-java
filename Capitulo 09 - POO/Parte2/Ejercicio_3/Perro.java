
package ejercicios.Ejercicio_3;

public class Perro extends Mamifero {
    
    public Perro(String sexo, int edad) {
        this.sexo = sexo;
        this.edad = edad;
    }
    
    public Perro() {
        super();
    }
    
    public void gruñir() {
        System.out.println("¡Grrr..!");
    }
    
    public void ladrar() {
        System.out.println("¡GUAU! ¡GUAU!");
    }
}
