package clases;

import java.util.HashMap;

public class Restaurant {
    private HashMap<String, Object[]> menu;

    public Restaurant() {
        this.menu = new HashMap<String, Object[]>();
    }

    public Object[] getMenu(String dishName) {
        return menu.get(dishName);
    }

    public void setMenu(String dishName, int price, String description) {
        Object[] dishInfo = {price, description};
        menu.put(dishName, dishInfo);
    }
}

