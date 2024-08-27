package placement.day5;


import java.util.*;

public class program3 {

    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();

        Set<Integer> as = new HashSet<>();
        int[] arr = {1,2,4,4,};
        int max =Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <arr.length ; i++) {
            max=Math.max(i,max);
            for (int j = 1; j <max; j++) {
                if(arr[j]!=j){
                    min=Math.min(min,j);
                }
            }

        }
        for (int i = 0; i <arr.length ; i++) {
            for (int j = arr[0]; j <max; j++) {
                if(arr[j]!=j){
                    min=Math.min(min,j);
                }
            }

        }
        for (int j = 1; j <max; j++) {
            if(arr[j]!=j){
                min=Math.min(min,j);
            }
        }
        System.out.println(min);

        }

}
// you are given an array arr[] of N integers the task to find the smallest number missing from the Array