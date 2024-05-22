package geometric_shape;

public class Cube extends Geometric_Shape{
    @Override
    public void volume() {

        System.out.println("enter side of a cube");
        int side= scanner.nextInt();
        System.out.println("volume of cube"+side*side*side);
    }
}
