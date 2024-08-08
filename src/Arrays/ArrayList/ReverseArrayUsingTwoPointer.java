package Arrays.ArrayList;

import java.util.Scanner;

public class ReverseArrayUsingTwoPointer {
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
            System.out.print(arr[i]+" ");

        }
        int i=0;
        int j=n-1;
        // for to begin with some index and end with some index j use i= start index num, j=end index number

        while (i<=j){
            swap(arr,i,j);
            i++;
            j--;
        }
        System.out.println();
        System.out.println("Reversed Array :");
        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
