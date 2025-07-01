package L7ÜB;

import java.util.Random;

public class EuroStück {
    public static void main(String[] args) {
        int versuche = 10000;
        int erfolge = 0;
        Random rand = new Random();

        for (int i = 0; i < versuche; i++) {
            boolean euroImSchreibtisch = rand.nextBoolean(); // 50% Wahrscheinlichkeit
            if (!euroImSchreibtisch) {
                continue; // Kein Euro im Schreibtisch, also kann er nicht im dritten Fach sein
            }
            int fach = rand.nextInt(3); // 0 = erstes, 1 = zweites, 2 = drittes Fach
            // Im ersten und zweiten Fach wurde vergeblich gesucht, also nur Erfolg, wenn im dritten
            if (fach == 2) {
                erfolge++;
            }
        }

        double wahrscheinlichkeit = (double) erfolge / versuche;
        System.out.printf("Geschätzte Wahrscheinlichkeit: %.4f%n", wahrscheinlichkeit);
    }
}
