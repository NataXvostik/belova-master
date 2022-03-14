public enum Command {

    ADD("add"),
    LIST("list"),
    EXIT("exit");

    public final String name;

    public String getCommand() {
        return name;
    }
    Command(String name) {
        this.name = name;
    }
}
