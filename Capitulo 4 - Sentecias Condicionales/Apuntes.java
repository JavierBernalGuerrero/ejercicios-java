/**
 *Apuntes de sentencia condicional if y switch
 * 
 *@author Javier Bernal
 */

public class Apuntes { 
  public static void main(String[] args) {

      //String dia = (System.console().readLine()).toUpperCase(); transforma toda la linea introducida en mayusculas
      //String dia = (System.console().readLine()).toLowerCase(); transforma toda la line introducida en minusculas

    System.out.print("¿Cuál es la capital de Kiribati? ");
    String respuesta = System.console().readLine();

    if (respuesta.equals("Tarawa")) {
      System.out.println("¡La respuesta es correcta!");
    } else {
      System.out.println("Lo siento, la respuesta es incorrecta.");
    }

  //Usar si existen 3 o mas "if"

    System.out.print("Por favor, introduzca un numero de mes: ");
    int mes = Integer.parseInt(System.console().readLine());

    String nombreDelMes;

    switch (mes) {
      case 1:
        nombreDelMes = "enero";
        break;
      case 2:
        nombreDelMes = "febrero";
        break;
      case 3:
        nombreDelMes = "marzo";
        break;
      case 4:
        nombreDelMes = "abril";
        break;
      case 5:
        nombreDelMes = "mayo";
        break;
      case 6:
        nombreDelMes = "junio";
        break;
      case 7:
        nombreDelMes = "julio";
        break;
      case 8:
        nombreDelMes = "agosto";
        break;
      case 9:
        nombreDelMes = "septiembre";
        break;
      case 10:
        nombreDelMes = "octubre";
        break;
      case 11:
        nombreDelMes = "noviembre";
        break;
      case 12:
        nombreDelMes = "diciembre";
        break;
      default:
        nombreDelMes = "no existe ese mes";
    }

    System.out.println("Mes " + mes + ": " + nombreDelMes);
  }
}
