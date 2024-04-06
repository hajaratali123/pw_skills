package Arrays;

import java.util.Scanner;

public class intilazingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size ");
        int n = sc.nextInt();
        int[] arr2 = new int[n];
        System.out.println("Enter the value of array");

        for (int i = 0; i <n ; i++) {
            arr2[i]=sc.nextInt();

        }
        System.out.println("The output of Array :");
        for (int i = 0; i < n ; i++) {
            System.out.print(arr2[i]+" ");

        }
    }
}
