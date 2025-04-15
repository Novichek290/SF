import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UserService {

    public static void addUser(String name, String userName) {
        if (userName.charAt(0) != '@') userName = '@' + userName;
        User user = new User(name, userName);
        UserService.getUserList().add(user);
        System.out.println("Added name: " + name + ". Added nickName " + userName + ".");
    }

    public static void searchByNick(String userName) {
        for (User user : UserService.getUserList())
            if (user.getUserName().equals(userName)) {
                System.out.printf("id:%s, name: %s, userName: %s, \n", user.getId(), user.getName(), user.getUserName());
            }
    }

    public static void printUser(List<User> users) {
                users.sort(Comparator.comparing(User::getName));
        for (User user : users) {
            System.out.printf("id:%s, name: %s, userName: %s, \n", user.getId(), user.getName(), user.getUserName());
        }
    }

    public static void sortByNick(List<User> users) {
        users.sort(Comparator.comparing(User::getUserName));
        for (User user : users) {
            System.out.printf("id:%s, name: %s, userName: %s, \n", user.getId(), user.getName(), user.getUserName());
        }
    }

    public static void sortByID(List<User> users) {
        users.sort(Comparator.comparing(User::getId));
        for (User user : users) {
            System.out.printf("id:%s, name: %s, userName: %s, \n", user.getId(), user.getName(), user.getUserName());
        }
    }

    public static List<User> getUserList() {
        return new ArrayList<>();
    }
}
