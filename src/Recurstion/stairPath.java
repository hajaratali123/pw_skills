package Recurstion;

import java.util.Scanner;

public class stairPath {

    public  static int Stair(int n){
        if(n<=2) return n;
        return Stair(n-1)+Stair(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a nuber :");
        int n = sc.nextInt();

        System.out.println(Stair(n));
    }
}
