package Arrays.TwoDimensionalArray;


import java.util.Scanner;

public class BasicOf2DArray {
    public static void main(String[] args) {
        System.out.println("Enter the values of 2D Array :");
        Scanner n = new Scanner(System.in);
        int[][] a= new int[4][4];
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j]=n.nextInt();
            }
        }
        System.out.println("Array printing :");
        for (int i = 0; i <  4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j]);

            }
            System.out.println();
        }
    }
}
