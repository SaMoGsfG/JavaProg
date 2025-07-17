package KlausurenVorbereitung;

// Die Klasse Passwort kapselt die Logik für ein sicheres Passwort
public class Passwort {
    // Das gespeicherte Passwort (wird als Sternchen ausgegeben)
    private String passwort;

    /**
     * Prüft, ob ein Passwort geeignet ist.
     * Bedingungen:
     * - Mindestens 8 Zeichen
     * - Mindestens 2 Großbuchstaben, 2 Kleinbuchstaben, 2 Zahlen
     * Gibt true zurück, wenn das Passwort geeignet ist.
     */
    public static boolean alsPWgeeignet(String passwort) {
        boolean hatGrossbuchstabe = false;
        boolean hatKleinbuchstabe = false;
        boolean hatZahl = false;
        boolean length = true;
        int zähleGB = 0; 
        int zähleKB = 0;
        int zähleZ = 0;
        
        // Prüft die Mindestlänge
        if (passwort.length() < 8) {
            length = false;
        }
        
        // Zählt die Anzahl der Großbuchstaben, Kleinbuchstaben und Zahlen
        for (int i = 0; i < passwort.length(); i++) {
            char c = passwort.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                zähleGB++;
            } else if (c >= 'a' && c <= 'z') {
                zähleKB++;
            } else if (c >= '0' && c <= '9') {
                zähleZ++;
            }
        }
        // Wenn alle Bedingungen erfüllt sind, ist das Passwort geeignet
        if (zähleGB > 1 && zähleKB > 1 &&  zähleZ > 1 && length) {
            return passwort.length() >= 8 && zähleGB >= 2 && zähleKB >= 2 && zähleZ >= 2;
        }
        // Falls nicht, wird geprüft, ob wenigstens ein Großbuchstabe, Kleinbuchstabe und Zahl vorhanden ist
        return hatGrossbuchstabe && hatKleinbuchstabe && hatZahl;
    }
    
    /**
     * Konstruktor: Setzt das Passwort, falls es geeignet ist.
     * Sonst wird das Passwort auf null gesetzt.
     */
    public Passwort(String passwort) {
        if(alsPWgeeignet(passwort)){
            this.passwort = passwort;
        }else{
            this.passwort = null;
        }
    }

    /**
     * Gibt das Passwort als Sternchen aus.
     * Falls kein gültiges Passwort gesetzt ist, wird eine Fehlermeldung ausgegeben.
     */
    @Override
    public String toString(){
        String ausgabe = "";
        if (passwort != null){
            for (int i = 0; i < passwort.length(); i++) {
                ausgabe += "*";
            }
        } else {
            ausgabe = "Kein gültiges Passwort gesetzt";
        }
        return ausgabe;
    }

    /**
     * Versucht, das Passwort zu ändern.
     * Bedingungen:
     * - Das erste und das letzte Zeichen müssen sich vom alten Passwort unterscheiden.
     * Gibt true zurück, wenn das Passwort geändert wurde.
     */
    public boolean pwAendern(String neuPasswort){
        boolean geaendert = false;
        if (passwort != null){
            char[] alt = passwort.toCharArray();
            char[] neuArray = neuPasswort.toCharArray();
            // Prüft, ob das erste und letzte Zeichen unterschiedlich sind
            if(alt[0] != neuArray[0] && alt[passwort.length()-1] != neuArray[neuPasswort.length()-1]){
                geaendert = true;
                // Setzt das neue Passwort
                this.passwort = neuPasswort;
            }
        }
        return geaendert;
    }

    /**
     * Main-Methode: Demonstriert die Funktionalität der Klasse Passwort.
     */
    public static void main(String[] args) {
        // Erstellt ein Passwort-Objekt mit einem Beispielpasswort
        Passwort pw = new Passwort("Abcdef12");

        // Gibt das Passwort als Sternchen aus (oder eine Fehlermeldung)
        System.out.println("Passwort-Ausgabe: " + pw);

        // Versucht, das Passwort zu ändern
        String neuesPW = "Xbcdef13";
        boolean geaendert = pw.pwAendern(neuesPW);

        // Gibt aus, ob das Passwort geändert wurde
        System.out.println("Passwort geändert? " + geaendert);

        // Gibt das neue Passwort als Sternchen aus (wenn geändert)
        System.out.println("Neues Passwort-Ausgabe: " + pw);
    }
}

