package KlausurenVorbereitung.OnlineShop;

public class Artikel {
    int artikelnummer;
    String artikelname;

    public int getArtikelnummer() {
        return artikelnummer;
    }
    public void setArtikelnummer (int artikelnummer){
        this.artikelnummer = artikelnummer;
    }
    public String getArtikelname (){
        return artikelname;
    }
    public void setArtikelname (String artikelname){
        this.artikelname = artikelname;
    }

    public Artikel(int artikelnummer, String artikelname) {
        this.artikelnummer = artikelnummer;
        this.artikelname = artikelname;
    }
    
}
