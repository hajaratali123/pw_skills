package Heaps.questions;

import java.util.Comparator;
import java.util.PriorityQueue;

public class kthMinElement {
    public static void main(String[] args) {
        int[] arr ={10,2,8,3,4,5,-2,-6,9,-11};
        int k =4;
        //Using MinHeap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int ele : arr){
            pq.add(ele);
        }
        for (int i = 0; i <k-1 ; i++) {
            pq.remove();
        }
        System.out.println(pq.peek());

        System.out.println(usingMaxHEap(arr,k));
        System.out.println(usingMaxHEapKthLArhestElemet(arr,k));
        System.out.println(usingMaxHEapKthLArhestElemet2(arr,k));

    }

    public static int usingMaxHEap(int[] arr,int k){
        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        for (int ele : arr){
            q.add(ele);
            if (q.size()>k)
                q.remove();
        }
        return q.peek();
    }
    public static int usingMaxHEapKthLArhestElemet(int[] arr,int k){
        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        for (int ele : arr){
            q.add(ele);
        }
        for (int i = 0; i <k-1 ; i++) {
            q.remove();
        }
        return q.peek();
    }
    public static int usingMaxHEapKthLArhestElemet2(int[] arr,int k){
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int ele : arr){
            q.add(ele);
            if(q.size()>k)q.remove();
        }

        return q.peek();
    }


}
