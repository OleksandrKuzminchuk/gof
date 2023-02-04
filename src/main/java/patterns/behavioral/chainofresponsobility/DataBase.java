package patterns.behavioral.chainofresponsobility;

import java.util.HashMap;
import java.util.Map;

public class DataBase {
    private final Map<String, String> users;

    public DataBase() {
        this.users = new HashMap<>(Map.of(
                        "admin_username", "admin_password",
                        "user_username", "user_password"));
    }

    public boolean isValidUser(String userName){return users.containsKey(userName);}
    public boolean isValidPassword(String userName, String password){return users.get(userName).equalsIgnoreCase(password);}
}
