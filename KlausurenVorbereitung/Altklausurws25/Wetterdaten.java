package KlausurenVorbereitung.Altklausurws25;

public class Wetterdaten {
    //teilaufgabe a)
    double temperatur;
    double luftfeuchtigkeit;
    String Zeitpunkt;
    Wetterdaten next;

    public Wetterdaten(double temperatur, double luftfeuchtigkeit, String zeitpunkt) {
        this.temperatur = temperatur;
        this.luftfeuchtigkeit = luftfeuchtigkeit;
        this.Zeitpunkt = zeitpunkt;
    }

}
