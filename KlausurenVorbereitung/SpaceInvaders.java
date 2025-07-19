package KlausurenVorbereitung;

import java.util.Scanner;

public class SpaceInvaders {

    public char[][] spielfeld = new char[5][8];

    public SpaceInvaders() {
        for (int i = 0; i < 8; i++) {
            spielfeld[0][i] = 'O';
        }
        for (int j = 1; j < 4; j++) {
            for (int i = 0; i < 8; i++) {
                spielfeld[j][i] = ' ';
            }
        }
        // Initialisiere die letzte Zeile mit Leerzeichen
        for (int i = 0; i < 8; i++) {
            spielfeld[spielfeld.length - 1][i] = ' ';
        }

        int ship = (int) (Math.random() * 8);
        spielfeld[spielfeld.length - 1][ship] = 'V';
    }

    public void bewege(char richtung) {
        int move;
        if (richtung == 'a') {
            move = -1;
        } else if (richtung == 'd') {
            move = 1;
        } else {
            throw new RuntimeException("Ungültige Richtung. Bitte 'a' oder 'd' eingeben.");
        }

        // Finde die aktuelle Position des Schiffs
        int row = spielfeld.length - 1;
        int col = -1;
        for (int i = 0; i < spielfeld[row].length; i++) {
            if (spielfeld[row][i] == 'V') {
                col = i;
                break;
            }
        }
        if (col == -1) return; // Schiff nicht gefunden

        int newCol = col + move;
        // Prüfe Spielfeldgrenzen
        if (newCol >= 0 && newCol < spielfeld[row].length) {
            spielfeld[row][col] = ' ';
            spielfeld[row][newCol] = 'V';
        }
    }

    @Override
    public String toString() {
        for (int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld[i].length; j++) {
                System.out.print(spielfeld[i][j]);
            }
            System.out.print("\n");

        }
        return (null);

    }

    public static void main(String[] args) {
        SpaceInvaders game = new SpaceInvaders();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(game.toString());
            System.out.print("Bewege das Schiff (a = links, d = rechts, q = beenden): ");
            String input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            }
            if (input.equals("a") || input.equals("d")) {
                game.bewege(input.charAt(0));
            } else {
                System.out.println("Ungültige Eingabe!");
            }
        }
        scanner.close();
    }

}
