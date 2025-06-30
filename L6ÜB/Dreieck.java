package L6ÜB;
import java.util.Scanner;

public class Dreieck {
    public static void dreieck(int countLines){
        String x = "* ";
        String leer = " ";
        for(int i = 1; i<= countLines; i++){

            for(int k = countLines -i; k > 0 ; k--){
                System.out.printf(leer);
            }

            for(int j = 0; j<i; j++){
                System.out.printf(x);
            }
            System.out.printf("\n");

        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        dreieck(userInput);
        scanner.close();
    }
}