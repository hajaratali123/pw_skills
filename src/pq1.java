import java.util.Scanner;

public class pq1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int s = sc.nextInt();
        int[] arr = new int[s];
        System.out.println("Enter the elements of Array:");
        for (int i = 1; i < arr.length-1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element to Search:");
        int target = sc.nextInt();
        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i] + arr[i + 1] == target) {
                System.out.println("the"+i+ + (i + 1));
            }

    }


    }
}
