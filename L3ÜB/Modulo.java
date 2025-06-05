package L3ÜB;

import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie die erste Zahl ein: ");
        int x = scanner.nextInt();
        int ergebnis = x % 7;
        if (ergebnis == 0){
            System.out.println("ist duch 7 teilbar");
        }else{
            System.out.println("ist nicht duch 7 teilbar");
        }
    }
    
}
