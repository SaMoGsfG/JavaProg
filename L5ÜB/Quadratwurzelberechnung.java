package L5ÜB;

import java.util.Scanner;

public class Quadratwurzelberechnung {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie eine positive Zahl ein: ");
        double x = scanner.nextDouble();
        double y0 = 1;
        double Formel;
        double check;

        do {
            Formel = ((x/y0+y0) /2);
            y0 = Formel;
            check = ((x/y0) - y0);
            if (check < 0) {
                check = -check; 
            }
        } while (check > 1E-10);

        System.out.println("Nach Methode: " + Math.sqrt(x));
        scanner.close();
    }
}
