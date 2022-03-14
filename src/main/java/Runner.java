
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Выберите команду add/list/exit");
            String s = sc.next().trim().toUpperCase(Locale.ROOT);

            var t = Command.valueOf(s);

            switch (t) {
                case ADD:
                    System.out.println("Какое животное? cat/dog/duck");
                    String animalType = sc.next().trim().toLowerCase(Locale.ROOT);
                    Animal animal = null;

                    if (animalType.equals("cat")) {
                        animal = new Cat();
                        generateAnimal(animal, sc);
                    } else if (animalType.equals("dog")) {
                        animal = new Dog();
                        generateAnimal(animal, sc);
                    }
                    else if (animalType.equals("duck")) {
                        animal = new Duck();
                        generateAnimal(animal, sc);
                    }
                    animals.add(animal);
                    animal.say();
                    break;

                case LIST:
                    for (Animal a : animals) {
                        a.say();
                        System.out.println(a);
                    }
                    System.out.println("list");
                    break;
                case EXIT:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong word");
            }
        }
    }

    private static void generateAnimal(Animal animal, Scanner scanner) {
        System.out.println("Введите имя");
        animal.setName(scanner.next().trim().toLowerCase(Locale.ROOT));
        System.out.println("Введите возраст");
        animal.setAge(scanner.nextInt());
        System.out.println("Введите вес");
        animal.setWeight(scanner.nextInt());
        System.out.println("Введите цвет");
        animal.setColor(scanner.next().trim().toLowerCase(Locale.ROOT));
    }
}
