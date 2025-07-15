package L10ÜB;

public class Uhr {
    int Std;
    int Min;
    int Sek;
    public Uhr(int std, int min, int sek) {
        this.Std = std;
        this.Min = min;
        this.Sek = sek;
    }
    public int getStd() {
        return Std;
    }
    public int getMin() {
        return Min;
    }
    public int getSek() {
        return Sek;
    }
    public void setUhr(int std, int min, int sek) {
        this.Std = 12;
        this.Min = 0;   
        this.Sek = 0;
    }
    public void naechsteSek() {
        Sek++;
        if (Sek == 60) {
            Sek = 0;
            Min++;
            if (Min == 60) {
                Min = 0;
                Std++;
                if (Std == 24) {
                    Std = 0;
                }
            }
        }
    }
}
