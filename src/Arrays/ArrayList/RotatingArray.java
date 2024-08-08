package Arrays.ArrayList;

import java.util.Scanner;

public class RotatingArray {
    public static void main(String[] args) {
        Scanner dc = new Scanner(System.in);
        System.out.println("Enter the value of k");
        int k = dc.nextInt();

        System.out.println("Enter Size of Array:");
        int n = dc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of Array:");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=dc.nextInt();
        }
        k = k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
        for (int ele : arr){
            System.out.println(ele);
        }
    }

    public static void reverse(int[] arr, int i, int j) {
        while (i<=j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }


}
