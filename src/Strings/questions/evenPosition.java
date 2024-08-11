package Strings.questions;
// input a string and update all the eben
// positions in the string to character 'a'
// ,consider 0-based indexing
public class evenPosition {
    public static void main(String[] args) {
        String s = "hajarat ali";

        String str = " ";
        for (int i = 0; i <s.length() ; i++) {
            if(i%2==0){
                str+='a';
            }
            else {
                str+=s.charAt(i);
            }

        }
        System.out.println(str);


    }
}
