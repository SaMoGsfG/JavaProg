package L10ÜB;

public class UhrMain {
    public static void main(String[] args) {
        Uhr[] weltzeit = new Uhr[24];
        for (int i = 0; i < 24; i++) {
            weltzeit[i] = new Uhr(i, 23, 7);
            System.out.println("Weltzeit " + i + ": " + weltzeit[i].getStd() + ":" + weltzeit[i].getMin() + ":" + weltzeit[i].getSek());
        }
        for (int i = 0; i < weltzeit.length; i++) {
            weltzeit[i].naechsteSek();
            System.out.println("Weltzeit " + i + ": " + weltzeit[i].getStd() + ":" + weltzeit[i].getMin() + ":" + weltzeit[i].getSek());
        }
    }
}
