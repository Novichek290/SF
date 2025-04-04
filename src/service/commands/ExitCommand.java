package service.commands;

import contract.Command;

public class ExitCommand implements Command {

    @Override
    public void execute() {
        System.out.println("бывайте, ихтиандры хуевы");
        System.exit(1);
    }
}
