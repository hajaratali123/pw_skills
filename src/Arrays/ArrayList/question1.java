package Arrays.ArrayList;

import java.util.Scanner;

//Given an array of integers nums and an integer target, return indices
// of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution,
// and you may not use the same element twice.
//You can return the answer in any order.

public class question1 {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        System.out.println("Enter the Size of array:");
        int n =inpt.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of Array:");
        for (int i = 0; i <arr.length; i++) {

            arr[i]=inpt.nextInt();

        }
        System.out.println("Enter the value of X:");
        int x = inpt.nextInt();
        for (int i = 0; i <arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]+arr[j]==x){
                    System.out.println("Found the number:"+arr[i]+"+"+arr[j]+"="+x+" at "+i+" "+j);
                }

            }
        }
    }
}
