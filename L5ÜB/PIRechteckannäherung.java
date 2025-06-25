package L5ÜB;

import java.util.Scanner;

public class PIRechteckannäherung {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie die Anzahl der Rechtecke n ein: ");
        int n = scanner.nextInt();
        double r = 1;
        double ersteFläche = r * (1.0 / n);
        double breite = 1.0 / n;
        double ergebnis = 0.0;

        for (int i = n; i > 0; i--) {
            double Laenge = Math.sqrt(r - Math.pow(i * breite, 2));
            double zwischen = Laenge * breite;
            ergebnis = ergebnis + zwischen;
        }
        ergebnis = (ergebnis + ersteFläche) * 4; 
        System.out.println("Die Näherung von PI ist: " + ergebnis);
        scanner.close();
    }
    
}
