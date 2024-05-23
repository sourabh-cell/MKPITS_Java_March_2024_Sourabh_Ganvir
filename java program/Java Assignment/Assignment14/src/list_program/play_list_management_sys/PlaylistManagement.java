package list_program.play_list_management_sys;

import list_program.customer_order_sys.CustomerOrder;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class PlaylistManagement {

    Scanner scanner= new Scanner(System.in);
    LinkedList<Playlist> list=new LinkedList<>();
    public void addnewSong()
    {
        System.out.println("please enter Song Id");
        int id= scanner.nextInt();
        System.out.println("please enter Song Name");
        String name= scanner.next();
        System.out.println("please enter song artist");
        String artist=scanner.next();
        System.out.println("please enter duration(in minute)");
        int duration = scanner.nextInt();
        System.out.println("please enter Album Name");
        String album = scanner.next();
        Playlist playlist=new Playlist(id,name,artist, duration, album);//creating object
        list.add(playlist);//adding object in the list
        System.out.println("Song added Successfully");
    }

    public void displayAllSong()
    {
        for (Playlist c:list)
        {
            System.out.println(c);
        }
    }

    public void searchSongbyTitle()
    {
        System.out.println("please enter  Song Name");
        String name= scanner.next();
        for (Playlist c:list)
        {
            if (c.getTitle().equalsIgnoreCase(name)){
            System.out.println(c);
            }
        }

    }

    public void sortByDuration()
    {
        Collections.sort(list);
        displayAllSong();
    }
}
