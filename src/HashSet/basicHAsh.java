package HashSet;

import java.util.HashSet;

public class basicHAsh {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(20);
        set.add(30);
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

 }