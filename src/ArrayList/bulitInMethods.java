package ArrayList;

import java.lang.reflect.Array;
import java.util.Arrays;

public class bulitInMethods {
    public static void main(String[] args) {
        int[] arr={90,78,20,40,45,47,46,54,657};
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        System.out.println("Sorting");
        Arrays.sort(arr);
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
