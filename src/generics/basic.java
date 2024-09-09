package generics;

import java.util.Arrays;

interface a{}
class B implements a{}
class c implements a{}
class Data<T>{
    private T obj;

    public void  setData(T V){
        obj=V;
    }

    public  T getData(){
        return obj;
    }
}
class MyArray<T>{

    T A[] = (T[]) new Object[10];

    int length = 0;

    public  void append(T v){
        A[length++]=v;
    }

    public void  diplay(){
        for (int i = 0; i < length; i++) {
            System.out.println(A[i]);

        }
    }




}
public class basic<T> {


    static<E> void show(E... list){
        for (E x : list ){
            System.out.println(x);
        }
    }

//    static<E> void show(E[] list){
//        for (E x : list ){
//            System.out.println(x);
//        }
//    }
    static void fun(MyArray<?> obj){
        obj.diplay();}


    T data[] =(T[]) new Object[3];
    public static void main(String[] args) {
//        basic<String> gd = new basic<>();
//        gd.data[1]="hi";
//        gd.data[2]="hello";
//        //gd.data[2]= new Integer(10);
//        String str = gd.data[0];

      //  Data<Integer> d = new Data<>();
    //    d.setData(20);
   //     System.out.println(d.getData());
      //  MyArray<Integer> ma = new MyArray<>();
     //   ma.append(10);
    //    ma.append(30);
     //   ma.append(40);
   //     ma.diplay();
      //  show(new String[]{"hi","hello","go","bye"});
        //show(new Integer[]{10,2,3,3,5});

        //  show("hi","hello","go","bye");
   //     show(10,2,3,3);

        MyArray<String> ma1 = new MyArray<>();
        ma1.append("hi");
        ma1.append("hello");

        MyArray<Integer> ma2 = new MyArray<>();
        ma2.append(10);
        ma2.append(70);

        fun(ma1);
        fun(ma2);




    }
}
