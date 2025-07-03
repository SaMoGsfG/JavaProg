package KlausurenVorbereitung;

import java.util.Scanner;

public class Blutalkoholkonzentration {
    public static double berechneMasse(double VGetränk, double VAlkohol, double Dichte){
        double masse = (VGetränk * VAlkohol * Dichte) ;
        return masse;
    }
    public static double berechneAlkKonzentration(double masse, double gewicht, char typ) {
        double r;
        switch (typ) {
            case 'm':
                r = 0.7;
                break;
            case 'w':
                r = 0.6;
                break;
            case 'j':
                r = 0.5;
                break;
            default:
                System.out.println("Fehler: Ungültiger Typ. Erlaubt sind 'm', 'w' oder 'j'.");
                return -1.0;
        }
        return masse / (gewicht * r);
    }
    
    public static double stundenBisFahrtuechtig(double berechneAlkKonzentration) {
        double abbauProStunde = 0.15; // Promille pro Stunde
        if (berechneAlkKonzentration <= 0.11) {
            return 0.0;
        }
        return Math.ceil((berechneAlkKonzentration - 0.11) / abbauProStunde);
    }
    
    public static void main(String[] args){
        System.out.println("Geben sie ihr volumen des Getränks(ml), menge der alkoholmasse(bei 5% sind das 0,05) und die dichte ein:");
        Scanner scanner = new Scanner(System.in);
        double VGetränk = scanner.nextDouble();
        double VAlkohol = scanner.nextDouble();
        double Dichte = scanner.nextDouble();
        System.out.println(berechneMasse(VGetränk, VAlkohol, Dichte));
        System.out.println("Gebn sie ihr Geschlecht an (m/w/j), und ihr gewicht in kg:      ");
        char typ = scanner.next().charAt(0);
        int gewicht = scanner.nextInt();
        System.out.println("Ihre Blutalkoholkonzentration beträgt: " + berechneAlkKonzentration(berechneMasse(VGetränk, VAlkohol, Dichte), gewicht, typ) + " Promille");
        scanner.close();
        if (berechneAlkKonzentration(berechneMasse(VGetränk, VAlkohol, Dichte), gewicht, typ) > 0.5) {
            System.out.println("Sie sind nicht fahrtüchtig!");
        } else if (berechneAlkKonzentration(berechneMasse(VGetränk, VAlkohol, Dichte), gewicht, typ) > 0.5 || berechneAlkKonzentration(berechneMasse(VGetränk, VAlkohol, Dichte), gewicht, typ) < 0.3) {
            System.out.println("Sie sollten kein auto mehr fahren!");
        }
        else {
            System.out.println("Sie sind fahrtüchtig!");
        }
        System.out.println("Sie sind voraussichtlich in " + stundenBisFahrtuechtig(berechneAlkKonzentration(berechneMasse(VGetränk, VAlkohol, Dichte), gewicht, typ)) + " Stunden wieder fahrtüchtig.");
        
    }
}
