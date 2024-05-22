package user_defined_exception_string_mismatch;

import java.util.Scanner;

public class Match {
    Scanner scanner=new Scanner(System.in);
    String input="";
    String orignal="Sourabh";

    //taking string from user
    public void takeString(){
        System.out.println("Enter the String");
        input=scanner.next();
    }

    public void matchString()throws StringMismatch{
        if (input.equals(orignal)) {
            System.out.println("String IS Matched");
        }
        else {
            throw new StringMismatch();
        }
    }
}
