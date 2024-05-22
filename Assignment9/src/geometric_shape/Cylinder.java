package geometric_shape;

public class Cylinder extends Geometric_Shape{

    @Override
    public void volume() {
        System.out.println("enter radius and height of a cylinder");
        int radius=scanner.nextInt();
        int height=scanner.nextInt();
        System.out.println("volume of cylinder"+Math.PI*radius*radius*height);
    }
}
