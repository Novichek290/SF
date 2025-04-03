import java.util.UUID;

public class User {
    int id;
    String name;
    String userName;

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getUserName() {
        return userName;
    }

    public User(Integer id, String name, String userName) {
        this.id = id;
        this.name = name;
        this.userName = userName;
    }

}