package L8ÜB;

public class FavAuto {
    public static void main (String [] args) {
        Auto auto1 = new Auto("BMW", 2000, 150, "Blau", 2020);
        Auto auto2 = new Auto("Audi", 1800, 140, "Rot", 2019);
        Auto auto3 = new Auto("Mercedes", 2200, 160, "Schwarz", 2021);

        System.out.println(auto1.getHubraum());
        auto1.setHubraum(2500);
        System.out.println(auto1.getHubraum());
        auto1.setHubraum(-500); // sollte ignoriert werden
        System.out.println(auto1.getHubraum());

        System.out.println(Auto.anzahlProd);
    }
    
}
