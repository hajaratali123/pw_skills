package HashMaps;

import java.util.HashMap;
import java.util.Map;

public class p2 {

    public static int minSubarray(int[] nums, int p) {
        int n = nums.length;
        int[] prefixSum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }

        Map<Integer, Integer> remainderMap = new HashMap<>();
        remainderMap.put(0, -1);
        for (int i = 0; i <= n; i++) {
            int r = prefixSum[i] % p;
            if (!remainderMap.containsKey(r)) {
                remainderMap.put(r, i);
            }
        }

        int minLength = n;
        int i=0;
        for (int r : remainderMap.keySet()) {
            if (r != 0) {
                minLength = Math.min(minLength, i - remainderMap.get(r));
                i++;
            }
        }

        return minLength == n ? -1 : minLength;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 2};
        int p = 6;
        System.out.println(minSubarray(nums, p)); // Output: 1

        int[] nums2 = {6, 3, 5, 2};
        int p2 = 9;
        System.out.println(minSubarray(nums2, p2)); // Output: 2

        int[] nums3 = {1, 2, 3};
        int p3 = 3;
        System.out.println(minSubarray(nums3, p3)); // Output: 0
    }
}
