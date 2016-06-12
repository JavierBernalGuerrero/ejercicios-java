package proyectos.Diccionarios.Ejercicio_07;

public class Moneda {
  
  // final - Indica que los valores son constantes.
  private static final String[] valores = {"1 céntimo", "2 céntimos", "5 céntimos", 
    "10 céntimos", "25 céntimos", "50 céntimos", "1 euro", "2 euros"};
  
  private static final String[] posiciones = {"cara", "cruz"};
  
  private String valor;
  private String posicion;

  public Moneda() {
    this.valor = valores[(int)(Math.random() * 8)];
    this.posicion = posiciones[(int)(Math.random() * 2)];
    
  }
  
  public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }

  public String getPosicion() {
    return posicion;
  }

  public void setPosicion(String posicion) {
    this.posicion = posicion;
  }

  @Override
  public String toString() {
    return this.valor + " - " + this.posicion;
  }
}
