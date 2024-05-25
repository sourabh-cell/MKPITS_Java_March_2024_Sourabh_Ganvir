package hashset_program.duplicate_word_filter;

import list_program.customer_order_sys.CustomeOrderManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WordFilter wf=new WordFilter();
        Scanner scanner=new Scanner(System.in);

        while (true){
            System.out.println("Please Enter Your Choice \n1.Add\n2.Display\n3. check Availability\n5.remove word \n4.exit");
            int choice = scanner.nextInt();
            switch(choice)
            {
                case 1:
                    wf.addWord();
                    break;

                case 2:
                    wf.displayWord();
                    break;

                case 3:
                    wf.containWord();
                    break;

                case 5:
                    System.exit(0);
                    break;

                case 4:
                    wf.removeWord();
                default:
                    System.out.println("Invalid choice");
                    break;

            }

        }
    }

}
