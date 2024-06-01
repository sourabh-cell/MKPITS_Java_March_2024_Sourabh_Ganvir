package inventory_management_system;

import employee_records_system.Employee;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class InventoryManagement {

    private  String name;
    private int quantity;

    Scanner scanner=new Scanner(System.in);

    LinkedHashMap<String,Integer> inventory=new LinkedHashMap<>();

    public void addItem(String name,int quantity)
    {
        inventory.put(name,quantity);
        System.out.println("Record of item stored sucessfully");
    }

    public void deleteItem(String name)
    {
        inventory.remove(name);

    }
    public void displayItem()
    {
        for(Map.Entry i:inventory.entrySet())
        {
            System.out.println(i);
        }
    }

    public void retrieveItem(String name)
    {
        if (inventory.containsKey(name))
            System.out.println(inventory.get(name));
        else
            System.out.println("Item not found");
    }

    public void updateItem(String name,int quantity)
    {
        inventory.replace(name,quantity);
        System.out.println("Item Updated successfully");
    }

    public String inputName()
    {
        System.out.println("please enter the Item name");
        name=scanner.next();
        return name;
    }

    public int inputQuantity()
    {
        System.out.println("please enter the Quantity of Item");
        quantity=scanner.nextInt();
        return quantity;
    }
}
