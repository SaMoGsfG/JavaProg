package KlausurenVorbereitung;

public class Fahrstrecke {
    static Zielort start;
    static Zielort ziel;

    public static void einfuegen(Zielort x){
        if (start == null){
            start = x;
        }else{
            ziel = start; 
            while (ziel.next != null) {
                ziel = ziel.next;
            }
            ziel.next = x;
        }
    }
        public static int gesamtStrecke(){
            ziel = start;
            int summe = 0;
            while (ziel != null) {
                summe += ziel.getDistanz();
                ziel = ziel.next;
            }
            return summe;
        
    }
}

