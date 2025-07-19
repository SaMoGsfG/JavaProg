package L12ÜB;

import java.util.Arrays;

public class Lottozahlen1 {
    public static void main(String[] args) {

        // Aufbau einer einfach verketten liste 
        int[] lottoziehung = new int[6];

        LottozahlenClass start = new LottozahlenClass(1);
        LottozahlenClass temp = start;
        for (int i = 2; i <= 49; i++) {
            LottozahlenClass k = new LottozahlenClass(i);
            temp.next = k;
            while (temp.next != null) {
                temp = temp.next;
                
            }
        }
        // Ende Aufbau der Liste
        

        // 6 Zufallszahlen aus der Liste ziehen die nicht doppelt sein dürfen
        // und speichern in lottoziehung
        // und ausgeliedern der gezogenen Zahl aus der Liste
        for (int i = 0; i < 6; i++) {
            int lottoRandom = (int) (Math.random() * (49 - i) + 1);

            temp = start;

            if (lottoRandom == 1) {
                lottoziehung[i] = start.getWert();
                start = start.next;
            }
            else if(lottoRandom == 2){
                lottoziehung[i] = temp.next.getWert();
                temp.next = temp.next.next;
            } else {
                for (int j = 2; j < lottoRandom; j++) {
                    temp = temp.next;
                }
                lottoziehung[i] = temp.next.getWert();
                temp.next = temp.next.next; 
            }
        }

        // Ausgabe der Lottoziehung in aufsteigender Reihenfolge
        for (int i = lottoziehung.length; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                if (lottoziehung[j - 1] > lottoziehung[j]) {
                    int zwischen = lottoziehung[j];
                    lottoziehung[j] = lottoziehung[j - 1];
                    lottoziehung[j - 1] = zwischen;
                }
            }
        }
        System.out.println(Arrays.toString(lottoziehung));
    }
}
