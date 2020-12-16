package computerHWLT;

public class Keyboard {
    private String name;
    private String connection;

    public Keyboard(String name, String connection) {
        this.name = name;
        this.connection = connection;
    }
    public Keyboard(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    @Override
    public String toString() {
        return
                "name: " + name +
                ", connection: " + connection;

    }
}
