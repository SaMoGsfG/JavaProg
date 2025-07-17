package KlausurenVorbereitung;

public class IntFeld {

    public static int zaehleVielfacheVonDrei(int[] feld) {
        int count = 0;
        for (int i = 0; i < feld.length; i++) {
            if (feld[i] % 3 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main (String [] args){
        int[] zahlen = new int[50];
        for (int i = 0; i < zahlen.length; i++){
            zahlen[i] = i + 1;
        }

        System.out.println("Anzahl der Vielfachen von 3: " + zaehleVielfacheVonDrei(zahlen));
    }
}
