package animal.data;

public enum Command {

    ADD("ADD"),
    LIST("LIST"),
    EXIT("EXIT");

    private final String name;

    public String getCommand() {
        return name;
    }
    Command(String name) {
        this.name = name;
    }

}
