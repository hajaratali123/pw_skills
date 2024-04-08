package ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class numberOfZerosAndOnce2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of Array :");
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();

        }
        int numOfZeros =0;
        int numOfOnce =0;
        for (int i = 0; i <n ; i++) {
            if (arr[i]==0)
                numOfZeros++;
            else
                numOfOnce++;
        }
        for (int i = 0; i <n ; i++) {
            if(i<=numOfZeros)
                  arr[i]=0;
            else
                arr[i]=1;
        }
        System.out.println(arr.length);
        System.out.print(Arrays.toString(arr));


    }
}
