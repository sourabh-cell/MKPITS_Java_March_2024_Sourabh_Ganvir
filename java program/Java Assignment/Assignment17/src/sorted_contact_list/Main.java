package sorted_contact_list;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ContactList c=new ContactList();

        while (true) {
            System.out.println("please enter choice\n1.Add Contact\n2.display Contact\n3.Access Contact\n4.Update Contact\n5.Delete Contact\n6.Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    c.addContact(c.inputName(),c.inputNumber());
                    break;

                case 2:
                    c.displayContact();
                    break;

                case 3:
                   c.retrieveContact(c.inputName());
                    break;

                case 4:
                    c.updateContact(c.inputName(),c.inputNumber());
                    break;

                case 5:
                    c.deleteContact(c.inputName());
                    break;

                case 6:
                    System.exit(0);
                    break;
            }


        }
    }
}
