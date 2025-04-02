import java.util.ArrayList;
import java.util.List;

public class UserList {

 private List<User> userList = new ArrayList<>();

    public List<User> getUserList() {
        return userList;
    }

    public void addUser (String name, String userName) {
     User user = new User(name, userName);
     userList.add(user);
 }
}
