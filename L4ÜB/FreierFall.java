package L4ÜB;

import java.util.Scanner;

public class FreierFall {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie die Fallzeit ein: ");
        double fallzeit = scanner.nextDouble();
        double g = 9.80665;
        int n = 5;

        for (int i=1; i <= fallzeit; i+=n) {
            double fallhoehe = 0.5 * g * i * i;
            System.out.printf("Zeit:" +i+ "Sekunden: Zurückgelegte Strecke:" + fallhoehe + " Metern\n");
        }
    }
    
}
