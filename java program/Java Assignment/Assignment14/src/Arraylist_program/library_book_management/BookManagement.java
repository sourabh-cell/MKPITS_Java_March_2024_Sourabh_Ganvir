package Arraylist_program.library_book_management;

import list_program.tak_management.Task;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManagement {

    Scanner scanner=new Scanner(System.in);
    ArrayList<Book> list=new ArrayList<>();

    public void addBook()
    {
        System.out.println("Please Enter the Book id");
        int book_id =scanner.nextInt();
        System.out.println("Please Enter the Book Name");
        String book_name=scanner.next();
        System.out.println("Please Enter the Quantity");
        int quantity= scanner.nextInt();
        System.out.println("Please Enter the Publishing Year(yyyy)");
        int year= scanner.nextInt();
        Book book=new Book(book_id,book_name,quantity,year);
        list.add(book);
        System.out.println("book added Successfull");
    }

    public void displayBooks()
    {
        for (Book b:list)
        {
            System.out.println(b);
        }
    }

    public void updateQuantity()
    {
        System.out.println("Please Enter the Book id");
        int book_id =scanner.nextInt();
        System.out.println("Please Enter the updated Quantity");
        int quantity= scanner.nextInt();
        for (Book b:list)
        {
            if (b.getBookID()==book_id) {
                b.setQuantity(quantity);
                System.out.println(b);
            }
        }
    }


    public void showBookAfterSpecificYear()
    {
        System.out.println("Please Enter the Publishing Year(yyyy)");
        int year= scanner.nextInt();
        for (Book b:list)
        {
            if (b.getYear()>year) {
                System.out.println(b);
            }
        }
    }
}
