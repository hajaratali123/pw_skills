import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the marks students :");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();

        }
        System.out.println("The students having less then 35 marks:");
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<35){
                System.out.println(i);
            }

        }

    }
}
