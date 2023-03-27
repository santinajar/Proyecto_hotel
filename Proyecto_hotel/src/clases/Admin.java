package clases;

import java.util.ArrayList;

public class Admin {
    private ArrayList<Rooms> rooms;
    private Rate rate;
    private ArrayList<Service> services;
    private Restaurant restaurant;

    public Admin() {
        this.rooms = new ArrayList<Rooms>();
        this.rate = new Rate();
        this.services = new ArrayList<Service>();
        this.restaurant = new Restaurant();
    }

    public void chargeroominfo(Rooms room, float newCharges) {
        room.setCharges(newCharges);
    }

    public void createroom(Rooms room) {
        rooms.add(room);
    }

    public Rooms getroominfo(int roomId) {
        for (Rooms room : rooms) {
            if (room.getRoomId() == roomId) {
                return room;
            }
        }
        return null;
    }

    public boolean getaviabilty(int roomId, Date startDate, Date endDate) {
        Rooms room = getroominfo(roomId);
        if (room != null) {
            return room.isAvailable(startDate, endDate);
        }
        return false;
    }

    public void setrate(int roomId, float newRate) {
        Rooms room = getroominfo(roomId);
        if (room != null) {
            rate.setRate(room, newRate);
        }
    }

    public void setserviceprice(Service service, float newPrice) {
        service.setPrice(newPrice);
    }

    public void setmenu(ArrayList<String> menu) {
        restaurant.setMenu(menu);
    }
}
