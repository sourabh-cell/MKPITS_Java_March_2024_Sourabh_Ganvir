package Order_of_Insertion_Preservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InsertionOrder insertionOrder=new InsertionOrder();
        Scanner scanner=new Scanner(System.in);
        String choice,word;
        do {
            System.out.println("Enter the word to add");
            word=scanner.next();
            insertionOrder.addElement(word);
            System.out.println("do yo want to add another word(y/n)");
            choice=scanner.next();

        }while(choice.equalsIgnoreCase("y"));

        insertionOrder.displayElement();
    }
}
