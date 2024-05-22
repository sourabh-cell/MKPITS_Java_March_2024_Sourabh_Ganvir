package geometric_shape;

public class Sphere extends Geometric_Shape{
    @Override
    public void volume() {
        System.out.println("enter radius of a sphere");
        int radius = scanner.nextInt();
        System.out.println("The volume of sphere"+ (4/3)*Math.PI*(Math.pow(radius,3)));
    }
}
