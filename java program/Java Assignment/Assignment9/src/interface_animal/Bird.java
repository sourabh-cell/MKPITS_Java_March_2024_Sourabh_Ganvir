package interface_animal;

public class Bird implements Animal {
    @Override
    public void eat() {
        System.out.println("Bird eats with its Beak");
    }

    @Override
    public void sleep() {
        System.out.println("Bird sleep on tree");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird make sounfd of whistle");
    }
}
