
import java.util.Scanner;

public class UserController {

    public static void start() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("""
                    1->Add new user
                    2->Show all users, sorted by name
                    3->Show all users, sorted by nick
                    4->Show all users, sorted by id
                    5->Search user by nickName
                    
                    0->exit""");
            switcher(scanner.nextInt());
        } while (true);
    }

    public static void inputData() {

        Scanner scanner = new Scanner(System.in);
        do {
            String data = scanner.nextLine();
            if (data.equalsIgnoreCase("quit")) {
                System.out.println();
                start();
                return;
            }
            String[] temp = data.split(" ");

            UserService.addUser(temp[0].replaceAll(" ", ""), temp[1].replaceAll(" ", ""));

        } while (true);
    }

    public static void switcher(int num) {

        switch (num) {
            case 1:
                System.out.println("Введи имя и nickName через пробел. Как закончишь - введи quit");
                inputData();
                break;

            case 2:
                System.out.println("Тут все отсортированы по имени:");
                UserService.printUser(UserService.getUserList());
                System.out.println();
                break;

            case 3:
                System.out.println("Тут все отсортированы по nick");
                UserService.sortByNick(UserService.getUserList());
                System.out.println();
                break;

            case 4:
                System.out.println("Тут все отсортированы по id");
                UserService.sortByID(UserService.getUserList());
                System.out.println();
                break;

            case 5:
                System.out.println("введи userName начинающийся с @:");
                Scanner scanner = new Scanner(System.in);
                String nick = scanner.nextLine();
                if (nick.charAt(0) != '@') {
                    System.out.println("неправильно ввёл ёптить. Давай по новой");
                    break;
                }
                System.out.println("Насяйнике, я насёл никнейманава:");
                UserService.searchByNick(nick);
                System.out.println();
                break;

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
                break;

            default:
                System.out.println("Wrong parameter, try again");
                System.out.println();
                break;
        }
    }
}
