
package ejercicios.POO.Ejercicio_5;

public class Pizza {

  private static int pizzasPedidas;
  private static int pizzasServidas;

  private String tamaño;
  private String tipo;
  private String estado;

  /*
  private enum Tamaño {
    mediana, familiar
  }

  private enum Tipo {
    margarita, cuatro_quesos, funghi
  }

  private enum Estado {
    pedida, servida
  }
  // COMO UTILIZAR LOS ENUMERADOS
  public Pizza(String tamaño, String tipo) {
    Tamaño = tamaño;
  }*/

  public Pizza(String tamaño, String tipo) {
    this.tamaño = tamaño;
    this.tipo = tipo;
    this.estado = "Pedida";
    setTotalesPedidas(getTotalPedidas() + 1);
  }

  public static int getTotalPedidas() {
    return pizzasPedidas;
  }

  public static void setTotalesPedidas(int pizzasPedidas) {
    Pizza.pizzasPedidas = pizzasPedidas;
  }

  public static int getTotalServidas() {
    return pizzasServidas;
  }

  public static void setTotalServidas(int pizzasServidas) {
    Pizza.pizzasServidas = pizzasServidas;
  }

  public String getTamaño() {
    return this.tamaño;
  }
  
  public String getTipo() {
    return this.tipo;
  }
  
  public String getEstado() {
    return this.estado;
  }
  
  public void setEstado(String estado) {
    this.estado = estado;
  }
  
  public static void sirve() {
    if (this.estado.equalsIgnoreCase("pedida")) {
      this.estado = "servida";
      setTotalServidas(getTotalServidas() + 1);
    } else {
      System.out.println("Esa pizza ya se ha servido");
    }
  }

  @Override
  public String toString() {
    return "pizza " + tipo + " " + tamaño + ", " + estado;
  }

  
}
