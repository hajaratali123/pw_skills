package TwoDimensionalArray;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix2 {
    public static void main(String[] args) {
        // Create a 2D Arrays.oneDarrays.ArrayList to represent the matrix
        List<List<Integer>> matrix = new ArrayList<>();

        // Initialize the matrix with some values
        matrix.add(new ArrayList<>(List.of(1, 2, 3, 4, 5)));
        matrix.add(new ArrayList<>(List.of(6, 7, 8, 9, 10)));
        matrix.add(new ArrayList<>(List.of(11, 12, 13, 14, 15)));
        matrix.add(new ArrayList<>(List.of(16, 17, 18, 19, 20)));
        matrix.add(new ArrayList<>(List.of(21, 22, 23, 24, 25)));
        matrix.add(new ArrayList<>(List.of(26, 27, 28, 29, 30)));

        // Print the matrix (for verification)
        printMatrix(matrix);

        // Get the spiral order of the matrix
        List<Integer> spiralOrder = getSpiralOrder(matrix);

        // Print the spiral order
        System.out.println("Spiral order:");
        for (int num : spiralOrder) {
            System.out.print(num + " ");
        }
    }

    private static void printMatrix(List<List<Integer>> matrix) {
        for (List<Integer> row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private static List<Integer> getSpiralOrder(List<List<Integer>> matrix) {
        List<Integer> result = new ArrayList<>();

        if (matrix.isEmpty() || matrix.get(0).isEmpty()) return result;

        int m = matrix.size();
        int n = matrix.get(0).size();

        int minr = 0, maxr = m - 1;
        int minc = 0, maxc = n - 1;

        while (minr <= maxr && minc <= maxc) {
            // Move right
            for (int j = minc; j <= maxc; j++) {
                result.add(matrix.get(minr).get(j));
            }
            minr++;

            // Move down
            for (int i = minr; i <= maxr; i++) {
                result.add(matrix.get(i).get(maxc));
            }
            maxc--;

            if (minr <= maxr) {
                // Move left
                for (int j = maxc; j >= minc; j--) {
                    result.add(matrix.get(maxr).get(j));
                }
                maxr--;
            }

            if (minc <= maxc) {
                // Move up
                for (int i = maxr; i >= minr; i--) {
                    result.add(matrix.get(i).get(minc));
                }
                minc++;
            }
        }

        return result;
    }
}
