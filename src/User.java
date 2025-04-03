
import java.util.UUID;

public class User {
    private String name;
    private String userName;
    private UUID id;

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getUserName() {
        return userName;
    }
  
    public UUID getId() {
        return id;
    }

    public User(String name, String userName) {
        this.name = name;
        this.userName = userName;
        this.id = UUID.randomUUID();
    }
}
