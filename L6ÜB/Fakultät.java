package L6ÜB;

import java.util.Scanner;

public class Fakultät {
    public static long fak(int n){
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }  
    public static void main(String[] args) {
        System.out.println("Gib eine Zahl ein, um die Fakultät zu berechnen:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Die Fakultät von " + n + " ist: " + fak(n));
        scanner.close();
    }
    
}
