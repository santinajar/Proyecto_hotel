package clases;

import java.util.ArrayList;

public class Resident {
    private String name;
    private String mail;
    private String idtype;
    private int number;
    private int id;
    private ArrayList<Service> services;
    
    public Resident(String name, String mail, String idtype, int number, int id) {
        this.name = name;
        this.mail = mail;
        this.idtype = idtype;
        this.number = number;
        this.id = id;
        this.services = new ArrayList<Service>();
    }
    
    public void setService(Service service) {
        this.services.add(service);
    }
    
    // Getters and setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getMail() {
        return mail;
    }
    
    public void setMail(String mail) {
        this.mail = mail;
    }
    
    public String getIdtype() {
        return idtype;
    }
    
    public void setIdtype(String idtype) {
        this.idtype = idtype;
    }
    
    public int getNumber() {
        return number;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public ArrayList<Service> getServices() {
        return services;
    }
    
    public void setServices(ArrayList<Service> services) {
        this.services = services;
    }
}
