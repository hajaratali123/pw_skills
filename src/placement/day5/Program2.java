package placement.day5;

import java.util.ArrayList;

public class Program2 {
    public static ArrayList<Integer> findSubArrayWithSum(int[] arr, int n, int s) {
        int start = 0;
        int currSum = 0;

        for (int end = 0; end < n; end++) {
            currSum += arr[end];

            while (currSum > s && start <= end) {
                currSum -= arr[start];
                start++;
            }

            if (currSum == s) {
                ArrayList<Integer> res = new ArrayList<>();
                res.add(start + 1);  // +1 to convert to 1-based index
                res.add(end + 1);    // +1 to convert to 1-based index
                return res;
            }
        }

        // Return an empty ArrayList if no subarray is found
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        // Example usage
        int[] arr = {1, 2, 3, 7, 5};
        int s = 10;
        ArrayList<Integer> result = findSubArrayWithSum(arr, arr.length, s);
        if (result.isEmpty()) {
            System.out.println("No subarray found with the given sum.");
        } else {
            System.out.println("Subarray found from index " + result.get(0) + " to " + result.get(1));
        }
    }
}
