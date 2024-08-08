package Arrays.ArrayList;

import java.util.ArrayList;

public class BasicOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(0,20);
        al.add(1,39);
        al.add(2,89);
        al.add(3,67);
        al.add(4,56);
        System.out.println(al.get(4));
        System.out.println(al);
        for (int x : al){
            System.out.print(x+" ");

        }
        System.out.println();
        al.set(0,100);
        System.out.println(al.get(0));

    }
}
