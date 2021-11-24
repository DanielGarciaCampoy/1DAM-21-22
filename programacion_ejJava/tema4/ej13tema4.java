import java.util.Scanner;
/**
 * Programa que ordene 3 num introducidos
 */
public class ej13tema4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //introducir datos
        System.out.print("1er num: ");
        int n1 = s.nextInt();
        
        System.out.print("2ndo num: ");
        int n2 = s.nextInt();

        System.out.print("3er num: ");
        int n3 = s.nextInt();

        //programa
        if (n1 > n2 & n2 > n3) { //n1 > n2 > n3
            System.out.println(n1 + ">" + n2 + ">" + n3);
        }
        if (n1 > n3 & n3 > n2) { //n1 > n3 > n2
            System.out.println(n1 + ">" + n3 + ">" + n2);
        }
        if (n3 > n2 & n2 > n1) { //n3 > n2 > n1
            System.out.println(n3 + ">" + n2 + ">" + n1);
        }
        if (n3 > n1 & n1 > n2) { //n3 > n1 > n2
            System.out.println(n3 + ">" + n1 + ">" + n2);
        }
        if (n2 > n1 & n1 > n3) { //n2 > n1 > n3
            System.out.println(n2 + ">" + n1 + ">" + n3);
        }
        if (n2 > n3 & n3 > n1) { //n2 > n3 > n1
            System.out.println(n2 + ">" + n3 + ">" + n1);
        }

    }
}
