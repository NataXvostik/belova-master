package Animal.Data;

public enum Command {

    ADD("ADD"),
    LIST("LIST"),
    EXIT("EXIT");

    public final String name;

    public String getCommand() {
        return name;
    }
    Command(String name) {
        this.name = name;
    }

}
