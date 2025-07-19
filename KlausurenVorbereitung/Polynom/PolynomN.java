package KlausurenVorbereitung.Polynom;

public class PolynomN {
    private double[] koeffizienten;
    public PolynomN(double[] koeffizienten) {
        this.koeffizienten = koeffizienten;
    }

    public double berechneAnDerStelleX(double x) {
        double ergebnis = 0;
        for (int i = 0; i < koeffizienten.length; i++) {
            ergebnis += koeffizienten[i] * Math.pow(x, i);
        }
        return ergebnis;
    }
    public PolynomN leiteAb() {
        double[] abgeleiteteKoeffizienten = new double[koeffizienten.length - 1];
        for (int i = 1; i < koeffizienten.length; i++) {
            abgeleiteteKoeffizienten[i - 1] = koeffizienten[i] * i;
        }
        return new PolynomN(abgeleiteteKoeffizienten);
    }
    @Override
    public String toString() {
        String s = "";
        for (int i = koeffizienten.length -1; i >= 0; i--){
            s += koeffizienten[i] + "x^" + i;
            if (i > 0) {
                s += " + ";
            }

        }
        return s;
    
}
}
