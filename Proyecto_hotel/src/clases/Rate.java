package clases;

import java.util.Date;

public class Rate {
    private String roomtype;
    private Date date;
    private String weekday;
    private float rate;
    private String[] range;

    public Rate(String roomtype, Date date, String weekday, float rate, String[] range) {
        this.roomtype = roomtype;
        this.date = date;
        this.weekday = weekday;
        this.rate = rate;
        this.range = range;
    }
    
    // getters and setters
}

