package KlausurenVorbereitung.Polynom;

public class Polynom3 {
    private double a, b, c, d;

    public Polynom3(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double berechneAnDerStelleX(double x) {
        return a * x * x * x + b * x * x + c * x + d;
    }

    public Polynom3 leiteAb() {
        double na = 3 * a;
        double nb = 2 * b;
        double nc = c;
        return new Polynom3(0, na, nb, nc);
    }

    @Override
    public String toString() {
        return a + "x^3 + " + b + "x^2 + " + c + "x + " + d;
    }

    public static void main(String[] args) {
        Polynom3 p = new Polynom3(1.5, 4.0, 1.3, -8.0);
        System.out.println("Polynom: " + p);
        System.out.println("Wert an Stelle x=2: " + p.berechneAnDerStelleX(2));
        Polynom3 abgeleitet = p.leiteAb();
        System.out.println("Ableitung: " + abgeleitet);
    }
}

