package service.operations;

import contract.Operation;
import domain.User;

import java.util.Scanner;

public class InputOperation implements Operation {
    @Override
    public void run() {
        System.out.println("Введи имя и nickName через пробел. Как закончишь - введи quit");
        Scanner scanner = new Scanner(System.in);
        do {
            String data = scanner.nextLine();
            if (data.equalsIgnoreCase("quit")) {
                System.out.println();
                return;
            }
            String[] temp = data.split(" ");
            addUser(temp[0].replaceAll(" ", ""), temp[1].replaceAll(" ", ""));
            System.out.print("\t\tadded\n");
        } while (true);
    }

    private void addUser(String name, String userName) {
        if (userName.charAt(0) != '@') userName = '@' + userName;
        User user = new User(name, userName);
        userList.add(user);
    }
}
