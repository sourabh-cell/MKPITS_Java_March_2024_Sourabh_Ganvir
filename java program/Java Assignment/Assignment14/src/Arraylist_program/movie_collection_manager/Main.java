package Arraylist_program.movie_collection_manager;

import Arraylist_program.library_book_management.BookManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        MovieManager mm = new MovieManager();

        while (true) {
            System.out.println("Please Enter Your Choice \n1.Add\n2.Display\n3.Search by Genre\n4.Exit1 ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    mm.addMovie();
                    break;

                case 2:
                    mm.displayMovie();
                    break;

                case 3:
                    mm.searchByGenre();
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
