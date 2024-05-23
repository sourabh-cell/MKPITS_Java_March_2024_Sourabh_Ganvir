package Arraylist_program.student_management_system;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentManagentSystem {
    private  int id;
    private String name;
    private int marks;

    Scanner scanner=new Scanner(System.in);
    ArrayList<StudentManagentSystem> student_info=new ArrayList<>();

    public StudentManagentSystem() {

    }

    public StudentManagentSystem(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public  void addStudent(){


        System.out.println("Please Enter the Id Of Student");
        int id =scanner.nextInt();
        System.out.println("Please Enter the Name Of Student");
        String name=scanner.next();
        System.out.println("Please Enter the Marks Of Student");
        int marks= scanner.nextInt();
        StudentManagentSystem student = new StudentManagentSystem(id,name,marks);
        student_info.add(student);
    }

    public  void displayDetails(){
        for (StudentManagentSystem s:student_info)   //For Each Loop for displaying details
        {
            System.out.println("Id :-" + s.getId() + "     Name :-" + s.getName() + "     Marks :-" + s.getMarks());
        }

        }

    public void searchDisplayRecord()
    {
        System.out.println("Please Enter the Id");
        int id= scanner.nextInt();

        for (StudentManagentSystem s:student_info)   //For Each Loop for displaying details
        {
            if(s.getId()==id)
             System.out.println("Id :-" + s.getId() + "     Name :-" + s.getName() + "     Marks :-" + s.getMarks());
        }
    }

    public void sortDisplayAllRecord()
    {

        Collections.sort(student_info, new Comparator<StudentManagentSystem>() {
            @Override
            public int compare(StudentManagentSystem s1, StudentManagentSystem s2) {
                return Integer.compare(s1.getMarks(), s2.getMarks());
            }
        });

        displayDetails();
    }



}
