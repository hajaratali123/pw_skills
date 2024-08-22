//package placement.day3;
//
//abstract class shape{ shape(){}
//
//    long widh;
//    long hight;
//    int  r;
//    shape(int widh,int hight,int r){
//        this.widh=widh;
//        this.hight=hight;
//        this.r=r;
//    }
//    public  void area(){
//        System.out.println("method Area");
//
//    }
//
//    public abstract void area(long width, long height);
//}
//
//class Rectangle extends shape{
//    public void area(long width,long height){
//        long area = (long) (0.5*(width*height));
//        System.out.println(area);
//
//    }
//
//}
//class  Circle extends  shape{
//    public void area(int r ){
//        double are = r*r*Math.PI;
//        System.out.println(are);
//    }
//}
//public class program8 {
//    public static void main(String[] args) {
//        Rectangle resarea = new Rectangle();
//        resarea.area(233,34);
//
//        Circle cr = new Circle();
//        cr.area(45);
//    }
//
//}
