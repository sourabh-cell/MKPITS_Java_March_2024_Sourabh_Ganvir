package Arraylist_program.student_management_system;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StudentManagentSystem student = new StudentManagentSystem();

        while (true){
            System.out.println("Please Enter Your Choice \n1.Add\n2.Display\n3.Search Specific record And Display\n4.Sort And Display ");
            int choice = scanner.nextInt();
            switch(choice)
            {
                case 1:
                    student.addStudent();
                    break;

                case 2:
                    student.displayDetails();
                    break;

                case 3:
                    student.searchDisplayRecord();
                    break;

                case 4:
                    student.sortDisplayAllRecord();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;

            }

        }
    }
}