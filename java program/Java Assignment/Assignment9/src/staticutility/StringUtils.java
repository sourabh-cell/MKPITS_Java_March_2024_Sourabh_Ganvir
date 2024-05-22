package staticutility;

import java.io.FilterOutputStream;
import java.util.Scanner;

public class StringUtils {

    static String str=new String("I Love India I India");

    public static void revString(){
        String reverse="";
        reverse = new StringBuilder(str).reverse().toString();

        System.out.println("Orignal "+str);
        System.out.println("Reverse "+ reverse);
    }

    public static void upperCase() {
        System.out.println(str.toUpperCase());
    }

    public static void substringOccurence(){
        int count=0;
        String arr[]=str.split(" ");
        System.out.println("Enter the subtring");
        Scanner scanner=new Scanner(System.in);
        String substring=new String();
        substring=scanner.next();
        for(String i:arr) {
            if (i.equals(substring)) {
                count++;
            };
        }


        System.out.println("No. of occurrence of substring "+count);
    }
}

