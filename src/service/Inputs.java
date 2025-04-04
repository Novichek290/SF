package service;

import contract.Command;
import service.commands.PrintUsersSortedByIdCommand;
import service.commands.DefaultCommand;
import service.commands.ExitCommand;
import service.commands.FindUserByNicknameCommand;
import service.commands.InputUserCommand;
import service.commands.PrintUserCommand;
import service.commands.PrintUserSortedByNicknameCommand;

import java.util.Arrays;

public enum Inputs {

    ONE(1, new InputUserCommand()),
    TWO(2, new PrintUserCommand()),
    THREE(3, new PrintUserSortedByNicknameCommand()),
    FOUR(4, new PrintUsersSortedByIdCommand()),
    FIVE(5, new FindUserByNicknameCommand()),
    SIX(6, new ExitCommand()),
    DEFAULT(0, new DefaultCommand());

    private final int input;

    private final Command command;

    Inputs(int input, Command command) {
        this.input = input;
        this.command = command;
    }

    public int getInput() {
        return input;
    }

    public Command getCommand() {
        return command;
    }

    public static Inputs findByInputOrDefault(int i) {
        return Arrays.stream(Inputs.values())
                .filter(input -> i == input.getInput())
                .findFirst()
                .orElse(DEFAULT);
    }
}
