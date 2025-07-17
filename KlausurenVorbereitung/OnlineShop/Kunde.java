package KlausurenVorbereitung.OnlineShop;

public class Kunde {
    Bestellung[] bestellungen = new Bestellung[50];
    int anzahlBestellungen = 0;

    public Bestellung findeBestellungMitArtikel(String artikelName) {
    for (int i = 0; i < anzahlBestellungen; i++) {
        Bestellung bestellung = bestellungen[i];
        Artikel[] artikelListe = bestellung.getArtikelListe();
        for (int j = 0; j < artikelListe.length; j++) {
            if (artikelListe[j] != null && artikelListe[j].getArtikelname().equals(artikelName)) {
                return bestellung;
            }
        }
    }
    
    return null; 
    }
}

