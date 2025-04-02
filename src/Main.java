import java.util.*;

public class Main {

    public static void main(String[] args) {
        UserList userList = getUserList();
        printUser(userList.getUserList());

//        Scanner scanner = new Scanner(System.in);
//        do{
//            System.out.println("name+username:");
//            String name = scanner.nextLine();
//            String userName = scanner.nextLine();
//            if (name.equals("qq") | userName.equals("qq")) {
//                return;
//            } else {
//                userList.addUser(name, userName);
//                System.out.println("again?y/n");
//            }
//        } while (!scanner.nextLine().equals("n"));
    }

    private static UserList getUserList() {
        String[] nameArr = {"Александр", "Мария", "Дмитрий", "Анна", "Михаил", "Екатерина", "Владимир", "Ольга", "Сергей", "Наталья"};
        String[] userNameArr = {"@alexsmith", "@annawhite", "@davidgreen", "@elizabeth", "@john", "@katrinablue", "@maxwell", "@olgapink", "@peter", "@sophia"};
        UserList userList = new UserList();
        Random random = new Random();
        for (int i=0; i<5;i++){
            String name = nameArr[random.nextInt(nameArr.length)];
            String userName = userNameArr[random.nextInt(userNameArr.length)];
            userList.addUser(name, userName);
        }
        return userList;
    }

    public static void printUser (List<User> users){
        for (User user : users) {
            System.out.printf("id:%d, name: %s, userName: %s, \n", user.getId(), user.getName(), user.getUserName());
        }
    }
}

