package KlausurenVorbereitung.OnlineShop;

public class BestellungOhneGetSet {
    String bestellnummer;
    ArtikelOhneGetSet[] artikelOhneGetSetsListe = new ArtikelOhneGetSet[50];
    int anzahlArtikelOhneGetSet = 0;

    public BestellungOhneGetSet(String bestellnummer) {
        this.bestellnummer = bestellnummer;
    }

    
}
