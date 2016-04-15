
package POO.Ejercicio_2;

public abstract class Vehiculo {
  private static int vehiculosCreados;
  private static int kilometrosTotales;

  public int getKilometrosRecorridos() {
    return kilometrosRecorridos;
  }

  public void setKilometrosRecorridos(int kilometrosRecorridos) {
    this.kilometrosRecorridos = kilometrosRecorridos;
  }
  private int kilometrosRecorridos;

  public Vehiculo() {
    Vehiculo.vehiculosCreados++;
  }

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

  public void recorrer(int km) {
    if (this.getClass().getSimpleName().equalsIgnoreCase("Bicicleta")) {
      System.out.println("rin rin..");
    } else {
      System.out.println("run run..");
    }
    this.kilometrosRecorridos += km;
    Vehiculo.setKilometrosTotales(Vehiculo.getKilometrosTotales() + km);
  }
}
