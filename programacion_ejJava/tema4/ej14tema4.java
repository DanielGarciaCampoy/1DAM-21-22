/**
 * Indica si el num introducido es par y/o divisible entre 5
 */

public class ej14tema4 {
    public static void main(String[] args) {
        
        //datos
        System.out.print("Numero: ");
        int n = Integer.parseInt(System.console().readLine());

        //programa
        if (n % 2 == 0) {
            System.out.print("Es par ");
        } else {
            System.out.print("No es par ");
        }

        if (n % 5 == 0) {
            System.out.println("y es divisible ente 5");
        } else {
            System.out.println("y no es divisible entre 5");
        }
        
    }
}
