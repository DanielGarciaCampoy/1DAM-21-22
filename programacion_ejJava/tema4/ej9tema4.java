import java.util.Scanner;
/**
 * ej 9 relacion 4.5
 * 
 * DGC
 */
public class ej9tema4 {
  public static void main(String []args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Ecuacion: ax^2 + bx + c = 0");
  
    System.out.print("Valor de a: ");
    double a = s.nextDouble();
    
    System.out.print("Valor de b: ");
    double b = s.nextDouble();
    
    System.out.print("Valor de c: ");
    double c = s.nextDouble();
    
    double raiz = (Math.pow(b, 2) - 4 * a * c);
    double x1 = ((-1 * b) + Math.pow(raiz,0.5)) / (2 * a);
    double x2 = ((-1 * b) - Math.pow(raiz,0.5)) / (2 * a);
    System.out.println("x1= " + x1);
    System.out.println("x2= " + x2);
  } 
}
