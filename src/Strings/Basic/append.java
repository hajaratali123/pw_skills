package Strings.Basic;

public class append {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(sb);
        sb.append("ali");
        System.out.println(sb);
        sb.append(30);
        System.out.println(sb);
        sb.append("*");
        System.out.println(sb);
        sb.append("xyz");
        System.out.println(sb);
        char[] ch = {'p','q','r'};
        sb.append(ch);
        System.out.println(sb);
        int[] arr = {1,2,3,4,5};
        sb.append(arr);
        System.out.println(sb);

    }

}
