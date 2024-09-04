package placement.day9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class program3 {
    public static void main(String[] args) {
        String s = "LongestSubstring";
        LongestSubstring(s);
        System.out.println(lengthOfLongestSubstring(s));
    };
    private static void LongestSubstring(String s) {
        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < s.length()-1; i++) {
            for (int j = 1; j <s.length()-1 ; j++) {
                if(s.charAt(i)!=s.charAt(j)){
                    hs.add( String.valueOf(s.charAt(j)));
                }
            }
        }
        for (String el : hs ) System.out.print(el+" ");
    }

    public  static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        int i = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int j = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j)))
                i = Math.max(i, map.get(s.charAt(j)) + 1);
            map.put(s.charAt(j), j);
            ans = Math.max(ans, j - i + 1);
        }
        return ans;
    }
}
