package KlausurenVorbereitung;

import java.util.Scanner;

public class Ersetzte {
    public static int ersetze (char[] in){
        int count = 0;
        for(int i = 0; i < in.length-4; i++){
            if(in[i] == '.'){
                count++;
                in[i] = '_';
            }
        }
        System.out.println(in);
        return count;
    }
    public static void main(String[] args) {
        System.out.println("geben sie den Dateinamen ein:");
        Scanner scanner = new Scanner(System.in);
        String dateiName = scanner.nextLine();
        System.out.println(ersetze(dateiName.toCharArray()));
        scanner.close();
    }
    
}
