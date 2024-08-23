package placement.day4;


abstract class shape{
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

}

class rectangel extends shape{

    double l,b;
    rectangel(double l,double b){
        this.l=l;
        this.b=b;
    }

    @Override
    public double calculateArea() {
        return (l*b);
    }

    @Override
    public double calculatePerimeter() {
        return (2*(l+b));
    }
}
public class program3 {
    public static void main(String[] args) {

        rectangel rec = new rectangel(2,4);
        rec.l = 8;
        rec.b = 4;
        System.out.println( rec.calculateArea());
        System.out.println(rec.calculatePerimeter());

    }
}
