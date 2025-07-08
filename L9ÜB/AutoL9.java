package L9ÜB;

import L8ÜB.Auto;

public class AutoL9 {
    public static void main(String[] args){
        Auto audiA3 = new Auto ("Audi", 2000, 150, "Blau", 2020);
        System.out.println(audiA3.getHubraum());
        audiA3.setHubraum(2500);
        System.out.println(audiA3.getHubraum());
        audiA3.setHubraum(-500); 
    }
    
}
