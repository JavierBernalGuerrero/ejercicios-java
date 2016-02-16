/*
 * Escribe un programa que, dada una posición en un tablero de ajedrez, nos
 * diga a qué casillas podría saltar un alfil que se encuentra en esa posición.
 * Como se indica en la figura, el alfil se mueve siempre en diagonal. El
 * tablero cuenta con 64 casillas. Las columnas se indican con las letras de la
 * “a” a la “h” y las filas se indican del 1 al 8.
 *
 * @author Javier Bernal Guerrero
 */

package ejercicios;

public class Ejer08 {
    public static void main(String[] args) {
        
        String[][] casilla = new String[8][8];
        
        for (int y = 7; y >= 0; y--) {
            for(int x = 0; x < 8; x++) {
                casilla[x][y] = " ";
            }
        } // Rellena el tablero de espacios
        
        int xAlfil = (int)(Math.random() * 8);
        int yAlfil = (int)(Math.random() * 8);
        casilla[xAlfil][yAlfil] = "*"; // Posicion del alfil
        
    ////////////////////////// Tablero ////////////////////////////////
    
        System.out.println("\n┌───┬───┬───┬───┬───┬───┬───┬───┬───┐");
        
        for (int y = 7; y >= 0; y--) {
            System.out.print("│ " + (y + 1) + " │");
            for (int x = 0; x < 8; x++) {
                if ((Math.abs(yAlfil - y) == (Math.abs(xAlfil - x))) && 
                        (! ((yAlfil == y) && (xAlfil == x)))) { // Algoritmo de movimiento del alfil
                    casilla[x][y] = "X";
                }
                    System.out.printf(" %1s │", casilla[x][y]);
            }
            if (y == 0) {
                System.out.println("\n└───┼───┼───┼───┼───┼───┼───┼───┼───┤");
            } else {
                System.out.println("\n├───┼───┼───┼───┼───┼───┼───┼───┼───┤");
            }
        }
    
        System.out.println("    │ a │ b │ c │ d │ e │ f │ g │ h │");
        System.out.println("    └───┴───┴───┴───┴───┴───┴───┴───┘"); 
    
    //////////////////////////// Fin tablero ///////////////////////////
    
    }
}
