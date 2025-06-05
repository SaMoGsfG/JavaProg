package L3ÜB;

import java.util.Scanner;

public class Matrikelnummer {

    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib eien Matrikelnummer ein");

        String MNummer = scanner.next();
        int erstZWei = Integer.parseInt(MNummer) / 100000;

        if (erstZWei == 50 || erstZWei == 51 || erstZWei == 61 && MNummer.length() == 7){
            System.out.println("die Matrikelnummer ist Gültig");
        }else{
            System.out.println("Die Matrikelnummer ist Ungültig");
        }
    }
 }
