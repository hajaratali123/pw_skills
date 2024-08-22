package placement.day3;

class  animal {
    public  void sound(){
        System.out.println("Animal sounds\n");
    }

}
class  dog extends animal {
    public  void bark(){
        System.out.println("dog sounds\n");
    }}

class puppy extends dog{
    public void pbark(){
        System.out.println("Puppy sounds");
    }
}
public class program4 {
    public static void main(String[] args) {

//        String arr ="1A0R1X1";
//        animal d = new dog();
//        animal a = new animal();
//        a.sound();
//
//        dog d =new dog();
//        d.sound();
//        d.bark();

puppy p = new puppy();
p.sound();
p.bark();
p.pbark();
    }
}
