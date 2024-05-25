package hashset_program.Unique_Course_Enrollment;

import java.util.HashSet;
import java.util.Scanner;

public class CourseCodeManager {
    HashSet<Course> hashSet = new HashSet<>();


    public void addcodes(int code) {
        Course c = new Course(code);
        hashSet.add(c);
        System.out.println("Course added Successfully");

    }

    public void displayCode() {
        for (Course c : hashSet) {
            System.out.println(c);
        }
    }

    public void removeCode(int code)
    {
        for (Course c : hashSet)
        {
            if (c.getCourse_code() == code)
            {
                hashSet.remove(c);
                System.out.println("Deleted");
            }
        }
    }


    public void chkCodeExistence(int code) {


        if (hashSet.contains(code))
            System.out.println("code Existed");
        else
            System.out.println("code Does not Existed");

    }

}