package menudrivendatabaseoperation;

import menudrivendatabaseoperation.pojoclassstudent.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int choice;
        String roll,name,city,address;
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("Enter your Choice\n 1.Enter record.\n2.delete record.\n3.update record\n4.diplay\n5.EXIT ");
            choice= scanner.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter the roll no of student");
                    roll= scanner.next();
                    System.out.println("Enter the Name of student");
                    name= scanner.next();
                    System.out.println("Enter the city of student");
                    city= scanner.next();
                    System.out.println("Enter the Address of student");
                    address= scanner.next();

                    Student s= new Student(roll,name,city,address);

                    DbOperation.insertStundentrecord(s);

                    break;
                case 2:

                    System.out.println("Enter the roll no of student");
                    roll= scanner.next();

                    DbOperation.DeleteStundentrecord(roll);
                    break;

                case 3:

                    System.out.println("Enter the roll no of student");
                    roll= scanner.next();
                    System.out.println("Enter the Name of student");
                    name= scanner.next();
                    System.out.println("Enter the city of student");
                    city= scanner.next();
                    System.out.println("Enter the Address of student");
                    address= scanner.next();

                    Student s1= new Student(roll,name,city,address);

                    DbOperation.updateStundentrecord(s1);
                    break;

                case 4:
                    System.out.println("Enter the roll no of student");
                    roll= scanner.next();
                    DbOperation.displayStudentbyRoll(roll);

                case 5:
                    System.exit(0);
                    break;
            }
        }

    }
}
