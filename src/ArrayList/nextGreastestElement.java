package ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class nextGreastestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] ans = new int[n];
        ans[n-1]=-1;
        System.out.println("Enter the elements of Array :");
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        // method 1
//        for (int i = 0; i < n-1; i++) {
//            int mx=Integer.MIN_VALUE;
//            for (int j = 0; j < n; j++) {
//                mx= Math.max(mx,arr[j]);
//
//            }
//            ans[i]=mx;
//        }
        // method 2
        //i NextGreatestElement = NGE
        int nge = arr[n-1];
        for (int i = n-2; i >=0 ; i--) {
            ans[i]=nge;
            nge = Math.max(nge,arr[i]);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(ans));

    }
}
