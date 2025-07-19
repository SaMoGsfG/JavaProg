package KlausurenVorbereitung;

public class Quadrat {
    public static int printQuadrat(int zeilen) {
        for (int i = 1; i <= zeilen; i++) {
            for (int j = 1; j <= zeilen; j++) {
                if (i == 1 || i == zeilen || j == 1 || j == zeilen) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        return zeilen; 
    }

    public static void main(String[] args) {
        int zeilen = 4;
        int anzahlSterne = Quadrat.printQuadrat(zeilen);
        System.out.println("Anzahl der Sterne: " + anzahlSterne);
    }
}
