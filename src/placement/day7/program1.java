package placement.day7;

import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        System.out.println("Enter a String :");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        generatePermutations(input,0,input.length()-1);
    }
    private static void generatePermutations(String str, int l, int r) {
        if(l==r) System.out.println(str);
        else {
            for (int i = l; i <=r ; i++) {
                str=swap(str,l,i);
                generatePermutations(str,l+1,r);
                str=swap(str,l,i);
            }
        }
    }
    public static String swap(String a,int i,int j){
        char temp;
        char[] charArray=a.toCharArray();
        temp=charArray[i];
        charArray[i]=charArray[j];
        charArray[j]=temp;
        return String.valueOf(charArray);
    }
}


