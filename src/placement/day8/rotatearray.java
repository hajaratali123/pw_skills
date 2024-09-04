package placement.day8;

import java.util.Arrays;

public class rotatearray {
    public static void main(String[] args) {
        int arr[] = {1 , 2 , 3 , 4 , 5};

//        int res[] = new int[arr.length];
//
//        res[0] = arr[arr.length-1];
//        int j = 1 ;
//        for(int i = 0 ; i<arr.length-1 ; i++){
//            res[j++] = arr[i];
//        }
//
//
        int temp = arr[arr.length -1];
//        System.out.println(temp);

        int i;
        for( i = arr.length-1; i>=1 ; i--){
            System.out.println(i);
            arr[i] = arr[i-1];
        }
        arr[i] =  temp;

                System.out.println(Arrays.toString(arr));
    }
}
