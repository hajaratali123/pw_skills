import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array :");
        int n = sc.nextInt();
        int[] num = new int[n];
        System.out.println("Enter the Elements of Array size %d"+n);
        for (int i = 0; i <num.length ; i++) {
            num[i]= sc.nextInt();

        }
        System.out.println("Enter the number or element to Search:");
        int num2= sc.nextInt();
        boolean flag = false;
        for (int i = 0; i <num.length ; i++) {
            if(num[i]==num2)
            {
                flag=true;
                break;
            }
        }
        if(flag==true)
            System.out.println("the element found :)");
        else
            System.out.println("The element does not found..!");
    }
}
