package leetcode.Arrays;

import java.util.Arrays;

//861. Score After Flipping Matrix
public class ScoreAfterFlippping {
    public static void main(String[] args) {
        int[][] arr = {{0,0,1,1},{1,0,1,0},{1,1,0,0}};
        int m= arr.length,n = arr[0].length;

        for (int i = 0; i <m ; i++) {
            if(arr[i][0]==0){
                for (int j = 0; j <n ; j++) {
                    if(arr[i][j]==0) arr[i][j]=1;
                    else arr[i][j]=0;
                }
            }
        }
       System.out.println("original Array :");
      System.out.println(Arrays.deepToString(arr));
        for (int j = 1; j <n ; j += 1) {
            int zeroCount=0,onsCount=0;
            for (int i = 0; i <m ; i++) {
                    if(arr[i][j]==0) zeroCount++;
                    else onsCount++;
            }
            if (zeroCount > onsCount) {
                for (int i = 0; i < m; i++) {
                    if (arr[i][j]==0) arr[i][j]=1;
                    else arr[i][j]=0;
                }
            }
        }
       System.out.println(" Array 2  :");

       System.out.println(Arrays.deepToString(arr));

        int score = 0;
        int x =1;
        for (int i = n-1; i >=0 ; i--) {
            for (int j = 0; j <m ; j++) {
                score+=(arr[j][i]*x);

               System.out.println(score);
            }
            x*=2;
        }
       // return score;
       System.out.println(score);
      System.out.println(Arrays.deepToString(arr));
    }
}

