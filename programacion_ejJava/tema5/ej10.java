import java.util.Scanner;
/**
 * ej10 tema 5
 * DGC
*/
public class ej10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Calcula media de los sig. num. que introduzcas:");
        System.out.println("(si introduces un num. negativo, se calculara la media)");

        //variables
        int i = 0; //cantidad de nums.
        int n = 0; //num. a introducir
        int sumaTotal = 0; //suma total

        do {
            n = s.nextInt();
            if (n >= 0) {
                sumaTotal += n;
                i++;
            }
        } while (n >= 0);

        int media = sumaTotal / i;
        System.out.println("La media es: " + media);
        
    }
}
