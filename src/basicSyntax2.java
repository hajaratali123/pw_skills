import java.util.Scanner;

public class basicSyntax2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr2 = new int[10];
        System.out.println("Enter the value of array ");
        for (int i = 0; i <10 ; i++) {
            arr2[i]=sc.nextInt();

        }
        System.out.println("The output of Array :");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr2[i]+" ");

        }
    }
}
