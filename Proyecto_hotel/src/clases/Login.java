package clases;

import java.util.HashMap;

public class Login {
    private HashMap<String, String> users;

    public Login() {
        this.users = new HashMap<String, String>();
    }

    public void addUser(String username, String password) {
        users.put(username, password);
    }

    public boolean verifyUser(String username, String password) {
        if (users.containsKey(username)) {
            String storedPassword = users.get(username);
            return password.equals(storedPassword);
        }
        return false;
    }
}
