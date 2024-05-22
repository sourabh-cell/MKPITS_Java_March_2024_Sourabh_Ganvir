package final_in_inheritance;

public class Person {
    private String name="";
    private int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;

    }

    public final void displayInformation(){
        System.out.println(name+" "+age);


    }
}
