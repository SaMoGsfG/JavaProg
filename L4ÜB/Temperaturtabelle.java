package L4ÜB;

public class Temperaturtabelle {
    public static void main(String[] args) {
        for (int fahrenheit = 0; fahrenheit <= 300; fahrenheit ++) {
            double celsius = 5.0 / 9.0 * (fahrenheit - 32);
            System.out.printf("%-10d%-10.1f\n",fahrenheit ,celsius );
        }
    }
}
