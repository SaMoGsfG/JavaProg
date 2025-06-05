package L3ÜB;

import java.util.Scanner;

public class Pizzarechner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie den Durchmesser der Pizza in cm ein: ");
        double D1 = scanner.nextDouble();
        System.out.print("Geben Sie den Durchmesser der zweiten Pizza in cm ein: ");
        double D2 = scanner.nextDouble();

        System.out.println("Geben sie den Preis der ersten Pizza ein: ");
        double P1 = scanner.nextDouble();
        System.out.println("Geben sie den Preis der zweiten Pizza ein: ");
        double P2 = scanner.nextDouble();

        Double Fläche1 = Math.PI * (D1 / 2) * (D1 / 2);
        Double Fläche2 = Math.PI * (D2 / 2) * (D2 / 2); 

        double Verhältnis1 = Fläche1 / P1;
        double Verhältnis2 = Fläche2 / P2;

        if(Verhältnis1 > Verhältnis2) {
            System.out.println("Die erste Pizza ist günstiger pro cm².");
        } else if (Verhältnis1 < Verhältnis2) {
            System.out.println("Die zweite Pizza ist günstiger pro cm².");
        } else {
            System.out.println("Beide Pizzas haben das gleiche Preis-Leistungs-Verhältnis.");
        }
    }
}
