package Basic_Algorithms;

import java.util.Arrays;

public class bulitIn_sort {
    public static void main(String[] args) {
        int[] arr = {1,6,3,4,5,2};
        int n = arr.length;
        for(int ele : arr ){
            System.out.print(ele+" ");
        }
        System.out.println();
// Bubble sort --1
//        for (int x = 0; x <n-1; x++) {
//            for (int i = 0; i <n-1 ; i++) {
//                if(arr[i]>arr[i+1]){
//                    int temp = arr[i];
//                    arr[i]=arr[i+1];
//                    arr[i+1]=temp;
//                }
//            }
//        }
//
//        for(int ele : arr ){
//            System.out.print(ele+" ");
//        }
//        System.out.println();
        // Bubble sort 2
//
//        for (int x = 0; x <n-1; x++) {
//            for (int i = 0; i <n-1-x ; i++) {
//                if(arr[i]>arr[i+1]){
//                    int temp = arr[i];
//                    arr[i]=arr[i+1];
//                    arr[i+1]=temp;
//                }
//            }
//        }
//
//        for(int ele : arr ){
//            System.out.print(ele+" ");
//        }
        // Bubble sort optimised


        for (int x = 0; x <n-1; x++) {
            boolean flag = true;
            for (int i = 0; i <n-1-x ; i++) {
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    flag=false;
                }
            }
            if(flag==true) break;
        }
        for(int ele : arr ){
            System.out.print(ele+" ");
        }


    }
}
