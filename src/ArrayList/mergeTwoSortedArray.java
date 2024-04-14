package ArrayList;

import java.util.Scanner;

public class mergeTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of Array1 :");
        for (int i = 0; i <=n-1 ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Size of Array2 : ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the elements of Array2 :");
        for (int i = 0; i <=n2-1 ; i++) {
            arr2[i]=sc.nextInt();
        }

        int[] arr3 =new int[n+n2];

        int i = 0,j=0,k=0;
     while(i<n && j<n2){
         if(arr[i]<=arr2[i]){
             arr3[k]=arr[i];
             i++;
         }
         else {
             arr3[k]=arr2[j];
             j++;
         }
         k++;
     }
     if(i==n){
         while(j<n2){
             arr3[k]=arr2[j];
             j++;
             k++;
         }
     }
     if(j==n2){
         while (i<n){
             arr3[k]=arr[i];
             i++;
             k++;
         }
     }
     for (int ele : arr3){
         System.out.print(ele+" ");
     }
    }
}
