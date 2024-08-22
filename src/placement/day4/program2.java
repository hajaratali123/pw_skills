package placement.day4;


class person{
    private String name;
    private int age;
    person(String name,int age){
        this.name=name;
        this.age=age;

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;

    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age) {
        if (age<0){
            System.out.println("Age cannot be -ve");this.age=0; }
        else
        this.age = age;
    }
}
public class program2 {
    public static void main(String[] args) {

        person pr = new person("khan",14);
        System.out.println(pr.getAge());
        System.out.println(pr.getName());
        pr.setAge(-1);
        System.out.println(pr.getAge());


    }
}
