package Arraylist_program.inventorymangement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class InventoryMangement{
    private int product_id;
    private int price;
    private int quantity;

    ArrayList<InventoryMangement> inventory_info = new ArrayList<>();
    Scanner scanner=new Scanner(System.in);

    public InventoryMangement() {
    }

    public InventoryMangement(int product_id, int price, int quantity) {
        this.product_id = product_id;
        this.price = price;
        this.quantity = quantity;
    }



    public int getProduct_id() {
        return product_id;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void addNewproduct()
    {
        System.out.println("Please Enter the Product id Of Student");
        int product_id =scanner.nextInt();
        System.out.println("Please Enter the price Of Student");
        int price=scanner.nextInt();
        System.out.println("Please Enter the Quantity Of Student");
        int quantity= scanner.nextInt();
        InventoryMangement inventory=new InventoryMangement(product_id,price,quantity);
        inventory_info.add(inventory);
    }

    public void updateQuantity(){
        System.out.println("Enter The product Id to Update quantity");
        int product_id= scanner.nextInt();
        System.out.println("Enter the quantity to update");
        int quantity = scanner.nextInt();
        for (InventoryMangement i:inventory_info)
        {
            if (i.getProduct_id() ==product_id ) {

                i.setQuantity(quantity);
            }
        }
    }

    public void sortProduct()
    {
        Collections.sort(inventory_info, new Comparator<InventoryMangement>() {
            @Override
            public int compare(InventoryMangement o1, InventoryMangement o2) {
                return Integer.compare(o1.getPrice(), o2.getPrice());
            }
        });

    }

    public void displayProduct()
    {
        for (InventoryMangement i:inventory_info)
        {
             {

                 System.out.println("Product Id :-"+i.getProduct_id()+"   Product Price :-"+i.getPrice()+"   Product Quantity :-"+i.getQuantity());
            }
        }
    }

    public void removeProduct(){
        System.out.println("Enter The product Id to Update quantity");
        int product_id= scanner.nextInt();
        for (InventoryMangement i:inventory_info)
        {
            if (i.getProduct_id() ==product_id ) {

                inventory_info.remove(i);
                break;
            }
            if(inventory_info.getLast().getProduct_id()!=product_id)
            {
                System.out.println("Product Not Found");
            }
        }
    }


}
