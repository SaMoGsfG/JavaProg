package KlausurenVorbereitung;

public class Baum {
    private Knoten wurzel;

    public Baum(Mannschaft mannschaft) {
        this.wurzel = new Knoten(mannschaft);
    }

    public void einfuegen (Mannschaft mannschaft){
        //is gegeben digga laut der aufgabe
    }
    
    public Mannschaft maxTore() {
        return maxToreRekursiv(wurzel, wurzel.mannschaft);
    }

    private Mannschaft maxToreRekursiv(Knoten knoten, Mannschaft max) {
        if (knoten == null) return max;
        if (knoten.mannschaft.getTore() > max.getTore()) {
            max = knoten.mannschaft;
        }
        max = maxToreRekursiv(knoten.links, max);
        max = maxToreRekursiv(knoten.rechts, max);
        return max;
    }

}
