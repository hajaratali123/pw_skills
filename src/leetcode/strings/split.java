package leetcode.strings;

public class split {
    public static void main(String[] args) {
        String str = "20";
        String[] part = str.split("(?<=\\D)(?=\\d)");
        System.out.println(part[0]);
        System.out.println(part[1]);
    }
}
