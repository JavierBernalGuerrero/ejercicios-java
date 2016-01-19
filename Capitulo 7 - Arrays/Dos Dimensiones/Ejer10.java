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
    
    boolean gameOver = false;
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
    /*
    for(y = 0; y < 3; y++) {
      for(x = 0; x < 3; x++) {
        System.out.print(casilla[x][y] + " |");
      }
      System.out.println("");
    } // Muestra el tablero
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
      
      if (casilla[0][0].equals("X") && (casilla[0][1].equals("X")) && (casilla[0][2].equals("X"))) {
        System.out.println("¡Has perdido! Rayas Ganan");
        gameOver = true;
      }
      if (casilla[1][0].equals("X") && (casilla[1][1].equals("X")) && (casilla[1][2].equals("X"))) {
        System.out.println("¡Has perdido! Rayas Ganan");
        gameOver = true;
      }
      if (casilla[2][0].equals("X") && (casilla[2][1].equals("X")) && (casilla[2][2].equals("X"))) {
        System.out.println("¡Has perdido! Rayas Ganan");
        gameOver = true;
      } // Hasta aqui se comprueban las filas
      
      if (casilla[0][0].equals("X") && (casilla[1][0].equals("X")) && (casilla[2][0].equals("X"))) {
        System.out.println("¡Has perdido! Rayas Ganan");
        gameOver = true;
      }
      if (casilla[0][1].equals("X") && (casilla[1][1].equals("X")) && (casilla[2][1].equals("X"))) {
        System.out.println("¡Has perdido! Rayas Ganan");
        gameOver = true;
      }
      if (casilla[0][2].equals("X") && (casilla[1][2].equals("X")) && (casilla[2][2].equals("X"))) {
        System.out.println("¡Has perdido! Rayas Ganan");
        gameOver = true;
      } // Hasta aqui se comprueban las columnas
      
      if (casilla[0][0].equals("X") && (casilla[1][1].equals("X")) && (casilla[2][2].equals("X"))) {
        System.out.println("¡Has perdido! Rayas Ganan");
        gameOver = true;
      } // Comprobacion de diagonal "\"
      if (casilla[0][2].equals("X") && (casilla[1][1].equals("X")) && (casilla[2][0].equals("X"))) {
        System.out.println("¡Has perdido! Rayas Ganan");
        gameOver = true;
      } // Comprobacion de diagonal "/"
      
      //////////////////////////////////////////////
      
      for(y = 0; y < 3; y++) {
        for(x = 0; x < 3; x++) {
          System.out.print(casilla[x][y] + " | ");
        }
        System.out.println("");
      } // Pinta resultado rayas
      
      if (!gameOver) {
        
        ///////////// Circulos //////////////
        System.out.println("\nTurno para circulos");
        System.out.println("Introduce las coordenadas. ");

        do {
          System.out.print("Columna: ");
            int xIntroducida = Integer.parseInt(s.nextLine());
          System.out.print("Fila: ");
            int yIntroducida = Integer.parseInt(s.nextLine());

          if (casilla[xIntroducida][yIntroducida].equals(" ")) {
            casilla[xIntroducida][yIntroducida] = "O";
            esCorrecto = true;
          } else {
            System.out.println("Casilla ocupada, vuelve a introducir las coordenadas.");
          }
        } while (!esCorrecto); // Comprueba los datos introducidos
        esCorrecto = false;

        ///////////////COMPROBACION DE VICTORIA ////////////////

        if (casilla[0][0].equals("O") && (casilla[0][1].equals("O")) && (casilla[0][2].equals("O"))) {
          System.out.println("¡Has ganado! Circulos Ganan");
          gameOver = true;
        }
        if (casilla[1][0].equals("O") && (casilla[1][1].equals("O")) && (casilla[1][2].equals("O"))) {
          System.out.println("¡Has ganado! Circulos Ganan");
          gameOver = true;
        }
        if (casilla[2][0].equals("O") && (casilla[2][1].equals("O")) && (casilla[2][2].equals("O"))) {
          System.out.println("¡Has ganado! Circulos Ganan");
          gameOver = true;
        } // Hasta aqui se comprueban las filas

        if (casilla[0][0].equals("O") && (casilla[1][0].equals("O")) && (casilla[2][0].equals("O"))) {
          System.out.println("¡Has ganado! Circulos Ganan");
          gameOver = true;
        }
        if (casilla[0][1].equals("O") && (casilla[1][1].equals("O")) && (casilla[2][1].equals("O"))) {
          System.out.println("¡Has ganado! Circulos Ganan");
          gameOver = true;
        }
        if (casilla[0][2].equals("O") && (casilla[1][2].equals("O")) && (casilla[2][2].equals("O"))) {
          System.out.println("¡Has ganado! Circulos Ganan");
          gameOver = true;
        } // Hasta aqui se comprueban las columnas

        if (casilla[0][0].equals("O") && (casilla[1][1].equals("O")) && (casilla[2][2].equals("O"))) {
          System.out.println("¡Has ganado! Circulos Ganan");
          gameOver = true;
        } // Comprobacion de diagonal "\"
        if (casilla[0][2].equals("O") && (casilla[1][1].equals("O")) && (casilla[2][0].equals("O"))) {
          System.out.println("¡Has ganado! Circulos Ganan");
          gameOver = true;
        } // Comprobacion de diagonal "/"

        //////////////////////////////////////////////

        for(y = 0; y < 3; y++) {
          for(x = 0; x < 3; x++) {
            System.out.print(casilla[x][y] + " | ");
          }
          System.out.println("");
        } // Pinta resultado circulos
      } // Salta turno jugador. 
        // Permite que si gana el ordenador, no entre el turno del jugador.
        
      nTurno++;
    } while (!gameOver);
  }
}