package sorted_contact_list;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ContactList {
    String name;
    Long num;
    Scanner scanner=new Scanner(System.in);
    TreeMap<String,Long> contact=new TreeMap<>();

    public void addContact(String name,Long num)
    {
        contact.put(name, num);
        System.out.println("Contact added Successfully");
    }

    public void deleteContact(String name)
    {
        contact.remove(name);

    }
    public void displayContact()
    {
        for(Map.Entry c:contact.entrySet())
        {
            System.out.println(c);
        }
    }

    public void retrieveContact(String name)
    {
        if (contact.containsKey(name))
         System.out.println("Name :"+name+" Contact Number :-"+contact.get(name));

        else
            System.out.println("Contact name not found");
    }

    public void updateContact(String name,Long num)
    {
        contact.replace(name,num);
        System.out.println("Contact Updated succssfully");
    }

    public String inputName()
    {
        System.out.println("Please enter name");
        name= scanner.next();
        return name;
    }

    public Long inputNumber()
    {
        System.out.println("Please enter Number");
        num= scanner.nextLong();
        return num;
    }


}
