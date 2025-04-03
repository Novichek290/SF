import java.util.*;

public class Main {

    public static void main(String[] args) {
        UserList userList = nameGenerator();
        nameGenerator();
        printUser(userList.getListUser());
        System.out.println("///////////////////////////////////////////");
        System.out.println("Пользователи по userName:");
        userList.search("@alexsmith");
        userList.search("@peter");
        userList.search("@sophia");
        userList.search("@maxwell");
        userList.search("@katrinablue");
        userList.search("@elizabeth");

    }

    private static UserList nameGenerator() {
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
            System.out.printf("id:%s, name: %s, userName: %s, \n", user.getId(), user.getName(), user.getUserName());
        }
    }

}

