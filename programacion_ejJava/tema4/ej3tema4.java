/**
 * Ejercicio 4 relacion 4.5
 * 
 * DGC
 */
public class ej3tema4 {
  public static void main(String []args) {
    
    System.out.print("Introduzca num. del 1 al 7: ");
    int num;
    num = Integer.parseInt(System.console().readLine());
    
    String dia = "";
    
    switch (num) {
      
      case 1:
      dia = "Lunes";
      break;
      
      case 2:
      dia = "Martes";
      break;
      
      case 3:
      dia = "Miercoles";
      break;
      
      case 4:
      dia = "Jueves";
      break;
      
      case 5:
      dia = "Viernes";
      break;
      
      case 6:
      dia = "Sabado";
      break;
      
      case 7:
      dia = "Domingo";
      break;
      
      default:
      System.out.println("Numero incorrecto");
    }

    System.out.println("Es " + dia);

  }
}
