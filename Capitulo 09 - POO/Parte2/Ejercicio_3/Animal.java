
package ejercicios.Ejercicio_3;

public abstract class Animal {
    protected double peso;
    protected int edad;
    protected String sexo;

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
    public void saludar() {
        System.out.println("\nHola, soy un " + getClass().getSimpleName());
    }
    
    public void andar() {
        System.out.println("Mira como ando.");
    }
    
    public void dormir() {
        System.out.println("Zzz.. Zzz..");
    }
}
