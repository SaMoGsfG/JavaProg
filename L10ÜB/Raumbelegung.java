package L10ÜB;

import L9ÜB.Raum;

public class Raumbelegung {
    public static void main(String[] args) {
        Raum raumI21 = new Raum("I.2.1", 35, false);
        Raum raumI22 = new Raum("I.2.2", 35, false);

        raumI21.betreteRaum("Hopfen Holgi, \t\t6824034");
        raumI21.betreteRaum("Titten Tille, \t\t6824035");
        raumI21.betreteRaum("Erika Mustermann, \t6824036");
        raumI21.setBelegt();
        raumI22.betreteRaum("Tripper Timo , \t\t6824034");
        raumI22.betreteRaum("Nougat Nico, \t\t6824035");
        raumI22.betreteRaum("Latten Lutscher Linus, \t6824036");
        raumI22.setBelegt();
        System.out.println(raumI21.isBelegt());
        String[] Pimmel = raumI21.getStudenten();
        for (int i=0; i < Pimmel.length; i++){
            System.out.println(Pimmel[i]);
        }
        System.out.println(raumI22.isBelegt());
        String[] Pimmel2 = raumI22.getStudenten();
        for (int i=0; i < Pimmel2.length; i++){
            System.out.println(Pimmel2[i]);
        }
    }

}
