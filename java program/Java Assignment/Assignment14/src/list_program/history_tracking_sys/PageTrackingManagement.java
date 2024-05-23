package list_program.history_tracking_sys;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Scanner;

public class PageTrackingManagement {
    Scanner scanner=new Scanner(System.in);

    LinkedList<Page> list=new LinkedList<>(){{
        add(new Page(100,"www.google.com","google","2024-05-22"));
       add(new Page(101,"www.facebook.com","facebook","2024-05-23"));
       add(new Page(102,"www.instagram.com","instagram","2024-05-22"));
       add(new Page(103,"www.flipkart.com","flipkart","2024-05-30"));
       add(new Page(104,"www.amazon.com","amazon","2024-05-21"));
    }};

    public void displayAllPage()
    {
        for (Page p:list)
        {
            System.out.println(p);
        }
    }

    public void searchPageByUrl()
    {
        System.out.println("Please Enter the url");
        String url=scanner.next();
        for (Page p:list)
        {
            if (p.getUrl().equalsIgnoreCase(url))
               System.out.println(p);
        }
    }

    public void PageVisitedOnSpecificDate()
    {
        System.out.println("Please Enter the Date(yyyy-mm-dd)");
        String date = scanner.next();

        for (Page p:list)
        {
            if (p.getDate().equalsIgnoreCase(date))
                System.out.println(p);
        }

    }
}
