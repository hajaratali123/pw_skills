package Recurstion;

import java.util.Scanner;

public class power {

    public static int pow(int a,int b){
        if(a==0 ) return 0;
        if(b==0) return 1;
        return a*pow(a,b-1);
    }
    public static int pow2(int a, int b) {
        if (b == 0) return 1;
        int ans = pow2(a, b / 2);
        if (b % 2 == 0) {
            return ans * ans;
        } else {
            return ans * ans*a;
        }
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base:");
        int a =sc.nextInt();
        System.out.println("Enter the power:");
        int b = sc.nextInt();
        System.out.println(pow(a,b));
        System.out.println(pow2(a,b));
    }
}
