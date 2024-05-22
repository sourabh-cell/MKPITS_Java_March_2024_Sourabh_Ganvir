package interface_animal;

public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("Cat eats fish");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleep on roof");

    }

    @Override
    public void makeSound() {
        System.out.println("Cat make sound MEOW");
    }
}
