package HashSet;

import java.util.HashSet;

public class setIterate {
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<>();
        s.add(20);
        s.add(10);
        s.add(70);
        s.add(80);
        s.add(90);
        s.add(80);
        s.add(90);
        s.add(50);
        for (int ele : s){
            System.out.print(ele+" ");
        }


    }

    public int countDistinctIntegers(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i <nums.length ; i++) {
            set.add(nums[i]);
            set.add(Revese(nums[i]));
        }
        return set.size();
    }

    private Integer Revese(int num) {
        int r = 0;
        while (num!=0){
            r=r*10+num%10;
            num/=10;
        }
        return r;
    }

    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> st = new HashSet<>();
        int cnt=0;
        for (int i = 0; i <words.length ; i++) {
            String rev = reverseStr(words[i]);
            if(st.contains(rev)){
                cnt++;
                st.remove(rev);
            }
            else st.add(words[i]);
        }
        return cnt;
    }

    private String reverseStr(String s) {
        StringBuilder ns = new StringBuilder(s);
        ns.reverse();
        return ns.toString();
    }

}
