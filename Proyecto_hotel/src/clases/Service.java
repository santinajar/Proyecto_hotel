package clases;

public class Service {
    private String name;
    private String description;
    private float price;
    private boolean availability;
    private boolean payed;
    private Room room;
    
    public Service(String name, String description, float price, boolean availability, boolean payed, Room room) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.availability = availability;
        this.payed = payed;
        this.room = room;
    }
    
    public float roomCharge(boolean payed, Room room) {
        if (payed) {
            this.payed = true;
            room.addCharge(this.price);
        }
        return this.price;
    }
    
    // Getters and setters
    public String getName() {
        return name;
    }
    
 
    
    public String getDescription() {
        return description;
    }
    

    
    public float getPrice() {
        return price;
    }
    
  
    public boolean isAvailability() {
        return availability;
    }
    
    
    public boolean isPayed() {
        return payed;
    }
    
    public void setPayed(boolean payed) {
        this.payed = payed;
    }
    
    
}
