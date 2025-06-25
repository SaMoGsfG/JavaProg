package L5ÜB;
import java.util.Scanner;

public class Potenz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie die Basis b ein (double): ");
        double b = scanner.nextDouble();
        System.out.print("Geben Sie den Exponenten n ein (int): ");
        int n = scanner.nextInt();

        double ergebnis = 1.0;

        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                ergebnis *= b;
            }
        } else if (n < 0) {
            for (int i = 1; i <= -n; i++) {
                ergebnis *= b;
            }
            ergebnis = 1.0 / ergebnis;
        } 

        System.out.println("Das Ergebnis von " + b + " hoch " + n + " ist: " + ergebnis);

        scanner.close();
    }
}
