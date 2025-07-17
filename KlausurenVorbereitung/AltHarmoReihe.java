package KlausurenVorbereitung;

public class AltHarmoReihe {
    public static void main (String[] args){
        int k = 1;
        double ergebnis = 0;
        while (k <= 10000){
            ergebnis += (Potenz (-1, k+1)) / k;
            k++;
        }
        System.out.println(ergebnis); // Ergebnis ausgeben
    }
    public static double Potenz (double basis, int exponent){ // static und int exponent
        double ergebnis = 1; 
        while (exponent > 0){
            ergebnis *= basis;
            exponent--;
        }
        return ergebnis; // Rückgabe innerhalb der Methode
    }
}
