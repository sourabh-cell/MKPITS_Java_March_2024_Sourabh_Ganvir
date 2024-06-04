//Create a list of objects (e.g., custom objects with attributes like name and age) and use a stream to find the oldest and youngest objects based on a certain attribute (e.g., age).
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        //adding object of Employee in Arraylist
        List<Employee> emp=new ArrayList<Employee>();
        emp.add(new Employee("Sourabh",45));
        emp.add(new Employee("Sagar",40));
        emp.add(new Employee("Akshay",65));
        emp.add(new Employee("Chetan",32));
        emp.add(new Employee("Nikhil",28));
        emp.add(new Employee("Roshan",49));


        //stream to find the youngest
        Optional<Employee> e_min=emp.stream().min(Comparator.comparingInt(Employee::getAge));
        System.out.println(e_min);

        //stream to find the oldest
        Optional<Employee> e_max=emp.stream().max(Comparator.comparing(Employee::getAge));
        System.out.println(e_max);

    }
}
