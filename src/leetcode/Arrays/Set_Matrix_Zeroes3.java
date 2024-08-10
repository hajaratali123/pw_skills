package leetcode.Arrays;

public class Set_Matrix_Zeroes3 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,9,1},{1,1,0}};
        int m = arr.length;
        int n = arr[0].length;

        boolean ZeroRow = false;
        boolean ZeroCol = false;

        System.out.println("Original Array:");
        printMatrix(arr);

        // Check if the first row contains zero
        for (int j = 0; j < n; j++) {
            if (arr[0][j] == 0) {
                ZeroRow = true;
                break;
            }
        }

        // Check if the first column contains zero
        for (int i = 0; i < m; i++) {
            if (arr[i][0] == 0) {
                ZeroCol = true;
                break;
            }
        }

        // Use the first row and first column to mark zeroes
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }

        // Set matrix zeroes based on marks in the first row and first column
        for (int i = 1; i < m; i++) {
            if (arr[i][0] == 0) {
                for (int j = 1; j < n; j++) {
                    arr[i][j] = 0;
                }
            }
        }

        for (int j = 1; j < n; j++) {
            if (arr[0][j] == 0) {
                for (int i = 1; i < m; i++) {
                    arr[i][j] = 0;
                }
            }
        }

        // Handle the first row
        if (ZeroRow) {
            for (int j = 0; j < n; j++) {
                arr[0][j] = 0;
            }
        }

        // Handle the first column
        if (ZeroCol) {
            for (int i = 0; i < m; i++) {
                arr[i][0] = 0;
            }
        }

        System.out.println("Final Array:");
        printMatrix(arr);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
