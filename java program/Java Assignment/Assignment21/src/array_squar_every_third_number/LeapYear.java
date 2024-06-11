//Write a Java Program to check whether a given year is a leap year or not.
package array_squar_every_third_number;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int year;
        System.out.println("Please enter the year");
        year= scanner.nextInt();

        if (year%400==0||year%100!=0&&year%4==0){

            System.out.println(year+" is a leap year");
        }
        else
            System.out.println("Not a Leap year");

    }
}
