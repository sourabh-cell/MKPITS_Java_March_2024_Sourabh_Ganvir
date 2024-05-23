package list_program.event_scheduling_sys;

import list_program.play_list_management_sys.Playlist;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedList;
import java.util.Scanner;

public class EventScheduling {

    Scanner scanner= new Scanner(System.in);
    LinkedList<Event> list=new LinkedList<>();
    public void addnewEvent()
    {
        System.out.println("please enter event Id");
        int id= scanner.nextInt();
        System.out.println("please enter event Name");
        String name= scanner.next();
        System.out.println("please enter event Location");
        String location=scanner.next();
        System.out.println("please enter Event date(DD/MM/YYYY)");

        LocalDate date=LocalDate.parse(scanner.next());

        LocalTime time = LocalTime.now();
        Event event =new Event(id,name,location, date, time);//creating object
        list.add(event);//adding object in the list
        System.out.println("Song added Successfully");
    }

    public void displayAllEvent()
    {
        for (Event e:list)
        {
            System.out.println(e);
        }
    }

    public void searchEventByLocation()
    {
        System.out.println("please enter Location");
        String location= scanner.next();
        for (Event e:list)
        {
            if (e.getLocation().equalsIgnoreCase(location)){
                System.out.println(e);
            }
        }

    }
}
