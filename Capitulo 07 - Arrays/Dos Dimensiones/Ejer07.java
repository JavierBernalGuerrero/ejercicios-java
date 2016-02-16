/*
 *  Modifica el programa anterior de tal forma que no se repita ningún número 
 * en el array.
 * 
 * EJERCICIO COMPLETO EN CARPETA APLICACIONES PROPIAS
 *
 * @author Javier Bernal Guerrero
 */

//package ejercicios;

import java.util.Scanner;

public class Ejer07 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    boolean salida = false;
    
    int x;
    int y;
    int[][] casilla = new int[5][4];

    int xMina = (int)(Math.random()*5);
    int yMina = (int)(Math.random()*4);
    
    int xTesoro = (int)(Math.random()*5);
    int yTesoro = (int)(Math.random()*4);
    
    int xIntroducido;
    int yIntroducido;
    
    int numeroIntentos = 0;

    String[][] resultado = new String[5][4];
    
    ////////// POSIBLES RESULTADOS ///////////
    
    for(y = 0; y < 4; y++) {
      for(x = 0; x < 5; x++) {
        if ((x == xMina) && (y == yMina)) {
          casilla[x][y] = 1;         // Pinta una Mina
        } else if ((x == xTesoro) && (y == yTesoro)) {
          casilla[x][y] = 2;         // Pinta el tesoro
        } else {
          casilla[x][y] = 0;         // Pinta un hueco vacio
        }
      }
    }
      
    //////////////////////////////////////
    
    for (y = 0; y < 4; y++) {
      for (x = 0; x < 5; x++) {
        resultado[x][y] = " ";
      }
    } // Escribe espacios en todas las casillas
    
    for (y = 0; y < 4; y++) {
      System.out.print(y + "|");
      for (x = 0; x < 5; x++) {
          System.out.print(" " + resultado[x][y]);
      }
      System.out.println();
    }
    System.out.println("  ----------");
    System.out.println("   0 1 2 3 4");
    // Dibuja el tablero
    
    ///////////// RESPUESTAS ////////////////
    
    do {
      
      System.out.print("Coordenada X: ");
      xIntroducido = Integer.parseInt(s.nextLine());

      System.out.print("Coordenada Y: ");
      yIntroducido = Integer.parseInt(s.nextLine());

      switch (casilla[xIntroducido][yIntroducido]) {
        case 0:
          resultado[xIntroducido][yIntroducido] = "x";
          System.out.println("En las coordenadas seleccionadas no hay nada.");
          break;
        case 1:
          resultado[xIntroducido][yIntroducido] = "·";
          System.out.println("En las coordenadas seleccionadas hay una mina.");
          System.out.println("Lo siento, has perdido.");
          salida = true;
          break;
        case 2:
          resultado[xIntroducido][yIntroducido] = "@";
          System.out.println("En las coordenadas seleccionadas esta el tesoro.");
          System.out.println("Enhorabuena, has ganado.");
          salida = true;
      }
      if ((Math.abs(xMina - xIntroducido) < 2) && (Math.abs(yMina - yIntroducido) < 2)) {
        System.out.println("¡Cuidado, hay una mina cerca!");
      }
      
      for (y = 0; y < 4; y++) {
        System.out.print(y + "|");
        for (x = 0; x < 5; x++) {
            System.out.print(" " + resultado[x][y]);
        }
        System.out.println();
      }
      System.out.println("  ----------");
      System.out.println("   0 1 2 3 4");
      
      // Dibuja el tablero
      
      
      System.out.println("Numero de intentos: " + numeroIntentos);
      System.out.println("··························");
      numeroIntentos++;
    } while ((!salida) && (numeroIntentos < 8));
    
    /////////// Dibuja el tablero completo ///////////
    
    for (y = 0; y < 4; y++) {
      for (x = 0; x < 5; x++) {
        resultado[x][y] = "x";
      }
    }
    
    System.out.println("");
    
    resultado[xMina][yMina] = "·";
    resultado[xTesoro][yTesoro] = "@";
    
    for (y = 0; y < 4; y++) {
      System.out.print(y + "|");
      for (x = 0; x < 5; x++) {
          System.out.print(" " + resultado[x][y]);
      }
      System.out.println();
    }
    System.out.println("  ----------");
    System.out.println("   0 1 2 3 4");
    
  }
}
