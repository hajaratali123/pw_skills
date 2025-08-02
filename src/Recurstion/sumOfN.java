package Recurstion;

public class sumOfN {
    public static void sum(int n,int s){
        if(n==0){
            System.out.println(s);
            return;
        }
        sum(n-1,s+n);

    }

    public static int sum(int n ){
        if(n==0 || n==1) return n;
        return n+sum(n-1) ;
    }
    public static void main(String[] args) {
        int n = 10;

        sum(5,0);
        System.out.println(sum(0));



    }
}
