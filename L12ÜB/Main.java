package L12ÜB;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Möchten sie im Wörter buch was suchen oder was Einfügen?");
        System.out.println("1. Suchen");
        System.out.println("2. Einfügen");
        System.out.print("Bitte wählen Sie eine Option (1 oder 2): ");
        Scanner scanner = new Scanner (System.in);
        int option = scanner.nextInt();
        
        KlasseBaum baum = new KlasseBaum();
        if (option == 1) {
            System.out.print("Bitte geben Sie das Wort ein, das Sie suchen möchten: ");
            String wort = scanner.next();
            String bedeutung = baum.search(wort);
            if (bedeutung != null) {
                System.out.println("Die Bedeutung von " + wort + " ist: " + bedeutung);
            } else {
                System.out.println("Das Wort " + wort + " wurde nicht gefunden.");
            }
        } else if (option == 2) {
            System.out.print("Bitte geben Sie das Wort ein, das Sie einfügen möchten: ");
            String wort = scanner.next();
            System.out.print("Bitte geben Sie die Bedeutung des Wortes ein: ");
            String bedeutung = scanner.next();
            KnotenBaum neuerKnoten = new KnotenBaum(wort, bedeutung);
            baum.insert(neuerKnoten);
            System.out.println("Das Wort " + wort + " wurde erfolgreich eingefügt.");
        } else {
            System.out.println("Ungültige Option. Bitte wählen Sie 1 oder 2.");
        }
        scanner.close();
    }
    
}
