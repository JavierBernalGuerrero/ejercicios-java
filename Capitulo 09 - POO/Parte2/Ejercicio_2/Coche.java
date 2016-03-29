package ejercicios.POO.Ejercicio_2;

/**
 *
 * @author Javier Bernal Guerrero
 */
public class Coche {
    private static int kilometrosRecorridos;

    public Coche() {
        Vehiculo.setVehiculosCreados(Vehiculo.getVehiculosCreados() + 1);
    }
    
    public static int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public static void setKilometrosRecorridos(int kilometrosRecorridos) {
        Coche.kilometrosRecorridos = kilometrosRecorridos;
    }
    
    public void recorrer(int km) {
        System.out.println("run run..");
        this.kilometrosRecorridos += km;
        Vehiculo.setKilometrosTotales(Vehiculo.getKilometrosTotales() + km);
    }
    
    public void quemarRueda() {
        System.out.println("Como mola... ¡QUE TE CARGAS LAS RUEDAS!");
    }
}
