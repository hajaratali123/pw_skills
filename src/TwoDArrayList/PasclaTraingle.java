package TwoDArrayList;

import java.util.ArrayList;
import java.util.List;

class PasclaTraingle {
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> ans = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            List<Integer> l = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                // Initialize the first and last element of each row to 1
                if (j == 0 || j == i) {
                    l.add(1);
                } else {
                    // Initialize other elements with 0, will update them later
                    l.add(0);
                }
            }
            ans.add(l);
        }

        // Fill in the Pascal's Triangle values
        for (int i = 2; i < n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                ans.get(i).set(j, ans.get(i - 1).get(j) + ans.get(i - 1).get(j - 1));
            }
        }
        return ans ;

        // Print Pascal's Triangle
        for (List<Integer> row : ans) {
            System.out.println(row);
        }
    }
}
