package shape;

import java.util.Scanner;

public class Rectangle extends Shape{

    Scanner scanner=new Scanner(System.in);
    @Override
    public void area() {
        System.out.println("Please enter the length and width");
        double length= scanner.nextDouble();
        double width= scanner.nextDouble();

        System.out.println("The area of Rectangle is "+ length*width);

    }

    @Override
    public void perimeter() {
        System.out.println("Please enter the length and width");
        double length= scanner.nextDouble();
        double width= scanner.nextDouble();
        System.out.println("The Perimeter of Rectangle is "+ 2*(length+width));


    }
}
