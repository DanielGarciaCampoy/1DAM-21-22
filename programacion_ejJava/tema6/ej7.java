/**
 * ej7
 */
public class ej7 {
    public static void main(String[] args) {

        //variables
        int columna = 3;
        int resultadoPartido = 0;
        
        //filas
        for (int fila = 1; fila <= 14; fila++) {
          System.out.printf("Partido " + fila + ": |");
    
        //apuestas
        for (int apuesta = 1; apuesta <= columna; apuesta++) {
            resultadoPartido = (int)(Math.random() * 3) + 1;
            switch(resultadoPartido) {
              case 1:
                System.out.print("1  |");
                break;
              case 2:
                System.out.print("  2|");
                break;
              case 3:
                System.out.print(" X |");
              default:
            }
          }
          System.out.println();
        }
        
        // Pleno al 15
        
        System.out.print("\nPLENO AL 15 - Local...");
        int goles = (int)(Math.random() * 4);
        System.out.print(goles < 3 ? goles : "M");
        
        System.out.print("   Visitante...");
        goles = (int)(Math.random() * 4);
        System.out.print(goles < 3 ? goles : "M");
        
    }
}
