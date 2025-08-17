
import java.util.Arrays;

public class houseRobber{
        public static int amount(int[] numns,int i,int[] dp){
            if(i>= numns.length) return 0;

            if(dp[i]!=-1) return dp[i];

            int take = numns[i]+amount(numns, i+2, dp);
            int skip = amount(numns, i+1, dp);

            return dp[i] = Math.max(take,skip);

    }

    public static int rob(int[] numns){

        int[] dp = new int[numns.length];
        Arrays.fill(dp,-1);

        return amount(numns,0,dp);
    }

    public static  int rob2(int[] arr){

        int n = arr.length;

        if(n==0) return 0;
        if(n==1) return arr[0];

        int[] dp = new int[n];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0],arr[1]);
        for(int i =2;i<n;i++){

            dp[i]=Math.max(dp[i-1],arr[i]+dp[i-2]);

            //dp[i]=Math.max(dp[i]+dp[i-2], dp[i-1]);
        }
      return dp[n-1];

    }
    

    public static void main(String[] args) {

        int[] nums = {2,3,4,5};

       int res2= rob2(nums);
       System.out.println(res2);

        int res = rob(nums);
        System.out.println(res);

        
    
        }
}