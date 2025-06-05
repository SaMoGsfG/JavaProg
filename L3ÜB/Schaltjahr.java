package L3ÜB;

import java.util.Scanner;

public class Schaltjahr {
    public static void main(String[] args) {
        System.out.println("Gib ein Jahr ein:");
        Scanner scanner = new Scanner(System.in);
        int jahr = scanner.nextInt();
        int jahr1 = jahr % 4;
        int jahr2 = jahr % 100;
        int jahr3 = jahr % 400;
        if (jahr1 == 0 && jahr2 != 0 || jahr3 == 0) {
            System.out.println("Das Jahr " + jahr + " ist ein Schaltjahr.");
        } else {
            System.out.println("Das Jahr " + jahr + " ist kein Schaltjahr.");
        }
    
        scanner.close();
    }
}
