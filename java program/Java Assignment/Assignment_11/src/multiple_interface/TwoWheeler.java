package multiple_interface;

public class TwoWheeler extends Car implements Motercycle,Cycle{
    @Override
    public void distance() {
        System.out.println("50 km");
    }

    @Override
    public void speed() {
        System.out.println("99 km/Hr");
    }

    @Override
   public void display() {
        super.display();
    }
}
