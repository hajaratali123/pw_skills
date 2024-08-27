package placement.day6;


import java.util.ArrayList;

class stack{
    private ArrayList<Integer> stack;

    @Override
    public String toString() {
        return super.toString();
    }

    public stack(){
        stack=new ArrayList<>();

    }


    public void push(int a){
        stack.add(a);
    }

    public  int pop(){
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

//    public void deleteElemet(){
//        int mid = (stack.size()+1)/2,a;
//        for (int i =mid; i<= stack.size(); i++) {
//            a = stack.get(i);
//            stack.add(i + 1, a);
//        }
//
//    }

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
}
public class program4 {
    public static void main(String[] args){
        stack st = new stack();
        st.push(2);
        st.push(3);
      //  System.out.println(st.pop());
        st.push(20);
        st.push(30);
        st.push(58);
//        while (!st.isEmpty()){
//            System.out.println(st.pop());
//        }
      //  System.out.println(st.pop());
        st.push(4);
        st.push(5);


      //  System.out.println("p1");
        st.print();
        st.deleteElemet();
      //  System.out.println("p2");
        st.print();
      //  System.out.println(st.pop());
       // System.out.println(st.toString());

     //   System.out.println(st.deleteElemet());

       // System.out.println(st.toString());

    }



}
