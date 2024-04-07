package ArrayList;

import java.util.ArrayList;

public class BasicOfArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> lis = new ArrayList<Integer>();
        // adding new elements
        System.out.println(lis+" "+lis.size());
        lis.add(10);
        System.out.println(lis+" "+lis.size());
        lis.add(30);
        System.out.println(lis+" "+lis.size());
        lis.add(89);
        System.out.println(lis+" "+lis.size());
        // removing elements
        lis.remove(1);
        System.out.println(lis+" "+lis.size());
    }
}
