
import java.util.Scanner;

public class UserController {

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        while(isRunning) {
            System.out.println("""
                    1->Add new user
                    2->Show all users, sorted by name
                    3->Show all users, sorted by nick
                    4->Show all users, sorted by id
                    5->Search user by nickName
                    
                    0->exit""");

            int choice = scanner.nextInt();
            isRunning = switcher(choice);
        }
        scanner.close();
        System.out.println("Бывайте, ихтиандры хуевы!");
    }

    public static void inputData() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String data = scanner.nextLine();
            if (data.equalsIgnoreCase("quit")) {
                break;
            }

            String[] temp = data.split(" ");
            if (temp.length >= 2) {
                UserService.addUser(temp[0].trim(), temp[1].trim());
            } else {
                System.out.println("Ошибка: нужно ввести имя и ник через пробел!");
            }
        }
    }

    public static boolean switcher(int command) {

        switch (command) {
            case 1:
                System.out.println("Введи имя и nickName через пробел. Как закончишь - введи quit");
                inputData();
                return true;

            case 2:
                System.out.println("Тут все отсортированы по имени:");
                UserService.printUser(UserService.getUserList());
                System.out.println();
                return true;
            case 3:
                System.out.println("Тут все отсортированы по nick");
                UserService.sortByNick(UserService.getUserList());
                System.out.println();
                return true;
            case 4:
                System.out.println("Тут все отсортированы по id");
                UserService.sortByID(UserService.getUserList());
                System.out.println();
                return true;
            case 5:
                System.out.println("введи userName начинающийся с @:");
                Scanner scanner = new Scanner(System.in);
                String nick = scanner.nextLine();
                if (nick.charAt(0) != '@') {
                    System.out.println("неправильно ввёл ёптить. Давай по новой");
                    return true;                }
                System.out.println("Насяйнике, я насёл никнейманава:");
                UserService.searchByNick(nick);
                System.out.println();
                return true;
//                case 6:
//                    try {
//                        Connection conn = DatabaseConnection.getConnection();
//                        System.out.println("Подключение успешно!");
//                        conn.close();
//                    } catch (SQLException e) {
//                        System.err.println("Ошибка подключения: " + e.getMessage());
//                    }
//                break;

            case 0:
                System.out.println("бывайте, ихтиандры хуевы");
                System.exit(1);
                return false;
            default:
                System.out.println("\n---------->Wrong parameter, try again<----------\n");
                return true;
        }
    }
}
