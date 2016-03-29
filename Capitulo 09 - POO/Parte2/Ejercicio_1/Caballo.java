package ejercicios.POO.Ejercicio_1;

public class Caballo {
    private String raza;
    private double peso;
    private int edad;

    public Caballo() {
        this.peso = 20.0;
    }
        
    public Caballo(String raza, double peso, int edad) {
        this.raza = raza;
        this.peso = peso;
        this.edad = edad;
    }
    
    // Getters y Setters
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

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
    // ----
    
    // Metodos
    public void relinchar() {
        System.out.println("¡Iiiiih!");
    }
    
    public void trotar() {
        System.out.println("trocotro...");
    }
    
    public void galopar() {
        System.out.println("trocotro... (pero más rapido)");
    }
    // ----

    @Override
    public String toString() {
        return "\nRaza: " + this.raza +
                "\nPeso: " + this.peso +
                "\nEdad: " + this.edad +
                "\n";
    }
}
