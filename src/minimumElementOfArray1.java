import java.util.Scanner;

public class minimumElementOfArray1 {
    public static void main(String[] args) {
            Scanner in2 = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int size =in2.nextInt();
            int[] array5 = new int[size];
        for (int i = 0; i <array5.length ; i++) {
            array5[i]=in2.nextInt();
        }
        int res = minmum(array5);
        System.out.println("The Minimum of Array is :"+res);
    }

    public static int minmum(int[] array5) {
        Integer integer = null;
        int min = integer.MAX_VALUE;
        for (int i = 0; i <array5.length ; i++) {
            if(min>array5[i+1]){
                min=array5[i];
            }

        }

        return min;
    }
}
