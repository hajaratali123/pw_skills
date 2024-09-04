package placement.day1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pro2 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        List<Integer> list1= Arrays.asList(1,3,4);
        List<Integer> list2= Arrays.asList(5,6,7,8);
        List<Integer> list3= Arrays.asList(10,3,4);
         list.addAll(list1);
        for (int ele : list){
         System.out.println(ele);
        }
        Arrays.sort(new ArrayList[]{list});
        System.out.println(list);


    }
}
