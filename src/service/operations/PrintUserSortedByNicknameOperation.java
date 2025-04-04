package service.operations;

import contract.Operation;
import domain.User;

import java.util.Comparator;

public class PrintUserSortedByNicknameOperation implements Operation {
    @Override
    public void run() {
        userList.sort(Comparator.comparing(User::getUserName));
        System.out.println("Тут все отсортированы по nick");
        printUsers(userList);
    }
}
