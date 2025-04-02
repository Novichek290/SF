import java.util.ArrayList;

public class User {
    private String name;
    private String userName;
    private int id;

    public String getName() {
        return name;
    }
    public String getUserName() {
        return userName;
    }
    public int getId() {
        return id;
    }

    public User(int id, String name, String userName) {
        this.name = name;
        this.userName = userName;
        this.id = id;
    }
    public User() {}
}
