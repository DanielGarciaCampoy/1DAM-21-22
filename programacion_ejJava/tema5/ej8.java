/** 
 * ej8 tema 5
 * DGC
*/
public class ej8 {
  public static void main(String[] args) {
    
    System.out.print("Tabla de multiplicar del número: ");
    int n = Integer.parseInt(System.console().readLine());

    //bucle tabla de multiplicar
    for (int i = 0; i <= 10; i++) {
      System.out.println(n + " * " + i + " = " + n*i);
    }
    
  }
}
