package service;

public class ConsoleService {

    public void switcher(int nextInt) {
        var inputs = Inputs.findByInputOrDefault(nextInt);
        var command = inputs.getCommand();
        command.execute();
    }
}
