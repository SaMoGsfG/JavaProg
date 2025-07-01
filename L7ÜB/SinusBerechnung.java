package L7ÜB;

import java.util.Scanner;

public class SinusBerechnung {
    public static double sin(double x)
    {
        double zaehler = x;
        double nenner = 1.0;
        double summe = x;
        double summand = x;
        for (int i = 3; summand > 1E-15 ||summand < -1E-15; i=i+2)
        {
            zaehler = zaehler* x * x* (-1);
            nenner = nenner* i * (i-1);
            summand = zaehler/nenner;
            summe = summe + summand;
        }
        return summe;
    }
     public static void main(String[] args) {
        System.out.println("gib eine zahl für x ein");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double ergebnis = sin(x);
        System.out.println("sin(" + x + ") = " + ergebnis);
        scanner.close( );
     }
    }
