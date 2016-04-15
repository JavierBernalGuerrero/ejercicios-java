package proyectos.Programacion_Orientada_Objeto.Ejercicio_4;

import java.util.Scanner;

public class Disco {
    Scanner s = new Scanner(System.in);
  
  private String nombre;
  private String autor;
  private int duracion;
  private int codigo;

  public Disco() {
    this.nombre = "";
  }
  
  public Disco(String nombre, String autor, int duracion, int codigo) {
    this.nombre = nombre;
    this.autor = autor;
    this.duracion = duracion;
    this.codigo = codigo;
  }
  
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getDuracion() {
    return duracion;
  }

  public void setDuracion(int duracion) {
    this.duracion = duracion;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public static boolean buscaCodigo(Disco[] arrayDiscos, int codigo) {
    for (Disco i : arrayDiscos) {
      if (i != null) {
        if (i.getCodigo() == codigo) {
          return true;
        }
      }
    }
    return false;
  }
  
  @Override
  public String toString() {
    return "\n\t||Nombre: " + nombre +
            "\n\t||Autor: " + autor +
            "\n\t||Duracion: " + duracion +
            "\n\t||Codigo: " + codigo;
  }
}
