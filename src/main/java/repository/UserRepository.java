package repository;

import model.User;
import javax.servlet.RequestDispatcher;
import java.util.ArrayList;
import java.util.List;

public abstract class UserRepository {
    private static List<User> list = new ArrayList<User>();

    public static void addUser(User user) {
        list.add(user);
    }

    public static User ifExists(String login, String password) {
        for (User user : list) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}
