package placement.day8;


 public class day8 {
     public static int petrol(int[] d, int[] p) {
         int pleft = 0;
         System.out.println("before loop 1");
         for (int i = 0; i < d.length; i++) {
             System.out.println("inside loop one " + i);
             if (d[i] < p[i]) {
                 pleft = p[i];
                 System.out.println("inside firsr IF pleft " + pleft);
                 for (int j = i; j < d.length - 1 + i;)
                     if (d[j] <= pleft) {
                         System.out.println("inside second IF pleft " + pleft);
                         pleft = p[j] - d[j];
                         pleft += p[++j];
                         System.out.println("inside second IF pleft2 " + pleft);
                         System.out.println("Inside the second loop j " + j);
                         if (j == d.length - 1)
                             j = 0;
                         if (i == j)
                             return i;

                     } else
                         break;

             }

         }
         // return p.length - 1;
         return 10000;

     }

     public static void main(String[] args) {

         // int[] p = { 4, 6, 7, 4 }; // test case 1
         // int[] d = { 6, 5, 3, 5 };
         // int[] p = { 6, 3, 7 }; // test case 2
         // int[] d = { 4, 6, 3 };
         int[] p = { 2, 1, 6, 2 }; // test case 3
         int[] d = { 3, 3, 4, 2 };
         int res = petrol(d, p);
         System.out.println("The Starting point is " + res);
     }
}