package TwoDArrayList;

import java.util.ArrayList;
import java.util.List;

public class Basic {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(15);
        lista.add(10);

//        for (int i = 0; i < lista.size() ; i++) {
//            System.out.println(lista.get(i)+" ");
//        }

        List<Integer> listb = new ArrayList<>();
        listb.add(20);
        listb.add(26);

        List<Integer> listc = new ArrayList<>();


        List<Integer> listd = new ArrayList<>();
        listd.add(12);
        listd.add(45);
        listd.add(70);

        List<List<Integer>> list2D = new ArrayList<>();
        list2D.add(lista);
        list2D.add(listb);
        list2D.add(listc);
        list2D.add(listd);

        for (int i = 0; i < list2D.size() ; i++) {
            System.out.println(list2D.get(i));
            List<Integer> x = list2D.get(i);
            for (int j = 0; j <x.size(); j++) {
                System.out.println(x.get(j));
            }
        }
    }
}
