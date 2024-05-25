package hashset_program.Unique_Course_Enrollment;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        CourseCodeManager ccm=new CourseCodeManager();
        Scanner scanner=new Scanner(System.in);
        int code;

        while (true){

            System.out.println("Please Enter Your Choice \n1.Add\n2.Display\n3.check Availability\n4.remove \n5.exit");
            int choice;
            choice = scanner.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Please Enter Course Code");
                    code = scanner.nextInt();
                    ccm.addcodes(code);
                    break;

                case 2:
                    ccm.displayCode();
                    break;

                case 3:
                    System.out.println("Please Enter Course Code to check Existence");
                    code = scanner.nextInt();
                    ccm.chkCodeExistence(code);
                    break;

                case 4:
                    System.out.println("Please Enter Course Code to check Existence");
                    code = scanner.nextInt();
                    ccm.removeCode(code);
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
