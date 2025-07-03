package L8ÜB;

public class Parameter {
    public static void main(String [] args) {
        if(args.length == 2) {
            double a = Double.valueOf(args[0]);
            double b = Double.valueOf(args[1]);
            System.out.println(a * b);
        } else {
            System.out.println("Bitte geben Sie genau zwei Ganzzahlen als Parameter ein.");
        }
    }
    
}
