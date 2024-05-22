package shape;

import java.util.Scanner;

public class Traingle extends Shape {

    Scanner scanner=new Scanner(System.in);
    @Override
    public void area() {

        System.out.println("Please enter the Base and height");
        double Base= scanner.nextDouble();
        double height= scanner.nextDouble();
        System.out.println("The area of Rectangle is "+ 0.5*Base*height);


    }

    @Override
    public void perimeter() {

        System.out.println("Please enter the length of first side");
        double First = scanner.nextDouble();
        System.out.println("Please enter the length of Second side");
        double Second = scanner.nextDouble();
        System.out.println("Please enter the length of Third side");
        double Third = scanner.nextDouble();
        System.out.println("The Perimeter of Traingle is "+ First+Second+Third);

    }
}
