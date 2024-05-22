package final_in_inheritance;


public class Student extends Person{

    private String name="";
    private int age;

    public Student(String name, int age) {
        super(name, age);
    }

    public void displayInformation(int age,String name){
        this.name=name;
        this.age=age;


    }
}
