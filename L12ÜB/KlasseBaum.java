package L12ÜB;

public class KlasseBaum {
    private KnotenBaum wurzel;

    public void insert (KnotenBaum k){
        if (wurzel == null) {
            wurzel = k;
        } else {
            insert(wurzel, k);   
        }
    }
    private void insert(KnotenBaum temp, KnotenBaum k) {
        if (k.wort
        .compareTo(temp.wort
        ) < 1) {
            if (temp.links == null) {
                temp.links = k;
            } else {
                insert(temp.links, k);
            }
        } else {
            if (temp.rechts == null) {
                temp.rechts = k;
            } else {
                insert(temp.rechts, k);
            }
        }
    }
    public void print(){
        print(wurzel);
    }
    private void print(KnotenBaum temp) {
        if (temp != null) {
            print(temp.links);
            System.out.println(temp.wort
             + ": " + temp.bedeutung);
            print(temp.rechts);
        }
    }
    public String search(String wort) {
        return search(wurzel, wort);
    }

    private String search(KnotenBaum temp, String wort) {
        if (temp == null) {
            return null;
        }
        if (wort.equals(temp.wort)) {
            return temp.bedeutung;
        } else if (wort.compareTo(temp.wort) < 0) {
            return search(temp.links, wort);
        } else {
            return search(temp.rechts, wort);
        }
    }
}
