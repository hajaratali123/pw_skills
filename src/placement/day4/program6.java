package placement.day4;

import java.util.Arrays;

public class program6 {
    public static void main(String[] args) {
         int[] arr ={1,2,2,3,4,0,0,4,8};
         int NonZerocnt=0;

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]!=0){
                arr[NonZerocnt]=arr[i];
                NonZerocnt++;
            }
        }
//        System.out.println(Arrays.toString(arr));
        for (int i = NonZerocnt; i <arr.length; i++) {
            arr[i]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
