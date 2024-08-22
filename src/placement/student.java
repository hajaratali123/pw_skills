package placement;

public class student {
    static String name;
    static int age;
    static long studenId;

    student(String name ,int age,long Id){
        this.name =name;
        this.age=age;
        this.studenId=Id;
    }
    public static  void display(){
        System.out.println("name :"+name+"age :"+age+" id :"+studenId);
    }



    public static void main(String[] args) {
        student sc = new student("khan ",20,2243);
        display();
    }

}

