public class Animal implements Fly{
    private String name;
    private int age;
    private int weight;
    private String color;

    public void say() {
        System.out.println("Я говорю");
    }

    public void go() {
        System.out.println("Я иду");
    }

    public void drink() {
        System.out.println("Я пью");
    }

    public void eat() {
        System.out.println("Я ем");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        String year;
        int ageLastDigit = age % 10;
        if (age >= 11 && age <= 19) {
            year = "лет";
        } else if (ageLastDigit >= 2 && ageLastDigit <= 4) {
            year = "года";
        } else if (ageLastDigit == 1) {
            year = "год";
        } else {
            year = "лет";
        }

        return "Привет! меня зовут " + name + ", мне " + age + " " + year + ", я вешу - " + weight + " кг, мой цвет - " + color;
    }

    @Override
    public void Fly() {
        System.out.println("Я лечу");
    }
}

