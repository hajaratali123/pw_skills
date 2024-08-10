package leetcode.Arrays;

import java.util.Arrays;

public class Set_Matrix_Zeroes2 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,9,1},{1,1,0}};
        int m= arr.length;
        int n = arr[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        System.out.println("original Array :");
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);

            }
            System.out.println();
        }

        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }

            }
        }
        // Making Rows Zero
        for (int i = 0; i <m ; i++) {
            if(row[i] == true){
                for (int j = 0; j < n; j++) {
                    arr[i][j]=0;
                }
            }
        }
        // making cols Zero
        for (int j = 0; j <n ; j++) {
            if(row[j]== true){
                for (int i = 0; i < m; i++) {
                    arr[i][j]=0;
                }
            }
        }

        System.out.println("Final Array :");
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(arr));
    }
}
