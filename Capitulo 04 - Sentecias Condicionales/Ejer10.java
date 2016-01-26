/**
 *Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento.
 * 
 *@author Javier Bernal
 */

public class Ejer10 { 
  public static void main(String[] args) {
    
  //http://www.euroresidentes.com/Diversion/fechas_horoscopo_zodiaco.htm
  
    System.out.println("Descubre tu Horoscopos");
    System.out.println("--------------------");
    System.out.print("Introduce primero el dia en numeros: ");
    int dia = Integer.parseInt(System.console().readLine());
    
    System.out.print("Ahora introduce el mes en letras: ");
    String mes = System.console().readLine().toLowerCase();

    if ((dia <= 0) && (dia >= 31)) {
    System.out.print("El dia introducido no es valido");
    }

    int error = 0;

    switch (mes) {
      case "enero":
        if ((dia > 0) && (dia <= 19)) {
          System.out.print("Tu signo es Capricornio");
        }
        if ((dia > 19) && (dia <= 31)) {
          System.out.print("Tu signo es Acuario");
        }
      break;
      case "febrero":
        if ((dia > 0) && (dia <= 18)) {
          System.out.print("Tu signo es Acuario");
        }
        if ((dia > 18) && (dia <= 28)) {
          System.out.print("Tu signo es Piscis");
        }
      break;
      case "marzo":
        if ((dia > 0) && (dia <= 21)) {
          System.out.print("Tu signo es Piscis");
        }
        if ((dia > 21) && (dia <= 31)) {
          System.out.print("Tu signo es Aries");
        }
      break;
      case "abril":
        if ((dia > 0) && (dia <= 20)) {
          System.out.print("Tu signo es Aries");
        }
        if ((dia > 20) && (dia <= 30)) {
          System.out.print("Tu signo es Tauro");
        }
      break;
      case "mayo":
        if ((dia > 0) && (dia <= 20)) {
          System.out.print("Tu signo es Tauro");
        }
        if ((dia > 20) && (dia <= 31)) {
          System.out.print("Tu signo es Geminis");
        }
      break;
      case "junio":
        if ((dia > 0) && (dia <= 20)) {
          System.out.print("Tu signo es Geminis");
        }
        if ((dia > 20) && (dia <= 31)) {
          System.out.print("Tu signo es Cancer");
        }
      break;
      case "julio":
        if ((dia > 0) && (dia <= 20)) {
          System.out.print("Tu signo es Cancer");
        }
        if ((dia > 20) && (dia <= 30)) {
          System.out.print("Tu signo es Leo");
        }
      break;
      case "agosto":
        if ((dia > 0) && (dia <= 21)) {
          System.out.print("Tu signo es Leo");
        }
        if ((dia > 21) && (dia <= 31)) {
          System.out.print("Tu signo es Virgo");
        }
      break;
      case "septiembre":
        if ((dia > 0) && (dia <= 22)) {
          System.out.print("Tu signo es Virgo");
        }
        if ((dia > 22) && (dia <= 30)) {
          System.out.print("Tu signo es Libra");
        }
      break;
      case "octubre":
        if ((dia > 0) && (dia <= 22)) {
          System.out.print("Tu signo es Libra");
        }
        if ((dia > 22) && (dia <= 31)) {
          System.out.print("Tu signo es Escorpio");
        }
      break;
      case "noviembre":
        if ((dia > 0) && (dia <= 22)) {
          System.out.print("Tu signo es Escorpio");
        }
        if ((dia > 22) && (dia <= 30)) {
          System.out.print("Tu signo es Sagitario");
        }
      break;
      case "diciembre":
        if ((dia > 0) && (dia <= 20)) {
          System.out.print("Tu signo es Sagitario");
        }
        if ((dia > 20) && (dia <= 31)) {
          System.out.print("Tu signo es Capricornio");
        }
      break;

      default:
        error = 1;
  }
  
    if (error == 1) {
      System.out.print("Se a producido un error, comprueba que los datos introducidos son correctos.");
    }
  }
}

