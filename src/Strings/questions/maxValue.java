package Strings.questions;

public class maxValue {
    public static void main(String[] args) {
        String[] arr = {"0000001023","2347","2346","000000003435"};
        int mx=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int n = Integer.parseInt(arr[i]);
            mx=Math.max(mx,n);
        }

        System.out.println(mx);

        String maxS =arr[0];
        for (int i = 1; i <arr.length ; i++) {
            maxS = max(maxS,arr[i]);
        }
        System.out.println(maxS);

    }


    public static String max(String a, String b){
        String s=purify(a);
        String t=purify(b);

    if(s.length()>t.length()) return a;
    if(s.length()<t.length()) return b;
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)!=t.charAt(i)){
                if(s.charAt(i)>t.charAt(i)) return a;
                else return b;
            }
        }
    if(a.length()>=b.length()) return a;
    else return b;
    }
    public static String purify(String s){
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)!='0') return s.substring(i);

        }
        return s;

    }

}
