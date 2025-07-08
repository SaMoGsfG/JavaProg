package KlausurenVorbereitung;

import java.util.Scanner;

public class Logarithmus {

    public static double berechneLogarithmus(double x) {
        if (x <= 0 || x >= 2) {
            throw new RuntimeException();
        }
        double summe = 0.0;
        double summand;
        double basis = x - 1;
        double potenz = x - 1;
        int n = 1;
        do {
            // Vorzeichen: (-1)^(n+1)
            if (n % 2 == 1) {
                summand = potenz / n;
            } else {
                summand = -potenz / n;
            }
            summe += summand;
            n++;
            potenz *= basis;
        } while (summand > 1e-16 || summand < -1e-16);
        return summe;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte eine Zahl zwischen 0 und 2 eingeben: ");
        double zahl = scanner.nextDouble();
        try {
            double ergebnis = berechneLogarithmus(zahl);
            System.out.println("Logarithmus(" + zahl + ") = " + ergebnis);
        } catch (RuntimeException e) {
            System.out.println("Fehler: Der Wert muss zwischen 0 und 2 liegen.");
        }
        scanner.close();
    }
}
