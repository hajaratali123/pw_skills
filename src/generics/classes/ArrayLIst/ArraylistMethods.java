package generics.classes.ArrayLIst;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArraylistMethods {
    public static void main(String[] args) {
        ArrayList<Integer> ary1 = new ArrayList<>(20);
        ArrayList<Integer> ary2 = new ArrayList<>(List.of(91,92,93,94,95,96));

        ary1.add(10);
        ary1.add(0,01);
        ary1.addAll(0,ary2);
        ary1.add(6,94);

        System.out.println(ary1.contains(30));
        ary1.set(6,200);

        System.out.println(ary1.indexOf(94));
        System.out.println(ary1.lastIndexOf(94));
        System.out.println(ary1.get(2));

        System.out.println(ary1);
        System.out.println("normal method");
        for (int i = 0; i <ary1.size() ; i++) {
            System.out.println(ary1.get(i));

        }

        System.out.println("Iterator ");
        Iterator<Integer> it = ary1.iterator();
        ListIterator<Integer> lis = ary1.listIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("list Iterator ");
        while (lis.hasNext()){
            System.out.println(lis.next());
        }
        System.out.println("for each ");
        ary1.forEach(System.out::println);

        System.out.println("________for each");

        ary1.forEach(n->show(n));

    }
    static  void show(int n){
        if(n<=25){
            System.out.println(n);
        }
    }



}