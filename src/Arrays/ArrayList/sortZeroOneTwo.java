package Arrays.ArrayList;

import java.util.Scanner;

public class sortZeroOneTwo {
    //method one two pass solution
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of Array :");
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();

        }
        int noZeros =0,noOnce=0;
        for (int i = 0; i < n; i++) {
            if (arr[i]==0)noZeros++;
            if (arr[i]==1)noOnce++;
        }
        for (int i = 0; i < n; i++) {
            if (i<noZeros)arr[i]=0;
            else if (i<noZeros+noOnce) arr[i]=1;
            else
                arr[i]=2;
        }
        for (int ele :arr){
            System.out.print(ele+" ");
        }
    }
}
