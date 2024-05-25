package hashset_program.duplicate_word_filter;

import java.util.HashSet;
import java.util.Scanner;

public class WordFilter {

    HashSet<String> hashset = new HashSet<>();
    Scanner scanner =new Scanner(System.in);

    public void addWord()
    {
       try
       {
           System.out.println ("please Enter the word");
           String word= scanner.next();


           hashset.add(word);
           System.out.println("Word Added Successfully");
       }
       catch (Exception e)
       {
           System.out.println("please enter the valid input");
           addWord();
       }
    }

    public void displayWord()
    {
        for (String s:hashset)
        {
            System.out.println(s);
        }
    }

    public void containWord()
    {
        System.out.println("please Enter the word to check");
        String word= new String(scanner.next());

        if(hashset.contains(word)==true) System.out.println("Element contains");
        else System.out.println("Word is not available");

    }

    public void removeWord()
    {
        System.out.println("please Enter the word to remove");
        String word= new String(scanner.next());

        if (hashset.contains(word)==false) System.out.println("word not exist ");
        else
            hashset.remove(word);
        System.out.println("Element removed");

    }



}
