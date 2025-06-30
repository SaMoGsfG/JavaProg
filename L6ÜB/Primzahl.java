package L6ÜB;

import java.util.Scanner;

public class Primzahl {
    public static boolean Prim(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie eine Zahl ein: ");
        int n = scanner.nextInt();
        System.out.println(Prim(n));
        scanner.close();
    }
}
