package clases;

import java.util.HashMap;

public class Login {
    private HashMap<String, Object[]> users;

    public Login() {
        this.users = new HashMap<String, Object[]>();
    }

    public void addUser(String username, String password, String userType) {
        Object[] userInfo = {password, userType};
        users.put(username, userInfo);
    }

    public boolean verifyUser(String username, String password) {
        if (users.containsKey(username)) {
            Object[] userInfo = users.get(username);
            String storedPassword = (String)userInfo[0];
            return password.equals(storedPassword);
        }
        return false;
    }
    
    public String getUserType(String username) {
        if (users.containsKey(username)) {
            Object[] userInfo = users.get(username);
            return (String)userInfo[1];
        }
        return null;
    }
}
