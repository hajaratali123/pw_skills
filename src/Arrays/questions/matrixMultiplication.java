package Arrays.questions;

public class matrixMultiplication {

    public static void print(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] b = {{1, 2, 4, 5}, {4, 5, 6, 7}, {6, 7, 8, 9}};

        int[][] ans = new int[0][0];
        if (a[0].length != b.length) {
            System.out.println("Multiplication is not possible");
        } else {
            // Multiplication is possible
            ans = new int[a.length][b[0].length];
            for (int i = 0; i < ans.length; i++) {
                for (int j = 0; j < ans.length; j++) {
                    //            ans[i][j]=a[i][0]*b[0][j]+a[i][1]*b[1][j]+a[i][2]*b[2][j];
                    for (int k = 0; k < b.length; k++) {
                        ans[i][j] += a[i][k] * b[k][j];}
                }
            }
        }
        System.out.println("Matrix A:");
        print(a);
        System.out.println("Matrix B:");
        print(b);
        System.out.println("Matrix Multiplication Result:");
        print(ans);
    }
}
