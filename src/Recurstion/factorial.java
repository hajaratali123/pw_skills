package Recurstion;

public class factorial {
   public static int fact(int n){
       if(n==1 || n==0) return 1; //base case
       int ans = n * fact(n-1); // call
       return ans;
    }
    public static void main(String[] args) {
        int num =5;
        System.out.println(fact(5));

    }
}
