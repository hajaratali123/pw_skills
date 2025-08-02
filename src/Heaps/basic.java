package Heaps;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class basic {

    public static void main(String[] args) {
        PriorityQueue<Integer> qu = new PriorityQueue<>();

//        qu.add(10);
//        System.out.println(qu);
//        qu.add(2);
//        System.out.println(qu);
//
//        qu.add(5);
//        System.out.println(qu);
//
//        qu.add(20);
//        System.out.println(qu);
//
//        qu.remove(10);
//        System.out.println(qu);

        int arr[]={1,-2,3,4,5,6,-8};

        PriorityQueue<Integer> maxh = new PriorityQueue<>(Collections.reverseOrder());
        for (int ele : arr){
            maxh.add(ele);
        }
        System.out.println(maxh);
        for (int ele : arr){
            qu.add(ele);
        }
        System.out.println(qu);


    }
}
