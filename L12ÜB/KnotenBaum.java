package L12ÜB;

public class KnotenBaum {
    String wort;
    String bedeutung;
    KnotenBaum links, rechts;

    public KnotenBaum(String wort, String bedeutung) {
        this.wort = wort;
        this.bedeutung = bedeutung;
        this.links = null;
        this.rechts = null;
    }
    
}
