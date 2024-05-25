package hashset_program.new_email_collect;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        UniqueEmailManagement uem=new UniqueEmailManagement();
        while (true){
            System.out.println("Please Enter Your Choice \n1.Add\n2.Display\n3.check Availability\n4.remove Email \n5.exit");
            int choice = scanner.nextInt();
            String mail;
            switch(choice)
            {
                case 1:
                    System.out.println("please enter email id");
                    mail=scanner.next();
                    uem.addEmail(mail);
                    break;

                case 2:
                    uem.displayEmail();
                    break;

                case 3:
                    System.out.println("please enter email id");
                    mail=scanner.next();
                    uem.chkAvailibityMail(mail);
                    break;

                case 4:
                    System.out.println("please enter email id");
                    mail=scanner.next();
                    uem.removeEmail(mail);
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
