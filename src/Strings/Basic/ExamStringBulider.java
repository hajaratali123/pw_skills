package Strings.Basic;

public class ExamStringBulider {
    public static void main(String[] args) {

        String s = new String("hajaratlai");
        StringBuilder sb1 = new StringBuilder();  // Use built-in StringBuilder
        StringBuilder sb2 = new StringBuilder("abcd");

        System.out.println(s);
        System.out.println();
        System.out.println(" " + sb1.toString());  // Explicitly call toString()
        System.out.println(sb2.toString());        // Explicitly call toString()

        StringBuilder x = new StringBuilder(10);
        System.out.println(x.length());

    }
}
