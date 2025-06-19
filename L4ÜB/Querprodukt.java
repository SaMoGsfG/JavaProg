package L4ÜB;

import java.util.Scanner;

public class Querprodukt {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zahl;
        int querprodukt = 1;
        
        while (true){
            System.out.print("Bitte eine Zahl eingeben");
            zahl = scanner.nextInt();
            if (zahl > 0 && zahl < 1000000){
                int n = zahl;
                while (n > 0) {
                    int rest = n % 10;
                    querprodukt = querprodukt * rest;
                    n /= 10;
                }
                System.out.println("Das Querprodukt der eingegebenen Zahl ist: " + querprodukt);
                scanner.close();
            }else{
                System.out.println("Die Zahl muss zwischen 0 und 1.000.000 liegen.");
            }

        }
        
        
    }
    
}
