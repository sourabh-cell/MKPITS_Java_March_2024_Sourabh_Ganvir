package list_program.history_tracking_sys;

import list_program.event_scheduling_sys.EventScheduling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        PageTrackingManagement ptm=new PageTrackingManagement();
        while (true){
            System.out.println("Please Enter Your Choice \n1.Display\n2.Search by url\n3.Pages visited on specific date\n4.exit");
            int choice = scanner.nextInt();
            switch(choice)
            {
                case 1:
                   ptm.displayAllPage();
                    break;

                case 2:
                    ptm.searchPageByUrl();
                    break;

                case 3:
                    ptm.PageVisitedOnSpecificDate();
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
