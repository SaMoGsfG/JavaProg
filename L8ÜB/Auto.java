package L8ÜB;

public class Auto {
    private String marke;
    private int Hubraum;
    private int ps;
    private String farbe;
    private int baujahr;

    public static int anzahlProd = 0;

    public Auto(String marke, int hubraum, int ps, String farbe, int baujahr) {
        this.marke = marke;
        this.ps = ps;
        this.farbe = farbe;
        this.baujahr = baujahr;
        if (hubraum > 0){
            this.Hubraum = hubraum;
        } else {
            this.Hubraum = 1600;
        }
        anzahlProd++;
        System.out.println("Auto-Objekt erstellt: " + anzahlProd + " Autos bisher produziert.");
       }

    public String toString() {
        return ("Marke: " + marke + ", Hubraum: " + Hubraum + ", PS: " + ps + ", Farbe: " + farbe + ", Baujahr: " + baujahr);
    }
    public void setHubraum(int hubraum) {
        if (hubraum > 0) {
            this.Hubraum = hubraum;
        }
    }
    public int getHubraum() {
        return Hubraum;
    }
    public void setMarke(String marke) {
        this.marke = marke;
    }
    public String getMarke() {
        return marke;
    }
    public void setPs(int ps) {
        this.ps = ps;
    }
    public int getPs() {
        return ps;
    }
    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }
    public String getFarbe() {
        return farbe;
    }
    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }
    public int getBaujahr() {
        return baujahr;
    }
}
