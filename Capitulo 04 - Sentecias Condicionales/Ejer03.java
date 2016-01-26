/**
 *Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre
 *del día de la semana.
 * 
 *@author Javier Bernal
 */

public class Ejer03 { 
  public static void main(String[] args) {

  System.out.print("Por favor, introduzca el numero del dia que quiere conocer: ");
    int numero = Integer.parseInt(System.console().readLine());

    String dia;
    
   switch (numero) {
      case 1:
        dia = "Lunes";
        break;
      case 2:
        dia = "Martes";
        break;
      case 3:
        dia = "Miercoles";
        break;
      case 4:
        dia = "Jueves";
        break;
      case 5:
        dia = "Viernes";
        break;
      case 6:
        dia = "Sabado";
        break;
      case 7:
        dia = "Domingo";
        break;
      default:
        dia = "error";
    }
    if (dia.equals("error")) {
      System.out.println("El valor introducido es incorrecto");
    } else {
      System.out.println("Esa me la sé, el dia del que hablas es: " + dia);
    }
  }
}
