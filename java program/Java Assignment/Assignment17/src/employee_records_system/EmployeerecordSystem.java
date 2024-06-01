package employee_records_system;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeerecordSystem {
    private String name,add; //for taking input from user
    private int age,id;

    Scanner scanner=new Scanner(System.in);

    HashMap<Integer,Employee> employee=new HashMap<>();

    public void addEmployee(int id,String name,String add,int age)
    {
     Employee emp =new Employee(name,age,add);
     employee.put(id,emp);
     System.out.println("Record of employee stored sucessfully");
    }

    public void deleteEmployee(int id)
    {
        employee.remove(id);

    }
    public void displayEmployee()
    {
        for(Map.Entry e:employee.entrySet())
        {
            System.out.println(e);
        }
    }

    public void retrieveEmployee(int id)
    {
        if (employee.containsKey(id))
            System.out.println(employee.get(id));
        else
            System.out.println("Employee name not found");
    }

    public void updateEmployeeInfo(int id,Employee emp)
    {
        employee.replace(id,emp);
        System.out.println("Record Updated successfully");
    }

    public String inputName()
    {
        System.out.println("please enter the Name of employee");
        name=scanner.next();
        return name;
    }

    public int inputAge()
    {
        System.out.println("please enter the Age of employee");
        age=scanner.nextInt();
        return age;
    }
    public int inputId()
    {
        System.out.println("please enter the Id of employee");
        id=scanner.nextInt();
        return id;
    }

    public String inputAddress()
    {
        System.out.println("please enter the Address of employee");
        add=scanner.next();
        return add;
    }
}
