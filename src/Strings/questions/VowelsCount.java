package Strings.questions;

import javax.xml.transform.Source;
import java.util.Scanner;
import java.util.Set;

public class VowelsCount {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        char[] s = {'a','l','i'};
//
//        char[] a ={'a','e','i','o','u'};
//        int cnt = 0;
//        for (int i = 0; i <s.length; i++) {
//            if (s[i]== a[i]) {
//                cnt+=1;
//            }
//
//        }
//        System.out.println(cnt);

        System.out.println("Enter a String :");
        String s1 = sc.nextLine();

        int cnt2 = 0;
        for (int i = 0; i <s1.length() ; i++) {
            char ch = s1.charAt(i);
            if(isVowel(ch)==true) cnt2=+1;

        }
        System.out.println(cnt2);

    }

    public static  boolean isVowel(char ch){
        if(ch=='a' || ch == 'A') return true;
        if(ch=='b' || ch == 'B') return true;
        if(ch=='c' || ch == 'C') return true;
        if(ch=='d' || ch == 'D') return true;
        if(ch=='e' || ch == 'E') return true;
        else return false;

    }
}
