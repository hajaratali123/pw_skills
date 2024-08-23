package placement.day4;

public class program7 {
    public static void main(String[] args) {

        String a = new String("hello");
        String b = new String("world");
        System.out.println("Before swap :"+a+"  "+b);

        a = a+b;
        b = a.substring(0,a.length()-b.length());
        a = a.substring(b.length());
        System.out.println("After swaping :"+a+"  "+b);


//        String b = s1.substring(0,5);
//        System.out.println(b);

    }
}
