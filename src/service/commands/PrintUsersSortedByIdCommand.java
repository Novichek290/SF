package service.commands;

import contract.Command;
import contract.Operation;
import service.operations.PrintUsersSortedByIdOperation;

public class PrintUsersSortedByIdCommand implements Command {

    private final Operation operation = new PrintUsersSortedByIdOperation();

    @Override
    public void execute() {
        operation.run();
    }
}
