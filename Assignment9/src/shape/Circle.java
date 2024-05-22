package shape;


import java.util.Scanner;

public class Circle extends Shape{

    Scanner scanner=new Scanner(System.in);

    @Override
    public void area() {
        System.out.println("Please enter the radius");
        double radius= scanner.nextDouble();
        System.out.println("The area of circle is "+ Math.PI*radius*radius);


    }

    @Override
    public void perimeter() {
        System.out.println("Please enter the radius");
        double radius= scanner.nextDouble();
        System.out.println("The area of circle is "+ 2*Math.PI*radius);

    }



}
