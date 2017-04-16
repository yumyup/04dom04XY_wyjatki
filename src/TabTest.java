import java.util.InputMismatchException;
import java.util.Scanner;


public class TabTest {
    public static void main(String[] args) {
        System.out.println("Podaj wartość X: ");
        Scanner scanner = new Scanner(System.in);

        try {
            int x = scanner.nextInt();

            System.out.println(" podaj wartość Y: ");
            int y = scanner.nextInt();
            if (x < 0 && y > 0) {
                System.out.println("ćwiartka 2");
            } else if (x < 0 && x < y) {
                System.out.println("ćwiartka 3");
            } else if (x > 0 && y > 0) {
                System.out.println("ćwiartka 1");
            } else if (x > 0 && y < 0) {
                System.out.println("ćwiartka 4");
            } else if (x == 0 && y == 0) {
                System.out.println("punkt 0.0");
            }
        } catch (InputMismatchException ex) {
            System.out.println("błedna wartość, wprowadz cyfrę całkowita");
        }
    }

}
