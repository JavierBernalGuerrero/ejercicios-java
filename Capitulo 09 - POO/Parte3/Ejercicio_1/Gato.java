
package POO.Parte3.Ejercicio_1;

public class Gato extends Animal {
  
  public Gato(String sexo, int edad) {
    this.sexo = sexo;
    this.edad = edad;
  }

  public Gato() {
    this.sexo = "macho";
  }
  
  public Gato(String nombre) {
    this.nombre = nombre;
  }

  public void maullar() {
    System.out.println("Miauuu..");
  }
}
