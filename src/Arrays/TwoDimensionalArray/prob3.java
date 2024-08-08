package Arrays.TwoDimensionalArray;


import java.util.Scanner;

// write a code to add 2 matrices
public class prob3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array M and N ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] a3 = new int[m][n];
        int[][] a4 = new int[m][n];

        System.out.println("Enter the matrix 1 ");
        for (int i = 0; i <a3.length ; i++) {
            for (int j = 0; j <a3.length ; j++) {
                a3[i][j]= sc.nextInt();
            }
        }

        System.out.println("Enter the matrix 2 ");
        for (int i = 0; i <a3.length ; i++) {
            for (int j = 0; j <a3.length ; j++) {
                a4[i][j]= sc.nextInt();
            }
        }
        System.out.println("The addition of matrix");
        int[][] res=new int[m][n];
        for (int i = 0; i <a3.length ; i++) {
            for (int j = 0; j <a3.length ; j++) {
               res[i][j] = a3[i][j]+ a4[i][j];
            }
        };
        for(int[] el : res){
            for (int x : el){
                System.out.print(x+ " ");

            }
            System.out.println();
        }


    }
}
