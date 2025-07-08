package KlausurenVorbereitung;

public class Aufgabe3einfügen {
    KotenKlasseAufgabe3 ende;

    public void einfuegen(String name) {
        // Neuen Knoten erstellen
        KotenKlasseAufgabe3 neuerKnoten = new KotenKlasseAufgabe3(name);
        // Wenn die Liste leer ist, wird der neue Knoten zum Ende
        if (ende == null) {
            ende = neuerKnoten;
        } else {
            // Neuen Knoten ans Ende anhängen
            neuerKnoten.vorgaenger = ende;
            ende = neuerKnoten;
        }
    }

    @Override
    public String toString() {
        String Ausgabe = "";
        KotenKlasseAufgabe3 aktuellerKnoten = ende;
        while (aktuellerKnoten != null) {
            Ausgabe = aktuellerKnoten.name + " " + Ausgabe;
            aktuellerKnoten = aktuellerKnoten.vorgaenger;
        }
        return Ausgabe;
    }

    // Main-Methode zum Testen
    public static void main(String[] args) {
        Aufgabe3einfügen liste = new Aufgabe3einfügen();
        liste.einfuegen("Cool");
        liste.einfuegen("Zylla");
        liste.einfuegen("Aaronson");
        System.out.println(liste); // Ausgabe: Cool Zylla Aaronson
    }
}
