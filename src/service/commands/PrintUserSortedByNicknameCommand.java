package service.commands;

import contract.Command;
import contract.Operation;
import service.operations.PrintUserSortedByNicknameOperation;

public class PrintUserSortedByNicknameCommand implements Command {

    private final Operation operation = new PrintUserSortedByNicknameOperation();

    @Override
    public void execute() {
        operation.run();
    }
}
