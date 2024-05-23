package Arraylist_program.library_book_management;

import Arraylist_program.student_management_system.StudentManagentSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BookManagement bm = new BookManagement();

        while (true) {
            System.out.println("Please Enter Your Choice \n1.Add\n2.Display\n3.Update Quantity\n4.Sort And Display ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    bm.addBook();
                    break;

                case 2:
                    bm.displayBooks();
                    break;

                case 3:
                    bm.updateQuantity();
                    break;

                case 4:
                    bm.showBookAfterSpecificYear();
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
