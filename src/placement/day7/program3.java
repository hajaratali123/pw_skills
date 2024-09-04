package placement.day7;

import java.util.ArrayList;

class stack{
    private ArrayList<Integer> stack;
    private ArrayList<Integer> stack2;

    @Override
    public String toString() {
        return super.toString();
    }

    public stack(){
        stack=new ArrayList<>();
        stack2 = new ArrayList<>(10);

    }

    public void push(int a){
        stack.add(a);
    }
    public void push2(int a){
        stack2.add(a);
    }


    public  int pop(){
        if(stack.isEmpty()){
            return -1;
        }
        else {
            return stack.remove(stack.size()-1);
        }
    }

    public  int pop2(int i){
        if(stack.isEmpty()){
            return -1;
        }
        else {
            return stack.remove(stack.size()-1);
        }
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }


    public void deleteElemet(){
        int mid = (stack.size())/2;
        System.out.println("poped element "+stack.remove(mid));
    }
    public void print(){
        for (int i = 0; i <stack.size() ; i++) {
            System.out.print(stack.get(i)+" ");
        }
        System.out.println();
    }

    public void print2(){
        for (int i = 0; i <stack2.size() ; i++) {
            System.out.print(stack2.get(i)+" ");
        }
        System.out.println();
    }
}
public class program3 {
    public static void main(String[] args) {
        stack st = new stack();
        st.push(10);
        st.push(40);
        System.out.println("S1");
        st.print();
        st.push2(2);
        st.push2(20);
        System.out.println("s2");
        st.print2();
    }
}
