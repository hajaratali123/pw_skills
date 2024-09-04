package placement.day7;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class program2 {

    public static Set<String> getPermutation(String str) {
        // Convert string to character array
        char[] chars = str.toCharArray();

        // Initialize set to store permutations
        Set<String> permutations = new HashSet<String>();

        // Base case: empty string
        if (str.length() == 0) {
            permutations.add("");
            return permutations;
        }

        // Recursive function to generate permutations
        getPermutations(chars, 0, str.length() - 1, permutations);

        return permutations;
    }

    private static void getPermutations(char[] chars, int left, int right, Set<String> permutations) {
        // Base case: only one character left
        if (left == right) {
            permutations.add(new String(chars));
        } else {
            for (int i = left; i <= right; i++) {
                // Swap characters
                char temp = chars[left];
                chars[left] = chars[i];
                chars[i] = temp;

                // Recursively generate permutations for remaining characters
                getPermutations(chars, left + 1, right, permutations);

                // Backtrack: swap characters back
                temp = chars[left];
                chars[left] = chars[i];
                chars[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String data = input.nextLine();
        System.out.println("Permutations of " + data + ": \n" + getPermutation(data));
    }
}
