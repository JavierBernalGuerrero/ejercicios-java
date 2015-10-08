/**
 *Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura
 *toca a primera hora ese día.
 * 
 *@author Javier Bernal
 */

public class Ejer01 { 
  public static void main(String[] args) {

  System.out.print("Por favor, introduzca un dia de la semana: ");
    String dia = (System.console().readLine()).toLowerCase();

    String asignatura = "";
    int error = 0;

   switch (dia) {
      case "lunes":
        asignatura = "Formacion y Orientacion Laboral";
        break;
      case "martes":
        asignatura = "Programacion";
        break;
      case "miercoles":
        asignatura = "Sistemas Informaticos";
        break;
      case "jueves":
        asignatura = "Programacion";
        break;
      case "viernes":
        asignatura = "Base de Datos";
        break;
      default:
        error = 1;

    }
    if (error == 0) {
      System.out.println("El " + dia + " tenemos: " + asignatura);
    } else {
      System.out.println("El dia de la semana introducido no es correcto");
    }
  }
}
