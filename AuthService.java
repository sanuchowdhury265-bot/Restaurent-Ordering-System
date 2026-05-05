
 import java.util.*;

class AuthService {
    private List<User> users = new ArrayList<>();

    AuthService() {
        users.add(new User("admin", "1234"));
        users.add(new User("user", "pass"));
    }

    boolean login(String username, String password) {
        for (User u : users) {
            if (u.username.equals(username) && u.password.equals(password)) {
                return true;
            }
        }
        return false;
    }
}
