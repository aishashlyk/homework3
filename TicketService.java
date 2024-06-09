package org.example;

import java.util.ArrayList;
import java.util.List;

class Ticket {
    private String id;
    private String concertHall;
    private int eventCode;
    private long time;
    private boolean isPromo;
    private char stadiumSector;
    private double maxAllowedBackpackWeight;
    private double price;

    public Ticket() {
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
        this.price = price;
    }

    public Ticket(String concertHall, int eventCode) {
        this.concertHall = concertHall;
        this.eventCode = eventCode;
        this.time = System.currentTimeMillis();
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

    public double getPrice() {
        return price;
    }

    public void setTicketPrice(double v) {
        this.price = v;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id='" + id + '\'' +
                ", concertHall='" + concertHall + '\'' +
                ", eventCode=" + eventCode +
                ", time=" + time +
                ", isPromo=" + isPromo +
                ", stadiumSector=" + stadiumSector +
                ", maxAllowedBackpackWeight=" + maxAllowedBackpackWeight +
                ", price=" + price +
                '}';
    }
}

public class TicketService {
    private List<Ticket> tickets;

    public TicketService() {
        tickets = new ArrayList<>();
        createTickets();
    }

    private void createTickets() {
        tickets.add(new Ticket("T001", "Concert Hall A", 101, false, 'A', 1.5, 50.0));
        tickets.add(new Ticket("T002", "Concert Hall B", 102, true, 'B', 2.0, 60.0));
        tickets.add(new Ticket("T003", "Concert Hall C", 103, false, 'C', 1.0, 70.0));
        tickets.add(new Ticket("T004", "Concert Hall D", 104, true, 'D', 1.8, 80.0));
        tickets.add(new Ticket("T005", "Concert Hall E", 105, false, 'E', 2.5, 90.0));
        tickets.add(new Ticket("T006", "Concert Hall F", 106, true, 'F', 3.0, 100.0));
        tickets.add(new Ticket("T007", "Concert Hall G", 107, false, 'G', 2.2, 110.0));
        tickets.add(new Ticket("T008", "Concert Hall H", 108, true, 'H', 1.7, 120.0));
        tickets.add(new Ticket("T009", "Concert Hall I", 109, false, 'I', 2.8, 130.0));
        tickets.add(new Ticket("T010", "Concert Hall J", 110, true, 'J', 1.9, 140.0));
    }

    public Ticket getTicketById(String id) {
        for (Ticket ticket : tickets) {
            if (ticket.getId().equals(id)) {
                return ticket;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        TicketService ticketService = new TicketService();

        Ticket emptyTicket = new Ticket();
        Ticket fullTicket = new Ticket("T123", "Concert Hall B", 202, true, 'B', 2.5, 0.0);
        Ticket limitedTicket = new Ticket("Concert Hall C", 303);

        emptyTicket.setTicketPrice(50.0);
        fullTicket.setTicketPrice(100.0);
        limitedTicket.setTicketPrice(75.0);

        Ticket retrievedTicket = ticketService.getTicketById("T005");
        if (retrievedTicket != null) {
            System.out.println(retrievedTicket);
        } else {
            System.out.println("Ticket not found!");
        }
    }
}
