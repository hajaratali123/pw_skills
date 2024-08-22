package placement.day3;



public class program6 {

    public int add(int x,int y){
        return  (x+y);
    }

    public double add(double x, double y){
        return (x+y);
    }
    public static void main(String[] args) {
        program6 pr = new program6();
        System.out.println(pr.add(2,3));
        System.out.println(pr.add(4.5,4.5));
    }
}
