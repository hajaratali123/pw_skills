package stack;

import java.util.Stack;

import static java.lang.System.out;

public class basic {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
      //  out.println(st.isEmpty());
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);
        st.push(80);
        out.println(st);
     //   out.println(st.peek());
     //   out.println(st.pop());
    //    out.println(st);
    //    out.println(st.size());
    //    out.println(st.isEmpty());

    //    while (st.size()>1){
    //        st.pop();
     //   }
     //   out.println(st.peek());
//out.println(st.size());

        Stack<Integer> st2 = new Stack<>();
        while (!st.isEmpty()){
            //st2.push(st.pop());
           int ele = st.pop();
           st2.push(ele);
        }
        out.println(st2);
    }
}
