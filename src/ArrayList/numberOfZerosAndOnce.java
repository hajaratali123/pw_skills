package ArrayList;

import java.util.Scanner;

public class numberOfZerosAndOnce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of Array :");
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        int res[] = sort(arr);
        for (int ele : res){
            System.out.print(ele);
        }
    }
    public static int[] sort(int[] arr) {
        int zeros =0;
        int ones = 1;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==0) zeros++;
            else ones++;
        }
        for (int i = 0; i <arr.length; i++) {
            if (i<=zeros) arr[i]=0;
            else arr[i]=1;
        }
        return arr;
    }

}
