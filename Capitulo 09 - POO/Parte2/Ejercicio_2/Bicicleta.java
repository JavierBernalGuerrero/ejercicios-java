package ejercicios.POO.Ejercicio_2;

/**
 *
 * @author Javier Bernal Guerrero
 */
public class Bicicleta {
    private static int kilometrosRecorridos;

    public Bicicleta() {
        Vehiculo.setVehiculosCreados(Vehiculo.getVehiculosCreados() + 1);
    }
    
    public static int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public static void setKilometrosRecorridos(int kilometrosRecorridos) {
        Bicicleta.kilometrosRecorridos = kilometrosRecorridos;
    }
    
    public void recorrer(int km) {
        System.out.println("rin rin..");
        this.kilometrosRecorridos += km;
        Vehiculo.setKilometrosTotales(Vehiculo.getKilometrosTotales() + km);
    }
    
    public void hacerCaballito(int km) {
        System.out.println("Cuidado que te caes.");
        this.kilometrosRecorridos += km;
        Vehiculo.setKilometrosTotales(Vehiculo.getKilometrosTotales() + km);
    }
}
