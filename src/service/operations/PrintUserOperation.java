package service.operations;

import contract.Operation;
import domain.User;

import java.util.Comparator;

public class PrintUserOperation implements Operation {

    @Override
    public void run() {
        userList.sort(Comparator.comparing(User::getName));
        System.out.println("Тут все отсортированы по имени:");
        printUsers(userList);
        System.out.println();
    }
}
