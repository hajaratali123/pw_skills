package leetcode.Arrays;


import java.util.Arrays;

//73. Set_Matrix_Zeroes
public class Set_Matrix_Zeroes {

    public static void main(String[] args) {
        int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};
         int m= arr.length;
         int n = arr[0].length;
         int[][] helpArry = new int[m][n];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                helpArry[i][j]= arr[i][j];

            }

        }

        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                if(helpArry[i][j]==0){
                    for (int k = 0; k <n ; k++) {
                          arr[i][k] = 0;
                    }
                    for (int l = 0; l < n; l++) {
                        arr[l][j]=0;
                    }
                }
            }
        }

        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(helpArry[i][j]);

            }
            System.out.println();

        }
        System.out.println();
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);

            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(helpArry));
        System.out.println(Arrays.deepToString(arr));

    }
}
