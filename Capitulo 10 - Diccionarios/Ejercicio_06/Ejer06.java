package proyectos.Diccionarios.Ejercicio_06;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * Implementa el control de acceso al área restringida de un programa. Se debe 
 * pedir un nombre de usuario y una contraseña. Si el usuario introduce los
 * datos correctamente, el programa dirá “Ha accedido al área restringida”. El 
 * usuario tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades 
 * el programa dirá “Lo siento, no tiene acceso al área restringida”. Los 
 * nombres de usuario con sus correspondientes contraseñas deben estar 
 * almacenados en una estructura de la clase HashMap .
 * 
 * @author Javier Bernal Guerrero
 */
public class Ejer06 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    boolean esCorrecto = false;
    int contador = 0;
    String user;
    String password;
    
    HashMap<String, String> usuarios = new HashMap();
    
    usuarios.put("user1", "1234");
    usuarios.put("user2", "1234");
    usuarios.put("user3", "1234");
    
    while (contador != 3 && !esCorrecto) {
      System.out.print("Introduce el usuario: ");
      user = s.next();
      
      System.out.print("Introduce la contraseña: ");
      password = s.next();
      
      if ((usuarios.containsKey(user)) && (usuarios.get(user).equals(password))) {
        System.out.println("Ha accedido al área restringida.");
        esCorrecto = true;
        
      } else {
        if (contador == 3) {
          System.out.println("Lo siento, no tiene acceso al área restringida.");
        } else {
          System.out.println("Error durante la comprobacion. Por favor "
                  + "vuelva a intentarlo.\n");
        }

        contador++;
      }
    }
  }
}
