package org.example;
import java.time.LocalDateTime;
import java.util.Date;

class Ticket {
    private String id;
    private String concertHall;
    private int eventCode;
    private long time;
    private boolean isPromo;
    private char stadiumSector;
    private double maxAllowedBackpackWeight;
    private double price;
    public Ticket(){
        this.time = System.currentTimeMillis();
    }

    public Ticket(String id, String concertHall, int eventCode, boolean isPromo, char stadiumSector, double maxAllowedBackpackWeight, double price) {
        this.id = id;
        this.concertHall = concertHall;
        this.eventCode = eventCode;
        this.time = System.currentTimeMillis();
        this.isPromo = isPromo;
        this.stadiumSector = stadiumSector;
        this.maxAllowedBackpackWeight = maxAllowedBackpackWeight;
        this.price=price;
    }

    public Ticket(String concertHall, int eventCode) {
        this.concertHall = concertHall;
        this.eventCode = eventCode;
        this.time = System.currentTimeMillis();;
    }

    public String getId() {
        return id;
    }

    public String getConcertHall() {
        return concertHall;
    }

    public int getEventCode() {
        return eventCode;
    }

    public long getTime() {
        return time;
    }

    public boolean isPromo() {
        return isPromo;
    }

    public char getStadiumSector() {
        return stadiumSector;
    }

    public double getMaxAllowedBackpackWeight() {
        return maxAllowedBackpackWeight;
    }


    public void setTicketPrice(double v) {
        this.price=v;
    }
}

public class TicketService {
    public static void main(String[] args) {
        Ticket emptyTicket = new Ticket();
        Ticket fullTicket = new Ticket("T123", "Concert Hall B", 202, true,  'B', 2.5,0.0);
        Ticket limitedTicket = new Ticket("Concert Hall C", 303);
        emptyTicket.setTicketPrice(50.0);
        fullTicket.setTicketPrice(100.0);
        limitedTicket.setTicketPrice(75.0);

    }
}
