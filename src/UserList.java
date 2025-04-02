import java.util.ArrayList;
import java.util.List;

public class UserList {
 private static int id = 1;

 private List<User> userList = new ArrayList<>();

    public List<User> getUserList() {
        return userList;
    }

    public void addUser (String name, String userName) {
     User user = new User(id++, name, userName);
     userList.add(user);
 }
}
