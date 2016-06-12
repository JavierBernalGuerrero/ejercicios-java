package POO.Parte3.Ejercicio_2;

public abstract class Animal {
  protected double peso;
  protected int edad;
  protected String sexo;

  protected String nombre;


  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  // Metodos
  public String saludar() {
    return "\nHola, soy " + nombre;
  }

  public void andar() {
    System.out.println("Mira como ando.");
  }

  public void dormir() {
    System.out.println("Zzz.. Zzz..");
  }

  @Override
  public String toString() {
    return "Soy un " + getClass().getSimpleName() + " y me llamo " + nombre;
  }
  
  
}
