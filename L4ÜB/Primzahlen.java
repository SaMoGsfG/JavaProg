package L4ÜB;

import java.util.Scanner;

public class Primzahlen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie eine Zahl ein: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Überprüfung für die Zahl " + n + ":");

        for (int j = 2; j <= n; j++) {
            int teiler = 0;

            for (int i = 1; i <= j; i++) {
                if (j % i == 0) {
                    teiler++;
                }
            }

            if (j == n) {
                if (teiler == 2) {
                    System.out.println("Untersuchte Zahl ist eine Primzahl!");
                } else {
                    System.out.println("Untersuchte Zahl ist keine Primzahl!");
                }
            }

            if (teiler == 2) {
                System.out.print(j + " ");
            }
        }

        System.out.println();
    }
}
