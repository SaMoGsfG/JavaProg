package L7ÜB;

import java.util.Scanner;

public class UmwandlunginGroßbuchstaben {
    public static char[] inGrossbuchstaben(char[] zeichen) {
        for (int i = 0; i < zeichen.length; i++) {
            if (zeichen[i] >= 97 && zeichen[i] <= 122) {
                zeichen[i] = (char) (zeichen[i] - (97 - 65));
            }
        }
        return zeichen;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie einen Text ein: ");
        String eingabe = scanner.nextLine();
        
        char[] zeichen = new char[eingabe.length()];
        for (int i = 0; i < eingabe.length(); i++) {
            zeichen[i] = eingabe.charAt(i);
        }
        System.out.println("Text in Großbuchstaben: " + new String(inGrossbuchstaben(zeichen)));
        scanner.close();
    }
}
