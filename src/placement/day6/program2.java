package placement.day6;

import java.util.HashMap;
import java.util.Map;

public class program2 {
    public static void main(String[] args) {
        String s = "aab";
        String t = "xyz";
        if(s.length()==t.length()){
            if(isIsomorphic(s,t)) System.out.println(" Isomorphic");
            else System.out.println("not an Isomorphic");
        }
    }

//    private static boolean iSIsomorphic(String s, String t) {
//        HashMap<int,String> map = new HashMap<int,String>();
//
//
//        return false;
//    }
    public static boolean isIsomorphic (String s1 , String s2){

        if (s1 == null || s2 == null){
            throw new IllegalArgumentException();
        }

        if (s1.length() != s2.length()){
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0 ; i < s1.length(); i++){
            if (!map.containsKey(s1.charAt(i))){
                if(map.containsValue(s2.charAt(i))){
                    return false;
                }
                else{
                    map.put(s1.charAt(i), s2.charAt(i));
                }
            }
            else{
                if( map.get(s1.charAt(i)) != s2.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }
}
