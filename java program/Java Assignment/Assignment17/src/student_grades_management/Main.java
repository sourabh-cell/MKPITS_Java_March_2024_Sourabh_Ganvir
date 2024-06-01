package student_grades_management;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Student student=new Student();
        int choice;
        while (true){
            System.out.println("Please enter your Choice.\n 1.Add Student\n 2.Delete Student\n 3.Update grades\n4.Display Student list\n 5.Retrieve grade of Student\n 6.Exit");
            choice= scanner.nextInt();
            switch (choice)
            {
                case 1:

                    System.out.println("Please enter the name of student");
                    String name=scanner.next();
                    System.out.println("Please enter the Grade of student");
                    int grade= scanner.nextInt();
                    student.addStudent(name,grade);
                    break;

                case 2:
                    System.out.println("Please enter the name of student");
                    name=scanner.next();
                    student.deleteStudent(name);

                    break;

                case 3:
                    System.out.println("Please enter the name of student");
                     name=scanner.next();
                    System.out.println("Please enter the Grade yo want to update of student");
                     grade= scanner.nextInt();
                     student.updateStudent(name,grade);
                    break;

                case 4:
                    student.displayStudent();
                    break;

                case 5:
                    System.out.println("Please enter the name of student");
                    name=scanner.next();
                    student.reteiveStudentGrade(name);
                    break;

                case 6:
                    System.exit(0);
                    break;
            }
        }
    }
}
