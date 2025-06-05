package L2ÜB;

public class Uhrzeit {
    public static void main(String[] args){
        double Stunde = 18;
        double Minute = 4;
        double Sekunde = 30;
        double SekundeM = (Stunde * 3600) + (Minute * 60) + Sekunde;
        double SekundeV = 86400 - SekundeM;
        double ProzentTag = (SekundeM / 86400) * 100;

        System.out.println("Die Uhrzeit ist " + Stunde + ":" + Minute + ":" + Sekunde);
        System.out.println("Die Sekudnen seit Mitternacht sind: " + SekundeM);
        System.out.println("Die Verbleibenden Sekudnen sind: " + SekundeV);
        System.out.println("Der Prozentsatz des Tages ist: " + ProzentTag + "%");
    }
}
