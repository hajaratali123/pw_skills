package placement.day3;

import java.util.Scanner;

public class prom3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String st = string.toLowerCase();

        boolean isIsogram = true;

        for (int i = 0; i < st.length(); i++) {
            for (int j = i + 1; j < st.length(); j++) {
                if (st.charAt(i) == st.charAt(j)) {
                    isIsogram = false;
                    break;
                }
            }
            if (!isIsogram) {
                break;
            }
        }

        if (isIsogram) {
            System.out.println("isogram");
        } else {
            System.out.println("not isogram");
        }
    }
}