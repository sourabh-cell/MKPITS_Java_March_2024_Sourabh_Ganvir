package student_grades_management;

import java.util.HashMap;
import java.util.Map;

public class Student {

    HashMap<String,Integer> hashMap=new HashMap<>();

    //Method for adding Student
    public void addStudent(String name,int grade)
    {
        hashMap.put(name,grade);
        System.out.println("Student Record added Successfully");

    }

    //Method for Udating student grade
    public void updateStudent(String name,int grades)
    {
        for(Map.Entry e:hashMap.entrySet())
        {
            if (e.getKey()==name)
            {
                hashMap.replace(name,grades);
                System.out.println("The grade of "+name+" Updated");
            }
        }

    }

    //Method for Getting student mark
    public void reteiveStudentGrade(String name)
    {
        for(Map.Entry e:hashMap.entrySet())
        {
            if (e.getKey()==name)
            {
                System.out.println("Name:-"+e.getKey()+" Grades :-"+e.getValue());
            }
        }

    }
    //Method for Deleting student Record

    public void deleteStudent(String name)
    {
        for(Map.Entry e:hashMap.entrySet())
        {
            if (e.getKey()==name)
            {
                hashMap.remove(e.getKey());
                System.out.println("Student record Deleted Successfully");
            }
        }

    }

    //Method for Displaying student details
    public void displayStudent()
    {
        for(Map.Entry e:hashMap.entrySet())
        {

                System.out.println("Student Name :-"+e.getKey()+" | Student Grade :-"+e.getValue());

        }

    }

}
