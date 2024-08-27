package placement.day5;

import java.util.Scanner;

//pangram checking
public class program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
       if(isPangram(s)) System.out.println("panagram");
       else System.out.println("not a panagram");
    }
    public  static boolean isPangram(String sb){
        int n =sb.length();
        sb=sb.toLowerCase();
       for (int i = 0; i < n; i++) {
            char ch = sb.charAt(i);
            int ascii = (int)ch;
           if (ascii>= 97 && ascii<= 122){//Small latter
                return true;
            }
        }
        return false;
    }
}



