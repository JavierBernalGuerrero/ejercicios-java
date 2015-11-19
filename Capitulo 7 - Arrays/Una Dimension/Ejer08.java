/**
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes
 * de un determinado año y que muestre a continuación un diagrama de barras
 * horizontales con esos datos. Las barras del diagrama se pueden dibujar a
 * base de asteriscos o cualquier otro carácter.
 *
 * @author Javier Bernal Guerrero
 */

public class Ejer08 {
  public static void main(String[] args) 
    throws InterruptedException {

    System.out.println(" Temperaturas medias");
    System.out.println("·····················");
    
    String[] mes;
    mes = new String [12];
    mes[0] = "Enero";
    mes[1] = "Febrero";
    mes[2] = "Marzo";
    mes[3] = "Abril";
    mes[4] = "Mayo";
    mes[5] = "Junio";
    mes[6] = "Julio";
    mes[7] = "Agosto";
    mes[8] = "Septiembre";
    mes[9] = "Octubre";
    mes[10] = "Noviembre";
    mes[11] = "Diciembre";
    
    //////////////// Recogida de datos /////////////////////
    
    int[] temperatura;
    temperatura = new int [12];
      
    for (int i = 0; i < 12; i++) {
      System.out.print("Introduce la temperatura media de " + mes[i] + ": ");
      temperatura[i] = Integer.parseInt (System.console().readLine());
    
    }
      
    ////////////////////////////////////////////////////////
    
    String azul = "\033[34m";
    String naranja = "\033[33m";
    String verde = "\033[32m";
    String rojo = "\033[31m";
    String blanco = "\033[37m";
    
    for (int m = 0; m < 12; m++) {
      System.out.printf("\n %s%10s %s|%s", verde, mes[m], naranja, azul);
      
      if (temperatura[m] < 10) {
        System.out.print(blanco);
      } else if (temperatura[m] < 18) {
        System.out.print(azul);
      } else {
        System.out.print(rojo);
      }
      
      for (int i = 0; i < temperatura[m]; i++) {
        System.out.print("▄");
        Thread.sleep(50);
          
      } //Pintar Barras
    }
    System.out.print(blanco);
  }
}
