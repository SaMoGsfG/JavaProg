package L2ÜB;
public class pqFormel{
    public static void main(String[]args){
        double p = 5;
        double q = 3;
        double D = (p/2) * (p/2) - q;
        
        if (D > 0){
            System.out.println("Die Gleichung hat zwei reelle Lösungen.");
        }else if (D < 0){
            System.out.println("Die Gleichung hat keine reellen Lösungen.");
        }else{
            System.out.println("Die Gleichung hat eine doppelte reelle Lösung.");
        }
        double x1 = -p/2 + Math.sqrt(D);
        double x2 = -p/2 - Math.sqrt(D);
        System.out.println("x1" + " = " + x1);	
        System.out.println("x2" + " = " + x2);
    }
}