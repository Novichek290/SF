import controller.Runner;
import service.ConsoleService;

public class Main {
    public static void main(String[] args) {
        var runner = new Runner(new ConsoleService());
        runner.run();
    }
}

