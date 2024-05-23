package Arraylist_program.movie_collection_manager;
import Arraylist_program.student_management_system.StudentManagentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieManager {
    Scanner scanner=new Scanner(System.in);
    ArrayList<Movie> list=new ArrayList<>();
    public void addMovie()
    {
        System.out.println("Please Enter the Movie id");
        int movie_id =scanner.nextInt();
        System.out.println("Please Enter the Movie Name");
        String movie_name =scanner.next();
        System.out.println("Please Enter the Director Name");
        String director= scanner.next();
        System.out.println("Please Enter the Genre of Movie");
        String genre= scanner.next();
        System.out.println("Please Enter the Year realeased(yyyy)");
        int year= scanner.nextInt();
        Movie movie=new Movie(movie_id, movie_name,director,genre,year);
        list.add(movie);
        System.out.println("Movie added Successfull");
    }

    public void searchByGenre()
    {
        System.out.println("Please Enter the Genre");
        String Genre= scanner.next();

        for (Movie m:list)   //For Each Loop for displaying
        {
            if(m.getGenre().equalsIgnoreCase(Genre))
            {
                System.out.println(m);
            }
        }
    }

    public void displayMovie()
    {
        for (Movie m:list)   //For Each Loop for displaying details
        {
            System.out.println(m);
        }
    }


}
