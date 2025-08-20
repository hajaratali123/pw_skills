package SWD;

import java.lang.reflect.Array;

public class Minimum_Size_Subarray_Sum {

    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSubArrayLen(target,arr));
    }

   public static  int minSubArrayLen(int target, int[] nums) {

    int n = nums.length;
    int minlen = Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
        int sum =0,j=i;
        while(j<n && sum< target){
            sum=+nums[j++];
        }
        j--;
        int len =j-i+1;
        if(sum>=target) minlen=Math.min(minlen, len);
    }
    if(minlen==Integer.MAX_VALUE) return 0;
    return minlen;
    }

    


    public static  int minSubArrayLen2(int target, int[] arr) {
        int n = arr.length,minlen = Integer.MAX_VALUE;
        int i =0,j=0,sum=0;
        // first window
        while(j<n && sum<target){
            sum+=arr[j];
            j++;
        }
        j--;
        while(i<n && j< n){
            int len = j-i+1;
            if(sum>=target) minlen=Math.min(minlen, len);
            sum-=arr[i];
            i++;j++;
            while(j<n && sum < target){
                sum+=arr[j++];
            }
            j--;
        }

        if(minlen ==Integer.MAX_VALUE) return 0;

        return minlen;
    
    }

     public int numSubarrayProductLessThanK11(int[] arr, int k) {

        int n =arr.length;
        int i =0,j=0,pro=1;
        while(j<n && pro>= k){
            pro*=arr[j];
            j++;
        }
        j--;
        int cnt =0;
        while(i<n && j<n){
            if(pro<k) cnt++;
            pro /= arr[i];
            i++;j++;
            while(j<n && pro>=k){
                pro*=arr[j++];
            }
            j--;
        }
        return cnt;

        
    }

    
public int numSubarrayProductLessThanK(int[] arr, int k) {
        if(k<=1 ) return 0;
        int count=0;
        int product=1;
        int left=0;

        for(int right =0; right<arr.length;right++){
            product*=arr[right];

            while(product >= k && left <= right){
                product/=arr[left];
                left++;
            }
            count+=(right-left+1);

        }

        return count;
      
    }
}
    

    

