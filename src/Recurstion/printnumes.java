package Recurstion;

import java.util.Scanner;

public class printnumes {

    public static void Back_print(int n){
        if(n==0) return;
        System.out.println(n);
        Back_print(n-1);
    }
    public static void Back_print_front(int n){
        if(n==0) return;
        Back_print_front(n-1);
        System.out.println(n);
    }
    public static void front_print(int x,int n){
        if(x>n) return;
        System.out.println(x);
        front_print(x+1,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numeber ");
        int   n = sc.nextInt();
      //front_print(1,n);
      //  Back_print(n);
        Back_print_front(n);
    }
}
