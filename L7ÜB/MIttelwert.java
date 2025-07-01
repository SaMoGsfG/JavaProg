package L7ÜB;

import java.util.Scanner;

public class MIttelwert {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Anzahl der einzulesenden Werte: ");

        int anzahlWerte = scanner.nextInt();
        double[] werte = new double[anzahlWerte];

        for (int i = 0; i < anzahlWerte; i++) {
            System.out.println(i + 1 + ". Wert: ");
            werte[i] = scanner.nextDouble();

        }

        System.out.println("kleinster Wert: " + minVal(werte));
        System.out.println("größter Wert: " + maxVal(werte));
        System.out.println("Arithmetischer Mittelwert: " + mittelwert(werte));
        System.out.println("Standardabweichung: " +standardabweichung(werte));
        scanner.close();
    }

    public static double minVal(double[] values) {
        double min = values[0];

        for(int i = 1; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
            }
        }
        return(min);
    }

    public static double maxVal(double[] values){
        double max = values[0];

        for(int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }

        return(max);
    }


    public static double mittelwert(double[] values){
        double summe = 0;

        for(int i = 1; i <= values.length; i++){
            summe = summe + values[i-1];

        }
        return(summe/values.length);



    }

    public static double standardabweichung(double[] values){
        double summe = 0;
        for(int i = 1; i <= values.length; i++){
            summe = summe + (values[i-1] - mittelwert(values)) * (values[i-1] - mittelwert(values));
        }

        return(Math.sqrt(summe/values.length));
    }
}
