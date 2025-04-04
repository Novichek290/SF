package controller;

import service.ConsoleService;

import java.util.Scanner;

public class Runner {

    private final ConsoleService service;

    public Runner(ConsoleService service) {
        this.service = service;
    }

    public void run() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("""
                    1->Add new user
                    2->Show all users, sorted by name
                    3->Show all users, sorted by nick
                    4->Show all users, sorted by id
                    5->Search user by nickName
                    6->exit""");
            service.switcher(scanner.nextInt());
        } while (true);
    }
}
