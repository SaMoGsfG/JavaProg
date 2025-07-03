package L8ÜB;

import java.util.Arrays;
import java.util.Scanner;

public class Galgenmänchen {

    public static void main(String[] args) {
        galgenmänchen();
    }

    public static void galgenmänchen(){
    String[] woerter = {"PROGRAMMIEREN", "JAVA", "GALGENMÄNNCHEN", "KOMMENTAR", "SCHLEIFE"};
    int rand = (int) (Math.random()*5);
    char[] gesuchtesWort = woerter[rand].toCharArray();
    char[] userLoesung = new char[gesuchtesWort.length];
    for (int i = 0; i < gesuchtesWort.length; i++) {
        userLoesung[i] = '_';
    }

    Scanner scanner = new Scanner(System.in);
    int anzahlVersuche = 1;
    int anzahlFehler = 0;
    

    do{
        boolean foundAChar = false;
        System.out.println(anzahlVersuche + ".Verscuhe:" + String.valueOf(userLoesung));
        L8ÜB.Hangman_Class.Hangman_Function(anzahlFehler);
        char userGuess = scanner.next().charAt(0);
        if(userGuess >= 'a' && userGuess <= 'z'){
            userGuess = (char) (userGuess - 32); // Umwandlung in Großbuchstaben
        }
        anzahlVersuche++;
        for (int j = 0; j<userLoesung.length; j++){
            if (userGuess == gesuchtesWort[j]){
                userLoesung[j] = gesuchtesWort[j];	
                foundAChar = true;
            }
        }
        if (!foundAChar){
            anzahlFehler++;
            Hangman_Class.Hangman_Function(anzahlFehler);
        }
    }while (anzahlFehler <= 15 && !(Arrays.equals(userLoesung, gesuchtesWort)));
    if (Arrays.equals(userLoesung, gesuchtesWort)) {
        System.out.println("Herzlichen Glückwunsch! Sie haben das Wort erraten: " + String.valueOf(gesuchtesWort));
    } else {
        System.out.println("Leider verloren! Das gesuchte Wort war: " + String.valueOf(gesuchtesWort));
    }
    scanner.close();
}
}

