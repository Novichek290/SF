import java.util.ArrayList;
import java.util.List;

public class UserList {
    int id = 1;
    List<User> listUser = new ArrayList<>();

    public List<User> getListUser() {
        return listUser;
    }

    public void addUser(String name, String userName) {
        User user = new User(id++, name, userName);
        listUser.add(user);
    }

    public List<User> search(String userName) {
        List <User> result = new ArrayList<>();
        for(User user : listUser) {
            if(user.getUserName().equals(userName)) {
                result.add(user);
                System.out.printf("id:%s, name: %s, userName: %s, \n", user.getId(), user.getName(), user.getUserName());
            }
        }
        return result;
    }
}

