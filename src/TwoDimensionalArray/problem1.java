package TwoDimensionalArray;

import java.util.Scanner;

// Write a program to store roll number and marks obtained
// by 4 students side by side in a matrix
public class problem1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student Numbers");
        int[][] arr = new int[4][5];
        for(int i=0; i<arr.length; i++){
            for (int j=0;j<arr.length;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0; i<arr.length; i++){
            for (int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }



    }

}
