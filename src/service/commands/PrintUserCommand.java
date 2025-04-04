package service.commands;

import contract.Command;
import contract.Operation;
import service.operations.PrintUserOperation;

public class PrintUserCommand implements Command {

    private final Operation operation = new PrintUserOperation();
    @Override
    public void execute() {
        operation.run();
    }
}
