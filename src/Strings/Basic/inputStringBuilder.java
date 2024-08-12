package Strings.Basic;

import java.util.Scanner;

public class inputStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);
        System.out.println(str.charAt(1));

        str.setCharAt(1,'o');

        System.out.println(str);
    }
}
