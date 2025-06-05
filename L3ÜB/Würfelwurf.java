package L3ÜB;

public class Würfelwurf {
    public static void main(String[] args) {
        double Würfel = (int) (Math.random() *6) + 1; // Zufallszahl zwischen 1 und 6

        if (Würfel == 1){
            System.out.println("Der Würfel zeigt eine 1.");
        } else if (Würfel == 2) {
            System.out.println("Der Würfel zeigt eine 2.");
        } else if (Würfel == 3) {
            System.out.println("Der Würfel zeigt eine 3.");
        } else if (Würfel == 4) {
            System.out.println("Der Würfel zeigt eine 4.");
        } else if (Würfel == 5) {
            System.out.println("Der Würfel zeigt eine 5.");
        } else if (Würfel == 6) {
            System.out.println("Der Würfel zeigt eine 6.");
        } else {
            System.out.println("Ungültiger Wurf.");
        }
    }
    
}
