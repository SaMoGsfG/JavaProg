package KlausurenVorbereitung.Altklausurws25;

public class Wetterstation {
    public Wetterdaten start;

    // Teilaufgabe b) und c)
    public void fuegeWetterdatenEin(Wetterdaten w) {
    if (start == null) {
        start = w;
    } else {
        Wetterdaten temp = start;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = w;
    }
    w.next = null; // wichtig: neuer Eintrag zeigt auf nichts
    }

        //Teilaufgabe d)
        public String duwetterdaten(){
            if (start == null){
                throw new RuntimeException("Keine Wetterdaten vorhanden.");
            }
            Wetterdaten temp = start;
            int counter = 0;
            double tempGes = 0;

            while (temp != null){
                counter ++;
                tempGes += temp.temperatur;
                temp = temp.next;
            }
            return "Anzahl der Wetterdaten: " + counter + ", Durchschnittstemperatur: " + (tempGes / counter);

        }
        

    }
    

