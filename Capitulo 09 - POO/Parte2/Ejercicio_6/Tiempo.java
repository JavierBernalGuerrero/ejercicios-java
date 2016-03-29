
package ejercicios.POO.Ejercicio_6;

public class Tiempo {
  private int hora;
  private int minuto;
  private int segundo;

  public Tiempo(int horas, int minutos, int segundos) {
    this.hora = horas;
    this.minuto = minutos;
    this.segundo = segundos;
    
  }

  public int getHora() {
    return hora;
  }

  public void setHora(int hora) {
    this.hora = hora;
  }

  public int getMinuto() {
    return minuto;
  }

  public void setMinuto(int minuto) {
    this.minuto = minuto;
  }

  public int getSegundo() {
    return segundo;
  }

  public void setSegundo(int segundo) {
    this.segundo = segundo;
  }

  public void suma(Tiempo tiempo) {
    this.hora += tiempo.hora;
    this.minuto += tiempo.minuto;
    this.segundo += tiempo.segundo;
    this.corregir();
  }

  public void resta(Tiempo tiempo) {
    // Para realizar esta operacion con presicion, pasamos el tiempo a 
    // segundos, realizamos la operacion y luego corregimos el resultados.
    // Transforma en segundos el tiempo1
    this.minuto += this.hora * 60;
    this.segundo += this.minuto * 60;
    
    this.hora = 0;
    this.minuto = 0;
    
    // Transforma en segundos el tiempo2
    tiempo.minuto += tiempo.hora * 60;
    tiempo.segundo += tiempo.minuto * 60;
    
    tiempo.hora = 0;
    tiempo.minuto = 0;
    
    // Realiza la operacion
    this.segundo -= tiempo.segundo;
    
    this.corregir();
  }
    
  public void corregir() {
    while ((this.minuto >= 60) || (this.segundo >= 60)) {
      if (this.segundo >= 60) {
        this.segundo -= 60;
        this.minuto += 1;
      }
      if (this.minuto >= 60) {
        this.minuto -= 60;
        this.hora += 1;
      }
    }
  }

  @Override
  public String toString() {
    this.corregir();
    return this.hora + "h " + this.minuto + "m " + this.segundo + "s.";
  }
}
