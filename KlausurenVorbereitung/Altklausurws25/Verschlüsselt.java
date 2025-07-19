package KlausurenVorbereitung.Altklausurws25;

public class Verschlüsselt {

    public static String verschluesseln(String text, int schluessel) {
        if (schluessel <= 0) {
            return text;
        }

        String code = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                // Großbuchstabe verschieben
                char neuer = (char) ('A' + (c - 'A' + schluessel) % 26);
                code += neuer;
            } else if (c >= 'a' && c <= 'z') {
                // Kleinbuchstabe verschieben
                char neuer = (char) ('a' + (c - 'a' + schluessel) % 26);
                code += neuer;
            } else {
                // Nicht-Buchstaben bleiben gleich
                code += c;
            }
        }

        return code;
    }

    public static void main(String[] args) {
        String nachricht = "Programmieren 1!";
        int schluessel = 3;

        String codewort = verschluesseln(nachricht, schluessel);

        System.out.println("Original: " + nachricht);
        System.out.println("Codewort: " + codewort);
    }
}

