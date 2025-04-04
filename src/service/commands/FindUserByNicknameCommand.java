package service.commands;

import contract.Command;
import contract.Operation;
import service.operations.FindUserByNicknameOperation;

public class FindUserByNicknameCommand implements Command {

    private final Operation operation = new FindUserByNicknameOperation();

    @Override
    public void execute() {
        operation.run();
    }
}
