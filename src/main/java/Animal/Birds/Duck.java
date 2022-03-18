package Animal.Birds;
import Animal.Animal;


public class Duck extends Animal implements Fly {
    @Override
    public void say() {
        System.out.println("quack");
    }

    @Override
    public void fly() {
        System.out.println("Я лечу");
    }
}
