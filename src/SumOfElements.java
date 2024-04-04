import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.println("The the Size of array");
        int x = in.nextInt();
        int[] arr4 = new int[x];

        System.out.println("The values of Array:");
        for (int i = 0; i <arr4.length ; i++) {
            arr4[i]=in.nextInt();

        }
        int sum =0;
        for (int i = 0; i < arr4.length; i++) {
            sum = sum+arr4[i];
        }
        System.out.println("The sum of elements are :"+sum);
    }
}
