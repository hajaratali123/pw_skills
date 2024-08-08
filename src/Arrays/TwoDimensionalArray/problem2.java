package Arrays.TwoDimensionalArray;



import java.util.Scanner;

// to find the largest , smallest and sum of  element of 2D Array
public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of array  m And n :");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr2 =  new int[m][n];
        System.out.println("Enter the Elements for Array M and Z Size :");
        for (int i = 0; i <arr2.length ; i++) {
            for (int j = 0; j <arr2.length; j++) {
                arr2[i][j]=sc.nextInt();

            }
        }
        System.out.println("The largest element of this arrays");
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr2.length ; i++) {
            for (int j = 0; j < arr2.length; j++) {
                max= Math.max(max,arr2[i][j]);
            }
        }
        System.out.println(max);

        System.out.println("The smallest of this Arrays :");
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <arr2.length ; i++) {
            for (int j = 0; j < arr2.length; j++) {
                min= Math.min(min,arr2[i][j]);
            }

        }
        System.out.println(min);
        int sum=0;
        System.out.println("The sum of elements of Arrays ");
        for (int i = 0; i <arr2.length ; i++) {
            for (int j = 0; j < arr2.length; j++) {
          sum= sum+arr2[i][j];
            }
        }
        System.out.println(sum);
    }
}
