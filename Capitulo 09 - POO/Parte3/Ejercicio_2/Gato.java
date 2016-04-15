
package POO.Parte3.Ejercicio_2;

public class Gato extends Animal {
  
  private String color;
  
  public Gato(String sexo, int edad) {
    this.sexo = sexo;
    this.edad = edad;
  }

  public Gato(String nombre, String color, String sexo) {
    this.nombre = nombre;
    this.color = color;
    this.sexo = sexo;
  }
  
  public Gato() {
    this.sexo = "macho";
  }
  
  public Gato(String nombre) {
    this.nombre = nombre;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
  
  public void maullar() {
    System.out.println("Miauuu..");
  }

  @Override
  public String toString() {
    return super.toString() + " y soy de color " + color;
  }
}
