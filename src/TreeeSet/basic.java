package TreeeSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class basic {

    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(20);
        set.add(30);
        set.add(100);
        set.add(100);

        System.out.println(set.size());
        System.out.println(set);
        // search tc = 0(1)
        System.out.println(set.contains(20));
        System.out.println(set.contains(50));
        set.add(50);
        System.out.println(set);
        set.remove(20);
        System.out.println(set);
        Object[] arr = set.toArray();
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int ele : arr){
            if(map.containsKey(ele)){
                int frq= map.get(ele);
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
}
