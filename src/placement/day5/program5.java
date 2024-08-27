package placement.day5;

import java.util.HashSet;
import java.util.Scanner;

public class program5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (isPangram(s)) {
            System.out.println("pangram");
        } else {
            System.out.println("not a pangram");
        }
    }

    public static boolean isPangram(String sb) {
        // Convert the string to lower case to handle both upper and lower case letters uniformly
        sb = sb.toLowerCase();

        // Use a HashSet to track unique alphabetic characters
        HashSet<Character> letters = new HashSet<>();

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                letters.add(ch);
            }
        }

        // Check if the set contains all 26 letters of the alphabet
        return letters.size() == 26;
    }
}
