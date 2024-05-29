//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // books class
        Book bk[]=new Book[10];
         bk[0]=new Book("Python programming","Micheal williams",1204,"BK100");
         bk[1]=new Book("C++ programming","John williams",1100,"BK200");
         bk[2]=new Book("Java programming","Robert williams",1300,"BK300");
         bk[3]=new Book("C programming","Stuart williams",1500,"BK400");

       //staff class
       Staff st=new Staff(101,"Rohan Mishra","rohan","123456");
       Staff st1=new Staff(102,"Manoj Mishra","manoj","123456");

       //Member class
        Member mb=new Member(1,"9420251767","Sourabh Ganvir","sourabh@gmail.com");
        Member mb1=new Member(2,"7276616867","Shubham Uprikar","shubham@gmail.com");


    }

}