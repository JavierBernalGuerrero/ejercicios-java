
package POO.Ejercicio_5;

public class Pizza {

  private static int pizzasPedidas;
  private static int pizzasServidas;

  private String tamaño;
  private String tipo;
  private Estado estado;

  public Pizza(String tamaño, String tipo) {
    this.tamaño = tamaño;
    this.tipo = tipo;
    this.estado = Estado.pedida;
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
    
  public void setEstado(Estado estado) {
    this.estado = estado;
  }
  
  public void sirve() {
    if (this.estado.equals(Estado.pedida)) {
      this.estado = Estado.servida;
      setTotalServidas(getTotalServidas() + 1);
    } else {
      System.out.println("Esa pizza ya se ha servido");
    }
  }

  @Override
  public String toString() {
    return "pizza " + tamaño + " " + tipo + ", " + estado;
  }

  
}
