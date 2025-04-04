package service.commands;

import contract.Command;
import contract.Operation;
import service.operations.InputOperation;

public class InputUserCommand implements Command {

    private final Operation operation = new InputOperation();

    @Override
    public void execute() {
        operation.run();
    }
}
