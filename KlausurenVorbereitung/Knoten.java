package KlausurenVorbereitung;

public class Knoten {
    public Mannschaft mannschaft;
    public Knoten links;
    public Knoten rechts;

    public Knoten(Mannschaft mannschaft) {
        this.mannschaft = mannschaft;
        this.links = null;
        this.rechts = null;
    }
    
}
