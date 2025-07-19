package KlausurenVorbereitung.Altklausurws25;

public class Umrechner {
    public static double berechneLaengeInFuss( double laengeInSkizze){
        double laengeInReal = laengeInSkizze * 3;
        double laengeInFuss = laengeInReal * 3.28;
        return laengeInFuss;
    }
    public static void main(String[] args){
        double laengeSkizze = 1.0;

        double laengeFuss = berechneLaengeInFuss(laengeSkizze);
        System.out.println("Die Länge in Fuß beträgt: " + laengeFuss);
        double laengeInReal = laengeSkizze * 3;
        System.out.println("Die Länge in der Realität beträgt: " + laengeInReal + " Meter");

    }
    
}
