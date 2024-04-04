import java.util.Scanner;

public class productOfArrayElements {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.println("The the Size of array");
        int x = in.nextInt();
        int[] arr4 = new int[x];

        System.out.println("The values of Array:");
        for (int i = 0; i < x; i++) {
            arr4[i]=in.nextInt();

        }
        int pro =1;
        for (int i = 0; i < x; i++) {
            pro= pro*arr4[i];

        }
        System.out.println("The product of elements are :"+pro);

    }
}
