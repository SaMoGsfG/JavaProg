package L11ÜB;

public class ZeilenMaxima {
    public static double[] zeilenMaxima(double[][] matrix) {
        double[] maxima = new double[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length == 0) {
                throw new IllegalArgumentException("Zeile " + i + " ist leer.");
            }
            double max = matrix[i][0];
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            maxima[i] = max;
        }
        return maxima;
    }

    public static void main(String[] args) {
        double[][] testMatrix = {
            {1.0, 2.5, 3.0},
            {4.0, 5.5, 6.0},
            {7.0, 8.5, 9.0}
        };
        double[] ergebnisse = zeilenMaxima(testMatrix);
        for (int i = 0; i < ergebnisse.length; i++) {
            System.out.println("Maxima der Zeile " + i + ": " + ergebnisse[i]);
        }
    }
}
