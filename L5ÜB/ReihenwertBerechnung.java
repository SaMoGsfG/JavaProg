package L5ÜB;

public class ReihenwertBerechnung {
    public static void main(String[] args){
        double summe = 0;
        double summand;
        int k = 1;

        do{
            summand = (6.0/Math.pow(k, 2));
            summe += summand;
            k++;
            System.out.println(summe);
        }
        while(summand > 1e-5);
        
    }
}