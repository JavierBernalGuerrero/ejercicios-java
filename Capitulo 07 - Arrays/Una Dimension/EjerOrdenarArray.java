public class EjerOrdenarArray {
  public static void main(String[] args) {
      
    System.out.println(" Numeros Pares e Impares");
    System.out.println("·························");
    
    int auxiliar = 0;
    
    //////////////// Recogida de datos /////////////////////
    
    int[] num;
    num = new int [10];
      
    for (int i = 0; i < 10; i++) {
      num[i] = (int)(Math.random() * 5);
    
    }
      
    ////////////////////////////////////////////////////////
    
    System.out.print("Array Original: \t ");
    for (int i = 0; i < 10; i++) {
      System.out.print(num[i] + " ");
    
    }

    System.out.println();

    auxiliar = num[9];
    for (int e = 9; e > 0; e--) {
      num[e] = num[e-1];
    }
    num[0] = auxiliar;
    
    System.out.print("Array Orden Ascendente:  "); // Derecha
    for (int i = 0; i < 10; i++) {
      System.out.print(num[i] + " ");
      
    }

    System.out.println("\n············································");
    
    System.out.print("Array Original: \t ");
      for (int i = 0; i < 10; i++) {
      System.out.print(num[i] + " ");
    
    }
    
    System.out.println();
    
    auxiliar = num[0];
    for (int e = 0; e < 9; e++) {
      num[e] = num[e+1];
    }
    num[9] = auxiliar;
    
    System.out.print("Array Orden Descendente: "); // Izquierda
      for (int i = 0; i < 10; i++) {
      System.out.print(num[i] + " ");
      
    }

  }
}
