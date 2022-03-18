import java.util.*;

import Animal.Animal;
import Animal.Data.*;
import Animal.Pets.*;
import Animal.Birds.*;

public class Runner {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите команду add/list/exit");
            String input = scanner.next().trim().toUpperCase(Locale.ROOT);
            var commands = Command.values();
            boolean isCommandExist = false;
            for (Command command : commands) {
                if (command.getCommand().equals(input)) {
                    isCommandExist = true;
                    break;
                }
            }

            if (!isCommandExist) {
                System.out.printf("Команда %s не поддерживается\n", input);
                continue;
            }
            var command = Command.valueOf(input);

            switch (command) {
                case ADD: {

                    String animalTypeInput;

                    while (true) {
                        System.out.println("Какое животное? cat/dog/duck");
                        animalTypeInput = scanner.next().trim().toUpperCase(Locale.ROOT);
                        var animalTypes = AnimalType.values();
                        boolean isAnimalTypeExist = false;
                        for (AnimalType animalType : animalTypes) {
                            if (animalType.getAnimalType().equals(animalTypeInput)) {
                                isAnimalTypeExist = true;
                                break;
                            }
                        }
                        if (!isAnimalTypeExist) {
                            System.out.printf("Животного %s не существует. Введите еще раз\n", animalTypeInput);
                            continue;
                        }
                        break;
                    }

                    Animal animal = null;

                    if (animalTypeInput.equals(AnimalType.CAT.getAnimalType())) {
                        animal = new Cat();
                        generateAnimal(animal, scanner);
                    } else if (animalTypeInput.equals(AnimalType.DOG.getAnimalType())) {
                        animal = new Dog();
                        generateAnimal(animal, scanner);
                    } else if (animalTypeInput.equals(AnimalType.DUCK.getAnimalType())) {
                        animal = new Duck();
                        generateAnimal(animal, scanner);
                    }
                    animals.add(animal);
                    animal.say();
                    break;
                }
                case LIST:
                    for (Animal animal : animals) {
                        animal.say();
                        System.out.println(animal);
                    }
                    System.out.println("list");
                    break;
                case EXIT:
                    System.exit(0);
                    break;
            }
        }
    }

    private static void generateAnimal(Animal animal, Scanner scanner) {
        System.out.println("Введите имя");
        animal.setName(scanner.next().trim().toLowerCase(Locale.ROOT));

        int age;
        do {
            System.out.println("Введите возраст");
            age = scanner.nextInt();
            if (age < 0 || age > 99) {
                System.out.println("Неправильный возраст. Введите еще раз");
            } else {
                break;
            }
        } while (true);

        animal.setAge(age);
        System.out.println("Введите вес");
        animal.setWeight(scanner.nextInt());
        System.out.println("Введите цвет");
        animal.setColor(scanner.next().trim().toLowerCase(Locale.ROOT));
    }
}
