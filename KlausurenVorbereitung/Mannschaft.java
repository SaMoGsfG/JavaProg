package KlausurenVorbereitung;

public class Mannschaft {
    private final String name;
    private int tore;
    private int gegentore;

    public Mannschaft(String name) {
        this.name = name;
        this.tore = 0;
        this.gegentore = 0;
    }
    public String getName() {
        return name;
    }
    public int getTore() {
        return tore;
    }
    public int getGegentore() {
        return gegentore;
    }
    public void setTore(int tore) {
        this.tore = tore;
    }
    public void setGegentore(int gegentore) {
        this.gegentore = gegentore;
    }
}
