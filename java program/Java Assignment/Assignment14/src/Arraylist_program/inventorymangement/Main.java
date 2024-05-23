package Arraylist_program.inventorymangement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InventoryMangement inventoryMangement=new InventoryMangement();
        Scanner scanner=new Scanner(System.in);

        while (true){
            System.out.println("Please Enter Your Choice \n1.Add\n2.Display\n3.Sort And Display\n4.Update Quantity\n5.exit\n6.Remove Product");
            int choice = scanner.nextInt();
            switch(choice)
            {
                case 1:
                    inventoryMangement.addNewproduct();
                    break;

                case 2:
                    inventoryMangement.displayProduct();
                    break;

                case 3:
                    inventoryMangement.sortProduct();
                    break;

                case 4:
                    inventoryMangement.updateQuantity();
                    break;

                case 5:
                    System.exit(0);
                    break;

                case 6:
                    inventoryMangement.removeProduct();
                default:
                    System.out.println("Invalid choice");
                    break;

            }

        }
    }
}
