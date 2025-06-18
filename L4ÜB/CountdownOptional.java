package L4ÜB;

public class CountdownOptional {
    public static void main (String[] args) throws InterruptedException{
        for (int i = 15; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(1000); // Pause for 1 second
        }
    }

}
