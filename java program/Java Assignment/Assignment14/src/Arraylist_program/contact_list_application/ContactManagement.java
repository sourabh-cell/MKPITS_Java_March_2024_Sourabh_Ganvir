package Arraylist_program.contact_list_application;

import Arraylist_program.movie_collection_manager.Movie;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactManagement {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Contact> list = new ArrayList<>();

    public void addContact() {
        System.out.println("Please Enter the Contact id");
        int Contact_id = scanner.nextInt();
        System.out.println("Please Enter the Contact Name");
        String Contact_name = scanner.next();
        System.out.println("Please Enter the Phone no.");
        String Phone_no = scanner.next();
        System.out.println("Please Enter the Email");
        String email = scanner.next();

        Contact contact = new Contact(Contact_id, Contact_name, Phone_no, email);
        list.add(contact);
        System.out.println("Contact added Successfull");
    }

    public void searchByContactName() {
        System.out.println("Please Enter the Contact Name");
        String name = scanner.next();

        for (Contact c : list)   //For Each Loop for displaying
        {
            if (c.getName().equalsIgnoreCase(name)) {
                System.out.println(c);
            }
        }
    }

    public void displayContact() {
        for (Contact c : list)   //For Each Loop for displaying details
        {
            System.out.println(c);
        }
    }

    public void updateContact() {
        System.out.println("Please Enter the Contact id");
        int Contact_id = scanner.nextInt();
        System.out.println("Please Enter the updated Phone no.");
        String phone_no = scanner.next();


        for (Contact c : list)   //For Each Loop for displaying
        {
            if (c.getContactID() == (Contact_id)) {
                c.setPhoneNumber(phone_no);
                System.out.println("do you want to change the email id(y/n)");
                String choice=scanner.next();
                if (choice.equalsIgnoreCase("y"))
                {
                    System.out.println("Please Enter the Updated Email");
                    String email = scanner.next();
                    c.setEmail(email);
                }

            }

        }
    }


}
