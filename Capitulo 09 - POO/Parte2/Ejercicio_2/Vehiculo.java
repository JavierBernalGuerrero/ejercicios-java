
package ejercicios.POO.Ejercicio_2;

public abstract class Vehiculo {
    private static int vehiculosCreados;
    private static int kilometrosTotales;

    public static int getVehiculosCreados() {
        return vehiculosCreados;
    }

    public static void setVehiculosCreados(int vehiculosCreados) {
        Vehiculo.vehiculosCreados = vehiculosCreados;
    }

    public static int getKilometrosTotales() {
        return kilometrosTotales;
    }

    public static void setKilometrosTotales(int kilometrosTotales) {
        Vehiculo.kilometrosTotales = kilometrosTotales;
    }
    
    
}
