package ArrayList;

import java.util.Scanner;

@SuppressWarnings("ReassignedVariable")
public class DutchFlagAlgo {
    //one pass algorithm
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of Array :");
        for (int i = 0; i <=n ; i++) {
            arr[i]=sc.nextInt();
        }
        int mid=0;
        int low=0;
        int high=n-1;
        while (mid<=high){
            if(arr[mid]==0){
                swap(arr,mid,low);low++;high++;
            }
            else if (arr[mid]==1) {mid++;
            }
            else { //arr[mid]==2
                swap(arr,mid,high);
                high--;}
        }
        for (int i = 0; i <=n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void swap(int[] arr, int mid, int low) {
        int temp = arr[mid];
        arr[mid]=arr[low];
        arr[low]=temp;
    }
}
