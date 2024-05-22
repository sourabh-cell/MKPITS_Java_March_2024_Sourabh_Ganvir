import java.util.Scanner;

public class Geometryshape {
    Scanner scanner= new Scanner(System.in);
    public void squareArea()
    {
        System. out.print("Enter the length of a side: ");
        int side = scanner.nextInt();
        int area = side * side;
        System. out.println("The area of the square is " + area);
    }


   public void rectanglearea()
   {
       System.out.println("Enter the length and width of rectangle");
       int length = scanner.nextInt();
       int width = scanner.nextInt();
       int area = length * width;
       System.out.println("The area of the rectangle is: " + area);
   }

   public void traingleArea()
   {
       System.out.println("Enter the base of the triangle:");
       double base = scanner.nextDouble();
       System.out.println("Enter the height of the triangle:");
       double height = scanner.nextDouble();
       double area = (base * height) / 2;
       System.out.println("The area of the triangle is " + area);

   }
}
