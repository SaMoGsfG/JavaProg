package KlausurenVorbereitung;

public class flattern {

    public static int[] flatten(int[][] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i].length;
        }

        int[] result = new int[total];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result[index++] = arr[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4, 5},
            {6},
            {7, 8},
            {9, 10, 11, 12}
        };

        int[] flattenedArray = flatten(arr);
        for (int i = 0; i < flattenedArray.length; i++) {
            System.out.print(flattenedArray[i] + " ");
        }
    }
}
