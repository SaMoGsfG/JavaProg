package L3ÜB;

import java.util.Scanner;

public class GültigeUhrzeit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie die Stunden ein");
        int stunden = scanner.nextInt();
        System.out.println("Geben sie die Minuten ein");
        int minuten = scanner.nextInt();
        System.out.println("Geben sie die Sekunden ein");
        int sekunden = scanner.nextInt();

        if (stunden >= 0 && stunden <= 23){
            System.out.println("Die Stundenangabe ist gültig.");
        } else {
            System.out.println("Die Stundenangabe ist ungültig.");  
        }
        if (minuten >= 0 && minuten <= 59){
            System.out.println("Die Minutenangabe ist gültig.");
        } else {
            System.out.println("Die Minutenangabe ist ungültig.");  
        }
        if (sekunden >= 0 && sekunden <= 59){
            System.out.println("Die Sekundenangabe ist gültig.");
        } else {
            System.out.println("Die Sekundenangabe ist ungültig.");  
        }
        scanner.close();
    }
}