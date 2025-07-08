package L9ÜB;

public class PizzaMain {
    public static void main(String[] args) {
        Pizza[] pizzen = new Pizza[5];
        pizzen[0] = new Pizza("Margherita", new float[]{26, 32, 40}, new float[]{6.5f, 8.0f, 10.0f});
        pizzen[1] = new Pizza("Salami", new float[]{26, 32, 40}, new float[]{7.0f, 8.5f, 11.0f});
        pizzen[2] = new Pizza("Funghi", new float[]{26, 32, 40}, new float[]{7.0f, 8.5f, 11.0f});
        pizzen[3] = new Pizza("Hawaii", new float[]{26, 32, 40}, new float[]{7.5f, 9.0f, 12.0f});
        pizzen[4] = new Pizza("Tonno", new float[]{26, 32, 40}, new float[]{7.5f, 9.0f, 12.0f});

        for (Pizza pizza : pizzen) {
            double bestesVerhaeltnis = pizza.mVPPizza();
            System.out.printf("Pizza %s: Bestes Preisleistungsverhältnis = %.3f €/cm\n", pizza.name, bestesVerhaeltnis);
        }
    }
    
}
