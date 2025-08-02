package HashMaps;

import java.util.HashMap;

public class basic {
    public static void main(String[] args) {
        HashMap<String,Integer> mp =new HashMap<>();
        mp.put("Hajaratali",10);
        mp.put("sunaina",20);
        mp.put("ali",10);
        mp.put("Asjad",10);
        mp.put("karan",10);
        mp.put("karan",10);

        System.out.println(mp);
        System.out.println(mp.containsValue(20));
        mp.put("karan",20);
        System.out.println("Size +"+mp.size());

        mp.remove("sunaina");
        System.out.println("Size +"+mp.size());
        System.out.println(mp.get("ali"));

       for (String k : mp.keySet()){
           System.out.print("key ="+k+" val= ");
           System.out.println(mp.get(k));
       }

       for (int val : mp.values()){
           System.out.println(val);
       }


       for (Object pair : mp.entrySet()){
           System.out.println(pair);
       }

    }

    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> smap = new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            char key = s.charAt(i);
            if(smap.containsKey(key)){
                int frq=smap.get(key);
                smap.put(key,frq+1);
            }
            else smap.put(key,1);
        }
        HashMap<Character,Integer> tmap = new HashMap<>();
        for (int i = 0; i <t.length() ; i++) {
            char key = s.charAt(i);
            if(tmap.containsKey(key)){
                int frq=tmap.get(key);
                tmap.put(key,frq+1);
            }
            else tmap.put(key,1);
        }

        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            if(smap.get(key)!=tmap.get(key)) return true;
            else return false;

        }
        for (int key : smap.keySet()){
            Integer count = smap.get(key);
            int val1  = count.intValue();
            if(!tmap.containsKey(key)) return false;
            Integer count2 = tmap.get(key);
            int val2  = count2.intValue();
            if(val1==val2) return false;
        }
        return true;

    }

    public int[] twoSum(int[] nums, int target) {
    int[] arr ={-1,-1};
    HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <arr.length; i++) {
            int rem = target-nums[i];
            if(map.containsKey(rem)){
                arr[0]=i;
                arr[1]=map.get(rem);
                break;
            }
            else map.put(nums[i],i);
        }
        return arr;
    }


}
