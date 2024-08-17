package leetcode.strings;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two arrys of same length String :");
        String s = sc.nextLine();
        String t = sc.nextLine();
        boolean istrue=iSAnagram(s, t);
        if(istrue==true){
            System.out.println("The string are Anagram");
        }
        else {
            System.out.println("The string are not Anagram");
        }
    }

    public static boolean iSAnagram(String s, String t) {

        if (s.length() != t.length()) return false;
        else {

            char[] a = s.toCharArray();
            char[] b = t.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            for (int i = 0; i <a.length ; i++) {
                if(a[i]!=b[i]) return false;
            }
            return true;
        }
    }
}