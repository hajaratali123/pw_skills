package Strings.Basic;

public class immutability {
    public static void main(String[] args) {
        String s ="hello";
        s = s.substring(0,2)+"y"+s.substring(3);
        System.out.print(s);
        // input and update positions in a string
    }
}
