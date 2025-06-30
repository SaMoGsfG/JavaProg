package L6ÜB;

public class Sprünge {
    public static void springeInMehrerenSprüngen(int distanz, int sprung1, int sprung2) {
        alleKombinationen(distanz, sprung1, sprung2, "");
    }

    private static void alleKombinationen(int distanz, int sprung1, int sprung2, String kombi) {

        if (distanz == 0) {
            System.out.println(kombi);
            return;
        }
        if (distanz < 0) {
            return;
        }
        // Sprung1 probieren
        alleKombinationen(distanz - sprung1, sprung1, sprung2, kombi + sprung1 + " ");
        // Sprung2 probieren
        if (sprung1 != sprung2) {
            alleKombinationen(distanz - sprung2, sprung1, sprung2, kombi + sprung2 + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Alle Möglichkeiten für 4 Meter (1,2):");
        springeInMehrerenSprüngen(4, 1, 2);

        System.out.println("\nAlle Möglichkeiten für 5 Meter (2,3):");
        springeInMehrerenSprüngen(5, 2, 3);
    }
}
