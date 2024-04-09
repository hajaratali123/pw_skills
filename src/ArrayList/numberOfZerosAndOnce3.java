package ArrayList;

import java.util.Arrays;
import java.util.Scanner;
// solution ny one pass method using 2 pointers
public class numberOfZerosAndOnce3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of Array :");
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();

        }
       int i =0;
        int j=n-1;
        while (i<j){
            if(arr[i]==0)
                i++;
            else if (arr[j]==1)
                j--;
//            if(i>j) break;
           else if (arr[i]==1 && arr[j]==0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));



    }
}
