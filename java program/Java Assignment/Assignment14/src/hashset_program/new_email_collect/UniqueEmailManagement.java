package hashset_program.new_email_collect;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueEmailManagement {
    Scanner scanner = new Scanner(System.in);
    HashSet<UniqueEmail> hashSet = new HashSet();


    public void addEmail(String mail) {
        UniqueEmail uniqueEmail = new UniqueEmail(mail);
        hashSet.add(uniqueEmail);
        System.out.println("Email Added Successfully");

    }

    public void removeEmail(String mail)
    {
        for (UniqueEmail e : hashSet) {
            if (e.getEmail_addreass().equals(mail))
            {
                hashSet.remove(e);
                System.out.println("Email Deleted");
            }
            else
            {
                System.out.println("Email not Found");
            }
        }

    }

    public void chkAvailibityMail(String mail) {
        for (UniqueEmail m : hashSet)
        {
            if (m.getEmail_addreass().equalsIgnoreCase(mail))
            {
                System.out.println("Email exist");
                System.out.println(m);
            }
        }
    }

    public void displayEmail()
    {
        for (UniqueEmail e : hashSet)
        {
            System.out.println(e);
        }

    }

}
