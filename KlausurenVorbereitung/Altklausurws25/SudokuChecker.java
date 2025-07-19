package KlausurenVorbereitung.Altklausurws25;

public class SudokuChecker {
    private int[][] feld;
    //private int startZeile; 
    //private int startSpalte;
    
    public SudokuChecker(int[][] feld){
        if (feld.length != 9 || feld[0].length != 9){
            throw new RuntimeException("Das Sudoku-Feld muss 9x9 groß sein.");
        } else {
            System.out.println("Das Sudoku-Feld hat die richtige Größe.");
        }
    }
    public boolean ueberpruefeGebiet(int startZeile, int startSpalte) {
        boolean[] vorhanden = new boolean[9];
        for (int i = startZeile; i < startZeile + 3; i++) {
            for (int j = startSpalte; j < startSpalte + 3; j++) {
                int wert = feld[i][j];
                if (wert < 1 || wert > 9) {
                    return false; // Ungültiger Wert
                }
                if (vorhanden[wert - 1]) {
                    return false; // Wert bereits vorhanden
                }
                vorhanden[wert - 1] = true;
            }
        }
        return true;
    }

}


