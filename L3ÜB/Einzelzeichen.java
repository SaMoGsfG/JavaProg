package L3ÜB;

import java.util.Scanner;

public class Einzelzeichen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie ein Einzelzeichen ein: ");
        String line = scanner.nextLine();
        char zeichen = line.charAt(0);

        boolean gefunden = false;

        if (Character.isUpperCase(zeichen)){
            System.out.println("Das Zeichen '" + zeichen + "' ist ein Großbuchstabe.");
            gefunden = true;
        } 
        if (Character.digit(zeichen, 16)!= -1) {
            System.out.println("Das Zeichen '" + zeichen + "' ist eine Ziffer.");
            gefunden = true;
        }
        if (Character.digit(zeichen, 2)!= -1){
            System.out.println("Das Zeichen '" + zeichen + "' ist eine Binärziffer.");
            gefunden = true;
        }
        if (Character.digit(zeichen, 8) != -1) {
            System.out.println("Das Zeichen '" + zeichen + "' ist eine Oktalziffer.");
            gefunden = true;
        }
        if ( !gefunden) {
            System.out.println("Das Zeichen '" + zeichen + "' ist kein Großbuchstabe, keine Ziffer, keine Binärziffer und keine Oktalziffer.");
        }scanner.close();
    }
    
}
