package placement;

public class pro1 {
    public static void main(String[] args) {
        int x = 4;

        //int squareRoot = (int) Math.sqrt(4);
    //    System.out.println(squareRoot);
        int i =1;
        while (i*2<= x){
            i++;
        }
        System.out.println(i-1);

    }

    public static int floor(int x){
        if(x==0 || x==1){
            return x;
        }
        int start=1,end=x,ans=0;
        while (start<=end){
            int mid = (start+end)/2;
            if(mid*mid==x){
                return mid;
            }
            if(mid<=x/mid){
                start=mid+1;
                ans=mid;
            }else {
                end=mid-1;
            }

        }

        return 0;
    }
}
