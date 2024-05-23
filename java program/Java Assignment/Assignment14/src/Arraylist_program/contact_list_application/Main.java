package Arraylist_program.contact_list_application;

import Arraylist_program.movie_collection_manager.MovieManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContactManagement cm = new ContactManagement();

        while (true) {
            System.out.println("Please Enter Your Choice \n1.Add\n2.Display\n3.Search by Contact name\n4.Contact Update\n5.Exit ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    cm.addContact();
                    break;

                case 2:
                    cm.displayContact();
                    break;

                case 3:
                    cm.searchByContactName();
                    break;

                case 4:
                    cm.updateContact();
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
