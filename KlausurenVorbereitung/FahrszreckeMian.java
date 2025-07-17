package KlausurenVorbereitung;

public class FahrszreckeMian {
    public static void main(String[] args) {
        Zielort z1 = new Zielort("Würzburg", 0  );
        Zielort z2 = new Zielort("Kitzingen", 19);
        Zielort z3 = new Zielort("Neustadt", 42);
        Zielort z4 = new Zielort("Nürnberg", 49);
        
        Fahrstrecke.einfuegen(z1);
        Fahrstrecke.einfuegen(z2);
        Fahrstrecke.einfuegen(z3);
        Fahrstrecke.einfuegen(z4);
        
        System.out.println("Gesamte Strecke: " + Fahrstrecke.gesamtStrecke() + " km");
    }
    
}
