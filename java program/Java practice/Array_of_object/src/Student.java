import java.security.PrivateKey;
import java.util.Scanner;

public class Student
{
    private int mark;
    private String name;


    public void acceptDetails(){
    Scanner scanner=new Scanner(System.in);
    System.out.println("name");
    name=scanner.next();


    System.out.println("mark");
    mark=scanner.nextInt();
    }

    public void displayDetails()
        {
            System.out.println("Name"+name);
            System.out.println("Marks"+mark);
        }

}
