package service.operations;

import contract.Operation;
import domain.User;

import java.util.Scanner;

public class FindUserByNicknameOperation implements Operation {
    @Override
    public void run() {
        System.out.println("введи userName начинающийся с @:");
        Scanner scanner = new Scanner(System.in);
        String nick = scanner.nextLine();
        if (nick.charAt(0) != '@') {
            System.out.println("неправильно ввёл ёптить. Давай по новой");
        }
        search(nick);
        System.out.println();
    }

    private void search(String userName) {
        for (User user : userList)
            if (user.getUserName().equals(userName)) {
                System.out.println("Насяйнике, я насёл никнейманава:");
                System.out.printf("id:%s, name: %s, userName: %s, \n", user.getId(), user.getName(), user.getUserName());
            } else {
                System.out.println("No users found");
            }
    }
}
