import java.util.Arrays;
import java.util.Scanner;

public class Friends_Pairing_Problem {

    static int[] dp;
    

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n : ");

        int n = sc.nextInt();
        dp = new int[n+1];
        Arrays.fill(dp,-1);

        System.out.println(pair(n));

        System.out.println("Answer 2 :");

       // System.out.println(pair2(n, dp));

        System.out.println("Tabulation : ");

        System.out.print(frined(n));
      //  sc.close();

     // System.out.println();

    }

   private static int frined(int n) {
        int[] dp = new int[n+1];
        if(n>0) dp[1]=1;
        if(n>1) dp[2] =2;
        for(int i =3;i<=n;i++){
            dp[i] = dp[i-1]+(i-1)*dp[i-2];
        }
        return dp[n];

    }

 private static int countFriendsPairings(int n){
        if(n<=2) return n;
        return countFriendsPairings(n-1)+(n-1)*countFriendsPairings(n-2);
    }

    private static int pair(int n) {
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        if(n<=2) return n;
        if(dp[n]!=-1) return dp[n];
        return dp[n]= pair(n-1) + (n-1)*pair(n-2);
    }

    // private  static int pair2(int n, int[] dp){
    //    // dp = new int[n+1];
    //    // Arrays.fill(dp,-1);
    //     if(n<=2) return n;
    //     if(dp[n]!=-1) return dp[n];
    //     return dp[n]= pair2(n-1,dp) + (n-1)*pair2(n-2,dp);
    // }


}
