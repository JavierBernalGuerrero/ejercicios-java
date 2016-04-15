package POO.Ejercicio_2;

/**
 *
 * @author Javier Bernal Guerrero
 */
public class Bicicleta extends Vehiculo {
  
    public Bicicleta() {
      super();
    }
    
    public void hacerCaballito(int km) {
        System.out.println("Cuidado que te caes.");
        setKilometrosRecorridos(getKilometrosRecorridos() + km);
        Vehiculo.setKilometrosTotales(Vehiculo.getKilometrosTotales() + km);
    }
}
