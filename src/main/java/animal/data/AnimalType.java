package animal.data;

public enum AnimalType {
    CAT("CAT"),
    DOG("DOG"),
    DUCK("DUCK");

    private final String name;

    public String getAnimalType() {
        return name;
    }
    AnimalType(String name) {
        this.name = name;
    }

}
