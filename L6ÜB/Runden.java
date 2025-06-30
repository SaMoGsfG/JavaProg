package L6ÜB;

import java.util.Scanner;

public class Runden {
    public static int round (double n){
        int ganz = (int) n;
        double Zahl = n - ganz;

        if (Zahl >= 0.5) {
            return ganz + 1;
        } else {
            return ganz;
        }
    }
    public static double rundeDezimal (double n, int Nachkommastellen) {
        double faktor = 1;
        for (int i = 0; i < Nachkommastellen; i++) {
            faktor *= 10;
        }
        double zwischenwert = n * faktor; 
        int gerundet = (int) (zwischenwert + 0.5);
        return (double) gerundet / faktor;
    }
    public static void main(String [] args){
        System.out.println("gib eine zhal ein");
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        System.out.println("zahl auf nachkommastellen runden oder auf ganze Zahl runden? 1 - für Ganze zahl oder 2 - für Nachkommastellen ");
        System.out.print("Deine Wahl: ");
        int wahl = scanner.nextInt();
        if (wahl == 1){
            int gerundet = round(n);
            System.out.println("Die gerundete Zahl ist: " + gerundet);
        } else if (wahl == 2) {
            System.out.print("Gib die Anzahl der Nachkommastellen ein: ");
            int nachkommastellen = scanner.nextInt();
            double gerundetDezimal = rundeDezimal(n, nachkommastellen);
            System.out.println("Die gerundete Zahl ist: " + gerundetDezimal);
        } else {
            System.out.println("Ungültige Wahl.");
        }
        scanner.close();
    }
}
