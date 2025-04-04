package service.operations;

import contract.Operation;
import domain.User;

import java.util.Comparator;

public class PrintUsersSortedByIdOperation implements Operation {
    @Override
    public void run() {
        userList.sort(Comparator.comparing(User::getId));
        printUsers(userList);
    }
}
