package service.commands;

import contract.Command;

public class DefaultCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Wrong parameter, try again \n\n");
    }
}
