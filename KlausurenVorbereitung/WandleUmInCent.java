package KlausurenVorbereitung;

import java.util.Scanner;

public class WandleUmInCent {
    public static int wandleUmInCent(double betrag) {
        if (betrag < 0) {
            throw new IllegalArgumentException("Betrag darf nicht negativ sein.");
        }
        return (int) Math.round(betrag * 100);
    }

    public static void main(String[] args) {
        System.out.println("Gib einen betrag der in Cent umgewandelt werden soll ein;");
        Scanner scanner = new Scanner(System.in);
        double betrag = scanner.nextDouble();
        scanner.close();
        int cent = wandleUmInCent(betrag);
        System.out.println("Der Betrag in Cent ist: " + cent);
    }
    
}
