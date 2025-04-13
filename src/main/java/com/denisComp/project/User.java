
import java.util.UUID;

public class User {
    UUID id;
    private String name;
    private String userName;

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }

    public User(UUID id, String name, String userName) {
        this.id = id;
        this.name = name;
        this.userName = userName;
    }

    public User(String name, String userName) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.userName = userName;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "id: [" + getId() + "] name: " + getName() + " Username: " + getUserName() + "\n";
    }
}