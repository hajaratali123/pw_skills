package Arrays.ArrayList;

import java.util.Arrays;

public class copyOfArray {
    public static void main(String[] args) {
        int[] arr={90,78,20,40,45,47,46,54,657};

        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("Copy of Array: ");
        int[] nums = arr;
        nums[0]=100;
        nums[2]=200;
        for(int ele : nums){
            System.out.print(ele+" ");
        }
        System.out.println();
        // coping for one array its shallow copy,it doesn't create
        // new array but its original array assigned to new array any changes we made in new array shall reflect in old array

        int[] arr2 =Arrays.copyOf(arr,arr.length);
        // to Avoid that we use concept of Deep copy creates new Array that Creates new Array that changes in new doesn't reflect in new array
        // using for each loop
        for(int ele : arr2){
            System.out.print(ele+" ");
        }
        System.out.println();
        // Deep copy 2
        int[] err = new int[arr.length];
        for (int num : err){
            System.out.print(num+" ");
        }
        System.out.println("New values :");
        err[1]=400;
        System.out.println(err[1]);
    }
}
