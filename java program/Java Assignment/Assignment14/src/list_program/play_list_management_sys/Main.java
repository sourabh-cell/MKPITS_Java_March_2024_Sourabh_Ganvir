package list_program.play_list_management_sys;

import list_program.customer_order_sys.CustomeOrderManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PlaylistManagement plm=new PlaylistManagement();
        Scanner scanner=new Scanner(System.in);

        while (true){
            System.out.println("Please Enter Your Choice \n1.Add\n2.Display\n3.Sort And Display By duration\n4.Search by Title\n5.exit");
            int choice = scanner.nextInt();
            switch(choice)
            {
                case 1:
                    plm.addnewSong();
                    break;

                case 2:
                    plm.displayAllSong();
                    break;

                case 3:
                    plm.sortByDuration();
                    break;

                case 4:
                    plm.searchSongbyTitle();
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
