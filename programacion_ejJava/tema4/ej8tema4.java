/**
 * ej 7 relacion 4.5
 * 
 * DGC
 */
public class ej8tema4 {
  public static void main(String []args) {
    
    System.out.println("Calcular la media de tres notas:");
    
    System.out.print("1era nota: ");
    double nota1;
    nota1 = Integer.parseInt(System.console().readLine());
    
    System.out.print("2nda nota:");
    double nota2;
    nota2 = Integer.parseInt(System.console().readLine());
    
    System.out.print("3era nota:");
    double nota3;
    nota3 = Integer.parseInt(System.console().readLine());
    
    double media;
    media = (nota1 + nota2 + nota3) / 3;
    int mediaInt = (int) Math.round(media);
    
    String resultado = "";
    switch (mediaInt) {
      case 1: case 2: case 3: case 4:
        resultado = "Insuficiente";
        break;
      case 5:
        resultado = "Suficiente";
        break;  
      case 6:
        resultado = "Bien";
        break;
      case 7: case 8:
        resultado = "Notable";
        break;
      case 9: case 10:
        resultado = "Sobresaliente";
        break;
      default:
        resultado = "nota invalida";
        break;
    }
    
    

    System.out.println("La media es: " + media + ", " + resultado);
    
  }
}
