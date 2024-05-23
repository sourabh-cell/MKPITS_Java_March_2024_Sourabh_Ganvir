package list_program.customer_order_sys;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class CustomeOrderManagement {
    Scanner scanner=new Scanner(System.in);
    LinkedList<CustomerOrder> list=new LinkedList<>();
    //adding new order
    public void addnewOrder()
    {
        System.out.println("please enter order Id");
        int id= scanner.nextInt();
        System.out.println("please enter order Name");
        String name= scanner.next();
        System.out.println("please enter order Product");
        String Product= scanner.next();
        System.out.println("please enter order Quantity");
        int quantity = scanner.nextInt();
        System.out.println("please enter order Date(DD/MM/YY)");
        String date= scanner.next();
        CustomerOrder customerOrder=new CustomerOrder(id,name,Product,quantity,date);//creating object
        list.add(customerOrder);//adding object in the list
        System.out.println("Order Placed Successfully");
    }

    //method for updating Quantity of Order
    public void updatequantity()
    {
        System.out.println("please enter order Id");
        int id= scanner.nextInt();
        System.out.println("please enter updated quantity Quantity");
        int quantity = scanner.nextInt();
        for (CustomerOrder c:list)
        {
            if (c.getOrder_id()==id)
            {
                c.setQuantity(quantity);
            }
        }
        System.out.println("Quantity Updated");
    }

    //Method For Removing Order
    public void removeOrder()
    {
        System.out.println("please enter order Id");
        int id= scanner.nextInt();
        for (CustomerOrder c:list)
        {
            if (c.getOrder_id()==id)
            {
                list.remove(c);
            }
        }
        System.out.println("Order removed Successfully");

    }

    //Method for displaying order
    public void displayOrder()
    {
        for (CustomerOrder c:list)
        {
            System.out.println(c);
        }
    }

    //method for sorting order according to date
    public void sortDate()
    {
        Collections.sort(list);
        displayOrder();
    }
}
