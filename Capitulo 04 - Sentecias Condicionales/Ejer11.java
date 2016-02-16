/**
 *Escribe un programa que dada una hora determinada (horas y minutos), calcule los
 *segundos que faltan para llegar a la medianoche.
 * 
 *@author Javier Bernal
 */
 
 public class Ejer11 { 
  public static void main(String[] args) {

    int horas = 0;
    int minutos = 0;
    int segundos = 0;

    System.out.println("Calcular el tiempo restante hasta medianoche");
    System.out.println("--------------------------------------------");
    System.out.print("Por favor, introduce la hora: ");
      int valorHora = Integer.parseInt(System.console().readLine());

    System.out.print("Por favor, los minutos: ");
    int valorMin = Integer.parseInt(System.console().readLine());

    if ((valorHora >= 0) && (valorHora <= 23)) {
      if ((valorMin >= 0) && (valorMin < 60)) {
        horas = ((23 - valorHora) * 3600);
    
        minutos = ((60 - valorMin) * 60);

        segundos = (horas + minutos);

        System.out.print("Quedan " + segundos + "seg para la medianoche.");
      } else {
        System.out.print("El valor en minutos introducido no es valido.");
      }
            
    } else {
      System.out.print("El valor en horas introducido no es valido.");
    }   
  }
}
