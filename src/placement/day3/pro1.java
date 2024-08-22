package placement.day3;

import java.util.Scanner;

public class pro1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        int c = 0;
        String[] spst = s.split(" ");
//        for (String sddd : spst)
//          System.out.println(sddd);

        for (int i = 0; i <spst.length ; i++) {
            c = 1;
            for (int j = i+1; j <spst.length ;j++) {

                if(spst[i].equals(spst[j])){
                    c++;
                     spst[j]="0";
                }
                }
            if(c>1 && spst[i]!="0" )System.out.println(spst[i]);


        }






        System.out.println(c);




    }
}
