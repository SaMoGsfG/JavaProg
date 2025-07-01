package L7ÜB;

import java.util.Scanner;

public class BSprachenSpiel {
    public static void main(String[] args){
        System.out.println("Gib  mir einen satz deiener wahl");
        Scanner scanner = new Scanner(System.in);
        String eingabe = scanner.nextLine();
        System.out.println(spielen(eingabe));
        scanner.close();
    }
    public static String spielen(String satz){
        char[] zeichen = satz.toCharArray();
        int length = zeichen.length;
        char[] neueZeichen = new char[length * 3];
        int count = 0;

        for (int i= 0; i < zeichen.length; i++){
            if (zeichen[i] == 'a' || zeichen[i] == 'e' || zeichen[i] == 'i' || zeichen[i] == 'o' || zeichen[i] == 'u') {
                neueZeichen[count] = zeichen[i];
                neueZeichen[count+1] = 'b';
                neueZeichen[count+2] = zeichen[i];
                count += 3;
            } else {
                neueZeichen[count] = zeichen[i];
                count++;
            }
            

        }
        char[] neuersatz = new char[count];
            for (int j = 0; j < count; j++) {
                neuersatz[j] = neueZeichen[j];
            }
            return (String.valueOf(neuersatz));
    }
}