/**
 *Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas que se imparten
 *en el curso. Cada pregunta acertada sumará un punto. El programa mostrará al final la
 *calificación obtenida. Pásale el minicuestionario a tus compañeros y pídeles que lo hagan
 *para ver qué tal andan de conocimientos en las diferentes asignaturas del curso.
 * 
 *@author Javier Bernal
 */

public class Ejer12 { 
  public static void main(String[] args) {
  
    int puntuacion = 0;
  
    System.out.print("1º ¿Cual es la capital de Kiribati? ");
    String respuesta = System.console().readLine().toLowerCase();
    
    if (respuesta.equals("tarawa")) {
      System.out.println("¡La respuesta es correcta!");
      puntuacion = puntuacion + 1;
    } else {
      System.out.println("Lo siento, la respuesta es incorrecta.");
    }

    System.out.print("2º ¿Cual es la unidad central de procesamiento? ");
      respuesta = System.console().readLine().toLowerCase();
      if (respuesta.equals("cpu")) {
        System.out.println("¡La respuesta es correcta!");
        puntuacion = puntuacion + 1;
      } else {
        System.out.println("Lo siento, la respuesta es incorrecta.");
      }

    System.out.print("3º ¿Cuales son las siglas de diagrama de estructura de datos? ");
      respuesta = System.console().readLine().toLowerCase();
      if (respuesta.equals("ded")) {
        System.out.println("¡La respuesta es correcta!");
        puntuacion = puntuacion + 1;
      } else {
        System.out.println("Lo siento, la respuesta es incorrecta.");
      }

    System.out.print("4º ¿Con que lenguaje se a realizado este programa? ");
      respuesta = System.console().readLine().toLowerCase();
      if (respuesta.equals("java")) {
        System.out.println("¡La respuesta es correcta!");
        puntuacion = puntuacion + 1;
      } else {
        System.out.println("Lo siento, la respuesta es incorrecta.");
      }

    System.out.print("5º ¿Que etiqueta es la mas importante en HTML? ");
      respuesta = System.console().readLine().toLowerCase();
      if (respuesta.equals("html")) {
        System.out.println("¡La respuesta es correcta!");
        puntuacion = puntuacion + 1;
      } else {
        System.out.println("Lo siento, la respuesta es incorrecta.");
      }

    System.out.print("6º ¿Cual fue la primera computadora de propositos generales? ");
      respuesta = System.console().readLine().toLowerCase();
      if (respuesta.equals("eniac")) {
        System.out.println("¡La respuesta es correcta!");
        puntuacion = puntuacion + 1;
      } else {
        System.out.println("Lo siento, la respuesta es incorrecta.");
      }

    System.out.print("7º ¿Que IDE utilizamos para programar en Java? ");
      respuesta = System.console().readLine().toLowerCase();
      if (respuesta.equals("geany")) {
        System.out.println("¡La respuesta es correcta!");
        puntuacion = puntuacion + 1;
      } else {
        System.out.println("Lo siento, la respuesta es incorrecta.");
      }

    System.out.print("8º ¿Que elemento caracterizo la Segunda Generacion de ordenadores? ");
      respuesta = System.console().readLine().toLowerCase();
      if (respuesta.equals("transistor")) {
        System.out.println("¡La respuesta es correcta!");
        puntuacion = puntuacion + 1;
      } else {
        System.out.println("Lo siento, la respuesta es incorrecta.");
      }

    System.out.print("9º ¿Que metodologia de desarrollo de software usa el Gobierno de España? ");
      respuesta = System.console().readLine().toLowerCase();
      if (respuesta.equals("metrica")) {
        System.out.println("¡La respuesta es correcta!");
        puntuacion = puntuacion + 1;
      } else {
        System.out.println("Lo siento, la respuesta es incorrecta.");
      }

    System.out.print("10º ¿Que significa la 'R' en RAM? ");
      respuesta = System.console().readLine().toLowerCase();
      if (respuesta.equals("random")) {
        System.out.println("¡La respuesta es correcta!");
        puntuacion = puntuacion + 1;
      } else {
        System.out.println("Lo siento, la respuesta es incorrecta.");
      }
      
    System.out.println("Tu puntuacion es: " + puntuacion);
  
  
  
  
  }
}
