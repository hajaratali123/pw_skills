package dp.part1_38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class fibonacciNumber {

    public static void main(String[] args) {
        int n =4;

        System.out.println(fib1(n));

    }
 // Basic Approach
    public static  int fib1(int n) {
        if(n<=1) return n;
        return fib1(n-1)+fib1(n-2);
    }
    // Dp Approach - memoization

    public static  int fibo(int n,int[] dp) {
        if(n<=1) return n;
        if(dp[n]!=0) return dp[n];
        int ans = fibo(n-1,dp)+fibo(n-2,dp);
        dp[n]=ans;
        return ans;
    }

    public static  int fib(int n) {
        int[] dp = new int[n+1];
        return fibo(n,dp);
    }
// do approach-tabulation

    public static  int fib3(int n) {
        if(n<=1) return n;
        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for (int i = 2; i <=n ; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    // leet code min cost

    public int minCost(int[] cost,int inx,int[] dp) {
        if(inx==0 || inx==1) return cost[inx];
        if (dp[inx]!=-1) return dp[inx];
        return dp[inx]=cost[inx]+Math.min(minCost(cost,inx-1,dp),minCost(cost,inx-2,dp));

    }

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return Math.min(minCost(cost,n-1,dp),minCost(cost,n-2,dp));

    }

    public  int tribonacci(int n) {
        int[] arr = new int[n+1];
//        vector<int> arr= new =vector<>();
        arr[0] = 0;
        if(n >= 1)arr[1] = 1;
        if(n >= 2)arr[2] = 1;

        for(int i = 3; i <= n; i++){
            arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
        }

        return arr[n];
    }

}
