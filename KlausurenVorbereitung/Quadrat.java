package KlausurenVorbereitung;

public class Quadrat {
    public static int printQuadrat(int zeilen) {
        int ergebnis = 0;
        for (int i = 1; i <= zeilen; i++) {
            for (int j = 1; j <= zeilen; j++) {
                for (int k = 2; k < zeilen; k++) {
                System.out.print(" ");
            }
            System.out.println();
                System.out.print("* ");
                ergebnis++;
            }
            System.out.println();
            
        }
        return ergebnis; // Rückgabe der Anzahl der Sterne
    }
    public static void main(String[] args) {
        int zeilen = 5; // Beispielwert für die Anzahl der Zeilen
        int anzahlSterne = Quadrat.printQuadrat(zeilen); // Aufruf
        System.out.println("Anzahl der Sterne: " + anzahlSterne); // Ausgabe der Anzahl der Sterne
    }
    
}
    