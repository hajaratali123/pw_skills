package Basic_Algorithms;

// 283. Move Zeroes

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Move_Zeroes {
    public static void main(String[] args) {
        int[] nums = {0,12,33,0,23};

        moveZeroes(nums);

    }

    public static void moveZeroes(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int zeros=0;
        for(int ele : nums){
        if(ele!=0) arr.add(ele);
        else zeros+=1;
        }
        for (int i = 0; i < zeros ; i++) {
            arr.add(0);
        }
        for (int i = 0; i <nums.length ; i++) {
            nums[i]= arr.get(i);
        }
        System.out.println(Arrays.toString(nums));


    }
}
