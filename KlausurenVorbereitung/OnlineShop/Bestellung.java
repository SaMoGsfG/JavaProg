package KlausurenVorbereitung.OnlineShop;

public class Bestellung {
    int bestellnummer;
    Artikel[] artikelListe = new Artikel[50];
    int anzahlArtikel = 0;

    public int getBestellnummer() {
        return bestellnummer;
    }   
    public void setBestellnummer(int bestellnummer) {
        this.bestellnummer = bestellnummer;
    }
    public Artikel[] getArtikelListe() {
        return artikelListe;
    }
    public void setArtikelListe(Artikel[] artikelListe) {
        this.artikelListe = artikelListe;
    }

    public void einfuegen(Artikel artikel) {
        for (int i = 0; i < artikelListe.length; i++) {
            if (artikelListe[i] == null) {
                artikelListe[i] = artikel;
                return;
            }
        }
    }
    //Aufgabe d): public boolean loeschen(Artikel artikel)
    
}
