/**
 * ej2 tema 6
 * DGC
 */
public class ej2 {
  public static void main(String[] args) {

    //carta
    int carta = 0;

    do {
      carta = ((int) (Math.random() * 12) + 1);
    } while (carta == 0);

    switch (carta) {
      case 1:
        System.out.print("A");
      break;
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
        System.out.print(carta);
      break;
      case 11:
        System.out.print("J");
      break;
      case 12:
        System.out.print("Q");
      break;
      case 13:
        System.out.print("K");
      break;
    }

    //palo
    int palo = ((int) (Math.random() * 4) + 1);
    switch (palo) {
      case 1:
        System.out.print(" de picas");
      break;
      case 2:
        System.out.print(" de diamantes");
      break;
      case 3:
        System.out.print(" de corazones");
      break;
      case 4:
        System.out.print(" de tréboles");
      break;
    }

  }
}