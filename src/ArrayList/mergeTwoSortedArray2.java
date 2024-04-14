package ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class mergeTwoSortedArray2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of Array1 :");
        for (int i = 0; i <=n-1 ; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the Size of Array2 : ");
        int m = sc.nextInt();
        int[] b = new int[m];
        System.out.println("Enter the elements of Array2 :");
        for (int i = 0; i <=m-1 ; i++) {
            b[i]=sc.nextInt();
        }
        int[] c =new int[n+m];
        int i = n-1,j=m-1,k=c.length-1;

        while(i>0 && j>0){
            if(a[i]<=b[j]){
                c[k]=a[i];
                i--;
                k--;
            }
            else {
                c[k]=b[j];
                j--;
                k--;
            }
        }
        if(i==0){
            while (j>0)
            {
                c[k]=b[j];
                j--;
                k--;
            }
        }
        if (j==0){
            while (i>0){
                c[k]=a[i];
                j--;
                k--;
            }
        }
        System.out.println(Arrays.toString(c));
        for (int ele : c){
            System.out.print(c);
        }
    }

}
