package list_program.event_scheduling_sys;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        EventScheduling es=new EventScheduling();
        while (true){
            System.out.println("Please Enter Your Choice \n1.Add\n2.Display\n3.Search by location\n4.exit");
            int choice = scanner.nextInt();
            switch(choice)
            {
                case 1:
                    es.addnewEvent();
                    break;

                case 2:
                    es.displayAllEvent();
                    break;

                case 3:
                    es.searchEventByLocation();
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;


            }

        }
    }
}
