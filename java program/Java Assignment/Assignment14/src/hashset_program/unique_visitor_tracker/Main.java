package hashset_program.unique_visitor_tracker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IpManager ipm = new IpManager();
        Scanner scanner=new Scanner(System.in);

        while (true){
            System.out.println("Please Enter Your Choice \n1.Add\n2.Display\n3.Check Visited ip\n4.remove ip \n5.exit");
            int choice = scanner.nextInt();

            switch(choice)
            {
                case 1:
                    ipm.addIp();
                    System.out.println("add");
                    break;

                case 2:
                    ipm.displayIp();
                    break;

                case 3:
                    ipm.visitedIp();
                    break;

                case 4:
                    ipm.removeIp();

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
