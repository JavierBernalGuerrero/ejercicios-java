/*
 *  Realiza el juego de las 3 en raya.
 *
 * @author Javier Bernal Guerrero
 */

package ejercicios;

import java.util.Scanner;

public class Ejer10 {
  public static void main(String[] args) 
    throws InterruptedException {
    Scanner s = new Scanner(System.in);
    
    boolean youWin = false;
    boolean esCorrecto = false;
    
    int concentracion;
    int nTurno = 1;
    
    int x;
    int y;
    String[][] casilla = new String[3][3];
        
    int xAleatoria;
    int yAleatoria;
    
    for(y = 0; y < 3; y++) {
      for(x = 0; x < 3; x++) {
        casilla[x][y] = " ";
      }
    } // Pinta espacios en todo el tablero
    
    
    ///////// Pinta el tablero ////////////////
    
    /*
    System.out.println("\n┌───┬───┬───┬───┐");
    for(y = 0; y < 3; y++) {
      System.out.print("│ " + (y + 1) + " │");
      for(x = 0; x < 3; x++) {
        System.out.printf(" %1s │", casilla[x][y]);
      }
      if (y == 2) {
        System.out.println("\n└───┼───┼───┼───┤");
      } else {
        System.out.println("\n├───┼───┼───┼───┤");
      }
    }
    System.out.println("    │ 1 │ 2 │ 3 │");
    System.out.println("    └───┴───┴───┘"); 
    */
    
    ///////////////////////////////////////
    
    do {
      concentracion = (int)(Math.random() * 50);
      ///////////// RAYAS //////////////
      System.out.println("\nTurno para rayas");
      System.out.print("Calculando coordenadas.");
      Thread.sleep((1000 + concentracion*nTurno)^nTurno);
      System.out.print(".");
      Thread.sleep((1000 + concentracion*nTurno)^nTurno);
      System.out.println(".");
      
      do {
          xAleatoria = (int)(Math.random() * 3);
          yAleatoria = (int)(Math.random() * 3);
      
        if (casilla[xAleatoria][yAleatoria].equals(" ")) {
          casilla[xAleatoria][yAleatoria] = "X";
          esCorrecto = true;
        }
      } while (!esCorrecto); // Comprueba los datos introducidos
      esCorrecto = false;
      
      System.out.println("Columna: " + xAleatoria);
      System.out.println("Fila: " + yAleatoria);
      
      ///////////////COMPROBACION DE VICTORIA ////////////////
      
      youWin = (
        (casilla[0][0].equals("X")) && (casilla[0][1].equals("X")) && (casilla[0][2].equals("X")) ||
        (casilla[1][0].equals("X")) && (casilla[1][1].equals("X")) && (casilla[1][2].equals("X")) ||
        (casilla[2][0].equals("X")) && (casilla[2][1].equals("X")) && (casilla[2][2].equals("X")) || // Comprueba columnas
        (casilla[0][0].equals("X")) && (casilla[1][0].equals("X")) && (casilla[2][0].equals("X")) ||
        (casilla[0][1].equals("X")) && (casilla[1][1].equals("X")) && (casilla[2][1].equals("X")) ||
        (casilla[0][2].equals("X")) && (casilla[1][2].equals("X")) && (casilla[2][2].equals("X")) || // Comprueba filas
        (casilla[0][0].equals("X")) && (casilla[1][1].equals("X")) && (casilla[2][2].equals("X")) || // Comprueba diagonal \
        (casilla[0][2].equals("X")) && (casilla[1][1].equals("X")) && (casilla[2][0].equals("X"))    // Comprueba diagonal /
      ); 
      
      if (youWin == true) {
        System.out.println("¡Has perdido! Rayas Ganan");
      }
      
      //////////////////////////////////////////////
      
      System.out.println("\n┌───┬───┬───┬───┐");
      for(y = 0; y < 3; y++) {
        System.out.print("│ " + (y + 1) + " │");
        for(x = 0; x < 3; x++) {
          System.out.printf(" %1s │", casilla[x][y]);
        }
        if (y == 2) {
          System.out.println("\n└───┼───┼───┼───┤");
        } else {
          System.out.println("\n├───┼───┼───┼───┤");
        }
      }
    System.out.println("    │ a │ b │ c │");
    System.out.println("    └───┴───┴───┘"); 
      
      if (!youWin) {
        
        ///////////// Circulos //////////////
        System.out.println("\nTurno para circulos");
        System.out.println("Introduce las coordenadas. ");

        do {
          System.out.print("Columna: ");
            //int xIntroducida = Integer.parseInt(s.nextLine());
            String xIntroducida = s.nextLine().toLowerCase();
          
          int xIntroducidaConvertida = 0;
          
          switch (xIntroducida) {
            case "a":
              xIntroducidaConvertida = 0;
              break;
            case "b":
              xIntroducidaConvertida = 1;
              break;
            case "c":
              xIntroducidaConvertida = 2;
              break;
          }
          
          System.out.print("Fila: ");
            int yIntroducida = Integer.parseInt(s.nextLine());
            
          //xIntroducida = xIntroducida - 1;
          yIntroducida = yIntroducida - 1;

          if (casilla[xIntroducidaConvertida][yIntroducida].equals(" ")) {
            casilla[xIntroducidaConvertida][yIntroducida] = "O";
            esCorrecto = true;
          } else {
            System.out.println("Casilla ocupada, vuelve a introducir las coordenadas.");
          }
        } while (!esCorrecto); // Comprueba los datos introducidos
        esCorrecto = false;

        ///////////////COMPROBACION DE VICTORIA ////////////////

        youWin = (
          (casilla[0][0].equals("O")) && (casilla[0][1].equals("O")) && (casilla[0][2].equals("O")) ||
          (casilla[1][0].equals("O")) && (casilla[1][1].equals("O")) && (casilla[1][2].equals("O")) ||
          (casilla[2][0].equals("O")) && (casilla[2][1].equals("O")) && (casilla[2][2].equals("O")) || // Comprueba columnas
          (casilla[0][0].equals("O")) && (casilla[1][0].equals("O")) && (casilla[2][0].equals("O")) ||
          (casilla[0][1].equals("O")) && (casilla[1][1].equals("O")) && (casilla[2][1].equals("O")) ||
          (casilla[0][2].equals("O")) && (casilla[1][2].equals("O")) && (casilla[2][2].equals("O")) || // Comprueba filas
          (casilla[0][0].equals("O")) && (casilla[1][1].equals("O")) && (casilla[2][2].equals("O")) || // Comprueba diagonal \
          (casilla[0][2].equals("O")) && (casilla[1][1].equals("O")) && (casilla[2][0].equals("O"))    // Comprueba diagonal /
        ); 
      
        if (youWin == true) {
          System.out.println("¡Has ganado! Circulos ganan");
        }

        //////////////////////////////////////////////

        System.out.println("\n┌───┬───┬───┬───┐");
        for(y = 0; y < 3; y++) {
          System.out.print("│ " + (y + 1) + " │");
          for(x = 0; x < 3; x++) {
            System.out.printf(" %1s │", casilla[x][y]);
          }
          if (y == 2) {
            System.out.println("\n└───┼───┼───┼───┤");
          } else {
            System.out.println("\n├───┼───┼───┼───┤");
          }
        }
        System.out.println("    │ a │ b │ c │");
        System.out.println("    └───┴───┴───┘");  
        // Pinta resultado circulos
        
      } // Salta turno jugador. 
        // Permite que si gana el ordenador, no entre el turno del jugador.
        
      nTurno++;
    } while (!youWin);
  }
}
