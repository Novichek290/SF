package com.yourcompany.project;

import java.util.Comparator;
import java.util.List;

public class LogicOperations {

    public void addUser(String name, String userName) {
        UserList userList = new UserList();
        if (userName.charAt(0) != '@') userName = '@' + userName;
        User user = new User(name, userName);
        userList.getListUser().add(user);
        System.out.println("Added name: " + name + ". Added nickName " + userName + ".");
    }


    public void search(String userName) {
        UserList userList = new UserList();
        for (User user : userList.getListUser())
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

    public static void printUserSortedByNickName(List<User> users) {
        users.sort(Comparator.comparing(User::getUserName));
        for (User user : users) {
            System.out.printf("id:%s, name: %s, userName: %s, \n", user.getId(), user.getName(), user.getUserName());
        }
    }

    public static void printUserSortedByID(List<User> users) {
        users.sort(Comparator.comparing(User::getId));
        for (User user : users) {
            System.out.printf("id:%s, name: %s, userName: %s, \n", user.getId(), user.getName(), user.getUserName());
        }
    }
}
