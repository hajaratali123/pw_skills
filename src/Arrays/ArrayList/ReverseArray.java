package Arrays.ArrayList;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int n =sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of Array:");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]);

        }
        System.out.println();
        System.out.println("Reversed Array");
        for (int i = 0; i <arr.length/2 ; i++) {
            int j =n-1-i;
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]);

        }

    }
}
