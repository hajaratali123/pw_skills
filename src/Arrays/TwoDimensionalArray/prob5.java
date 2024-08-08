package Arrays.TwoDimensionalArray;


import java.util.Arrays;
import java.util.Scanner;

// Code to print Transpose of the matrix
public class prob5 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Size of @d Matrix : M And N");
//
//        int m = sc.nextInt();
//        int n = sc.nextInt();
//
//        int[][] mat = new int[m][n];
//        int[][] TnasposeMAt = new int[n][m];
//        System.out.println("Enter the Matrix");
//        for (int i = 0; i <m ; i++) {
//            for (int j = 0; j <n; j++) {
//                mat[i][j]= sc.nextInt();
//            }
//        }
//        System.out.println(Arrays.deepToString(mat));

          int[][] mat = {{1,2,4},{5,6,7},{6,7,8}};
          int m = mat.length;
          int n = mat[0].length;
          for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print(mat[i][j]+" ");
            }
              System.out.println();
        }

          int[][] TnasposeMAt = new int[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                TnasposeMAt[i][j]=mat[j][i];
            }
        }
        System.out.println("The Transpose Matrix:");
        for(int[] ele : TnasposeMAt){
            for(int x : ele ){
                System.out.print(x+" ");
            }
            System.out.println();
        }


    }
}
