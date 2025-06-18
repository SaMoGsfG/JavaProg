package L3ÜB;
import java.util.Scanner;
public class Wahrheitstabelle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie den ersten Wert ein");
        char zeichen1 = scanner.next().charAt(0);
        System.out.println("Geben Sie den zweiten Wert ein");
        char zeichen2 = scanner.next().charAt(0);

        if (zeichen1 == 'f' && zeichen2 == 'f'){
            System.out.print("Die Ausgabe ist: "+0);
        }
        else if (zeichen1 == 'f' && zeichen2 == 't'){
            System.out.print("Die Ausgabe ist: "+1);
        }
        else if (zeichen1 == 't' && zeichen2 == 'f'){
            System.out.print("Die Ausgabe ist: "+2);
        }
        else if (zeichen1 == 't' && zeichen2 == 't'){
            System.out.print("Die Ausgabe ist: "+3);
        }else{  
            System.out.print("Ungültige Eingabe. Bitte geben Sie 't' für true oder 'f' für false ein.");
        }
}
}

