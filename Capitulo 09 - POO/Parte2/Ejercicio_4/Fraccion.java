
package ejercicios.POO.Ejercicio_4;

public class Fraccion {
    private int numerador;
    private int denominador;
    
    private int aux;
    
    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    public void invierte() {
        this.aux = this.numerador;
        this.numerador = this.denominador;
        this.denominador = this.aux;
    }
    
    public void simplifica() {
        while ((numerador % 2 == 0) && (denominador % 2 == 0)) {
            this.numerador /= 2;
            this.denominador /= 2;
        }
    }
    
    // MULTIPLICAR
    public void multiplica(Fraccion fraccion) {
        this.numerador *= fraccion.numerador;
        this.denominador *= fraccion.denominador;
    }
    
    public void multiplica(int entero) {
        this.numerador *= entero;
    }
    
    // DIVIDIR
    public void divide(Fraccion fraccion) {
        this.numerador *= fraccion.denominador;
        this.denominador *= fraccion.numerador;
    }
    
    public void divide(int entero) {
        this.denominador *= entero;
    }

    @Override
    public String toString() {
        return this.numerador + "/" + this.denominador;
    }
}
