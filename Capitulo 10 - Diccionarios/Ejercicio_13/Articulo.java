package proyectos.Diccionarios.Ejercicio_13;

public class Articulo {
  static int capacidadAlmacen = 50;

  private String codigo;
  private String descripcion;
  private int stock;
  private double precioCompra;
  private double precioVenta;

  public Articulo() { // Crea articulos aleatorios para ejemplo
    this.codigo = "z" + (int)((Math.random() * 100) + 1);
    this.stock = (int)((Math.random() * 100) + 1);
    this.precioVenta = (int)((Math.random() * 10) + 1);
    this.descripcion = "";

  }

  public Articulo(String codigo, String descripcion, int stock, double precioCompra, double precioVenta) {
    this.codigo = codigo;
    this.descripcion = descripcion;
    this.stock = stock;
    this.precioCompra = precioCompra;
    this.precioVenta = precioVenta;

  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public double getPrecioCompra() {
    return precioCompra;
  }

  public void setPrecioCompra(double precioCompra) {
    this.precioCompra = precioCompra;
  }

  public double getPrecioVenta() {
    return precioVenta;
  }

  public void setPrecioVenta(double precioVenta) {
    this.precioVenta = precioVenta;
  }
  
  @Override
  public String toString() {
    return "\nCodigo: " + this.codigo +
      "\nStock: " + this.stock +
      "\nPrecio de venta: " + this.precioVenta +
      "\nPrecio de compra: " + this.precioCompra +
      "\nDescripccion: " + this.descripcion + 
      "\n····························";
  }
  
  @Override
  public boolean equals(Object obj) {
    if (this.getClass() == obj.getClass()) {
      Articulo articulo = (Articulo) obj;
      if ((this.codigo).equals(articulo.getCodigo())) {
        return true;
      }
    }
    return false;
  }
}
