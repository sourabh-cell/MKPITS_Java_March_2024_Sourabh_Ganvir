package hashset_program.new_email_collect;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueEmailManagement {
    UniqueEmail uniqueEmail=new UniqueEmail();
    Scanner scanner=new Scanner(System.in);
    HashSet<UniqueEmail> hashSet=new HashSet();


    public void addEmail()
    {
        System.out.println("Please Enter the Email Address");
        String uemail = scanner.next();

            }

    public void removeEmail()
    {
        System.out.println("Please enter the Email id to remove");
        String Email=scanner.next();
        for (UniqueEmail e:hashSet)
        {
            if (e.equals(Email)){
                hashSet.remove(e);
            }

        }
    }



}
