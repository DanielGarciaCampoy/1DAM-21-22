/**
 * Ejercicio 2 relacion 4.5
 * 
 * DGC
 */
public class ej2tema4 {
  public static void main(String []args) {
      System.out.print("Diga la hora (en formato 24h): ");
      int hora;
      hora = Integer.parseInt(System.console().readLine());
      
      String saludo;
    
      switch (hora) {
      
      case 6:case 7:case 8:case 9:case 10:case 11:case 12:
      saludo = "buenos dias";
      break;
      
      case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20:
      saludo = "buenas tardes";
      break;
      
      case 21: case 22: case 23: case 24: case 1: case 2: case 3: case 4: case 5:
      saludo = "buenas noches";
      break;
       
      default:
      saludo = "Error"; 
      }

      System.out.println("Son las " + hora + ", " + saludo);
  }
}
