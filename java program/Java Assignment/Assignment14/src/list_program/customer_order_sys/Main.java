package list_program.customer_order_sys;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CustomeOrderManagement com=new CustomeOrderManagement();
        Scanner scanner=new Scanner(System.in);

        while (true){
            System.out.println("Please Enter Your Choice \n1.Add\n2.Display\n3.Sort And Display By Date\n4.Update Quantity\n5.exit\n6.Remove Order");
            int choice = scanner.nextInt();
            switch(choice)
            {
                case 1:
                    com.addnewOrder();
                    break;

                case 2:
                    com.displayOrder();
                    break;

                case 3:
                    com.sortDate();
                    break;

                case 4:
                    com.updatequantity();
                    break;

                case 5:
                    System.exit(0);
                    break;

                case 6:
                    com.removeOrder();
                default:
                    System.out.println("Invalid choice");
                    break;

            }

        }
    }

}

