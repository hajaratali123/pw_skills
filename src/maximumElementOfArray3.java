import java.util.Scanner;

public class maximumElementOfArray3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int s = sc.nextInt();
        int[] arr = new int[s];
        System.out.println("Enter the elements of Array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int res=maxNum(arr);
        System.out.println("The maximum of array is "+res);

    }
    @org.jetbrains.annotations.Contract(pure = true)
    public static int maxNum(int[] arr){
        int max=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max){
                max=Math.max(max,arr[i]);
            }
        }

        return max;
    }


}
