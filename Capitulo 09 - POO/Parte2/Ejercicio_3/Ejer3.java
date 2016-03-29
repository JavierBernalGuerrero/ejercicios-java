
package ejercicios.Ejercicio_3;

/**
 *
 * Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y
 * Lagarto. Crea, al menos, tres métodos específicos de cada clase y redefne
 * el/los método/s cuando sea necesario. Prueba las clases creadas en un
 * programa en el que se instancien objetos y se les apliquen métodos.
 * 
 * @author Zane
 */

public class Ejer3 {
    public static void main(String[] args) {
        // Perro
        Perro perro1 = new Perro();
        perro1.saludar();
        perro1.gruñir();
        perro1.ladrar();
        perro1.andar();
        perro1.dormir();
        
        // Gato
        Gato gato1 = new Gato();
        gato1.saludar();
        gato1.maullar();
        gato1.andar();
        gato1.dormir();
        
        // Canario
        Canario canario1 = new Canario();
        canario1.saludar();
        canario1.volar();
        canario1.andar();
        canario1.dormir();

        // Pinguino
        Pinguino pinguino1 = new Pinguino();
        pinguino1.saludar();
        pinguino1.volar();
        pinguino1.nadar();
        pinguino1.andar();
        pinguino1.dormir();
        
        // Lagarto
        Lagarto lagarto1 = new Lagarto(2.3);
        lagarto1.saludar();
        lagarto1.andar();
        lagarto1.dormir();
        
    }
}
