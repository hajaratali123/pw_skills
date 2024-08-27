package placement.day6;

import java.util.HashMap;
import java.util.Map;

public class program3 {
   public static  int Iso(String str1, String str2){
       if (str1.length() != str2.length()){
           return  0;
       }
       Map<Character,Character> map = new HashMap<>();
       for (int i = 0; i <str1.length() ; i++) {
           char c1 = str1.charAt(i);
           char c2 = str2.charAt(i);

           if(map.containsKey(c1)){
               if(map.get(c1)!=c2){
                   return 0;
               }
           }
           else {
               if(map.containsValue(c2)) return 0;
               map.put(c1,c2);
           }

       }

       return 1;
   }

    public static void main(String[] args) {

        String s = "xyzxyz";
        String t = "abcabf";
        int flag = Iso(s,t);
        if (flag!=0){
            System.out.println("isomorphic");
        }
        else {
            System.out.println("not an isomorphic");
        }

    }
}
