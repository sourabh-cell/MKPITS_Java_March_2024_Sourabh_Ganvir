package interface_animal;

public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("Dog eats bread");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps on couch");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog Barks");
    }
}
