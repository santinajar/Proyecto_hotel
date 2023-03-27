package clases;
import java.util.Date;

public class Reserve {
    private Date startDate;
    private Date endDate;
    private Resident residente;
    private Group grupo;
    private Rooms rooms;
    
    public Reserve(Date startDate, Date endDate, Resident residente, Group grupo, Rooms rooms) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.residente = residente;
        this.grupo = grupo;
        this.rooms = rooms;
    }
    
    // Getters and setters
    public Date getStartDate() {
        return startDate;
    }
    

    
    public Date getEndDate() {
        return endDate;
    }

    public Residente getResidente() {
        return residente;
    }
    
    
    public Group getGrupo() {
        return grupo;
    }
    
    
    public Rooms getRooms() {
        return rooms;
    }
    

}
