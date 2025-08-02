package TreeSet_TreeMaps;

import java.util.*;

public class Basic {
    public static void main(String[] args) {
        int a[]={1,2,2,3,3,3,2};
        System.out.println(uniqueOccurrences(a));
    }

    public static boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer,Integer> map = new HashMap<>();
         for (int ele : arr){
             if (map.containsKey(ele)) {
                 int frq = map.get(ele);
                 map.put(ele,frq+1);
             }
             else map.put(ele,1);
         }
        TreeSet<Integer> set = new TreeSet<>();
         for (int key : map.keySet()){
             int val = map.get(key);
             set.add(val);
         }

         return (map.size()==set.size());

    }

    public int[] findEvenNumbers(int[] digits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int key : digits){
            if(map.containsKey(key)){
                int fre = map.get(key);
                map.put(key,fre+1);
            }
            else map.put(key,1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 100; i <999 ; i+=2) {
            int x =i;
            int c = x%10;x/=10;
            int b = x%10;x/=10;
            int a = x;
            if(map.containsKey(a)){
                int afrq = map.get(a);
                map.put(a,afrq-1);
                if(afrq==1)map.remove(a);
                if(map.containsKey(b)){
                    int bfrq = map.get(b);
                    map.put(b,bfrq-1);
                    if(bfrq==1)map.remove(b);
                    if(map.containsKey(c)){
                        list.add(i);
                    }
                    map.put(b,bfrq);
                }
                map.put(a,afrq);
            }
        }
        int [] ans = new int[map.size()];
        for (int i = 0; i <ans.length ; i++) {
            ans[i]=list.get(i);
        }
        return ans;

    }

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxlen = 0;
        int i=0;
        int j=0;
        HashMap<Character,Integer> map = new HashMap<>();
        while (j<n){
            char ch = s.charAt(j);
            if(map.containsKey(ch) && map.get(ch)>=i){
                int len =j-1;
                maxlen = Math.max(maxlen,len);
                while (s.charAt(i)!=ch)i++;
                i++;
            }
            map.put(ch,j);
            j++;
        }
        int len =j-1;
        maxlen = Math.max(maxlen,len);
        return maxlen;

    }
}
