package placement.day4;

import java.util.concurrent.ThreadLocalRandom;

public class randomNum {
    public static void main(String[] args) {
    int n =10;
    int m=0;
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
        for (int i = 0; i <n ; i++) {
            m = ThreadLocalRandom.current().nextInt(1,200)*2;
            max = Math.max(m,max);
            min=Math.min(m,min);
            System.out.println(m);
        }
        System.out.println("max number :"+max);
        System.out.println("min number "+min);
    }
}
