package contract;

import domain.User;

import java.util.ArrayList;
import java.util.List;

public interface Operation {

    List<User> userList = new ArrayList<>();

    void run();

    default void printUsers(List<User> users) {
        users.forEach(user -> System.out.printf("name: %s, userName: %s, \n", user.getName(), user.getUserName()));
    }
}
