/**
 * Realiza una programa que calcule las horas transcurridas entre dos horas de dos días de la 
 * semana. No se tendrán en cuenta los minutos ni los segundos. El día de la semana se puede pedir
 * como un número (del 1 al 7) o como una cadena (de “lunes” a “domingo”). Se debe comprobar que el
 * usuario introduce los datos correctamente y que el segundo día es posterior al primero. A
 * continuación se muestra un ejemplo:
 * 
 * Por favor, introduzca la primera hora.
 *  Día: lunes
 *  Hora: 18
 * Por favor, introduzca la segunda hora.
 *  Día: martes
 *  Hora: 20
 * Entre las 18:00h del lunes y las 20:00h del martes hay 26 hora/s.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer30 {
  public static void main(String[] args) {

    System.out.println(" Calcular horas");
    System.out.println("··················");
    System.out.print("Introduce un dia de la semana: ");
    String dia = System.console().readLine().toLowerCase();
    
    System.out.print("Introduce una hora: ");
    int hora1 = Integer.parseInt(System.console().readLine());
    
    int dia1 = 0;
    String nombreDia1 = "";
    
    int dia2 = 0;
    String nombreDia2 = "";
    
    switch (dia) {
      case "1":
      case "lunes":
        dia1 = 1;
        nombreDia1 = "Lunes";
        break;
      case "2":
      case "martes":
        dia1 = 2;
        nombreDia1 = "Martes";
        break;
      case "3":
      case "miercoles":
        dia1 = 3;
        nombreDia1 = "Miercoles";
        break;
      case "4":
      case "jueves":
        dia1 = 4;
        nombreDia1 = "Jueves";
        break;
      case "5":
      case "viernes":
        dia1 = 5;
        nombreDia1 = "Viernes";
        break;
      case "6":
      case "sabado":
        dia1 = 6;
        nombreDia1 = "Sabado";
        break;
      case "7":
      case "domingo":
        dia1 = 7;
        nombreDia1 = "Domingo";
        break;
      default:
        System.out.println("El dia introducido no es valido.");
      
    } // cierre if del primer dia
    
    System.out.println("Dia: " + dia1);
    System.out.println("Hora: " + hora1);
      
    System.out.print("Introduce un dia de la semana: ");
    dia = System.console().readLine().toLowerCase();
    
    System.out.print("Introduce una hora: ");
    int hora2 = Integer.parseInt(System.console().readLine());
      
      
    switch (dia) {
      case "1":
      case "lunes":
        dia2 = 1;
        nombreDia2 = "Lunes";
        break;
      case "2":
      case "martes":
        dia2 = 2;
        nombreDia2 = "Martes";
        break;
      case "3":
      case "miercoles":
        dia2 = 3;
        nombreDia2 = "Miercoles";
        break;
      case "4":
      case "jueves":
        dia2 = 4;
        nombreDia2 = "Jueves";
        break;
      case "5":
      case "viernes":
        dia2 = 5;
        nombreDia2 = "Viernes";
        break;
      case "6":
      case "sabado":
        dia2 = 6;
        nombreDia2 = "Sabado";
        break;
      case "7":
      case "domingo":
        dia2 = 7;
        nombreDia2 = "Domingo";
        break;
      default:
        System.out.println("El dia introducido no es valido.");
      
    }// cierre if del segundo dia
    
      System.out.println("Dia: " + dia2);
      System.out.println("Hora: " + hora2);
      
    if (dia1 < dia2) {
      if ((hora1 > 0) && (hora1 < 24) && (hora2 > 0) && (hora2 < 24)) {
        System.out.println("············································");
        System.out.print("Entre el " + nombreDia1 + " a las " + hora1 + ":00 y el " + nombreDia2 + " a las " + hora2);
        System.out.println(":00 hay " + (((dia2 * 24) + hora2) - ((dia1 * 24) + hora1)) + " horas");
      } else {
        System.out.println("La introduccion de horas no es correcta. Recuerda que las horas "
                                        + "de un dia estan comprendidas entre 00:00 y 23:00.");
      } // Controla el error de horas
      
    } else {
      System.out.println("La introduccion de dias no es correcta. El primer dia tiene que "
                                          + "ser antes que el segundo dia");
    } // Controla el error de dias
  }
}
