package L10ÜB;

import L8ÜB.Auto;

public class AutoFabrik {
    public Auto produziere (String marke, int hubraum, int ps, String farbe, int baujahr) {
        return new Auto(marke, hubraum, ps, farbe, baujahr);
    }
    public static void main (String[] args){
        Auto auto = new AutoFabrik().produziere("BMW", 2000, 150, "Blau", 2020);
        System.out.println(Auto.anzahlProd);
        System.out.println(auto.getPs());

    }
    
}
