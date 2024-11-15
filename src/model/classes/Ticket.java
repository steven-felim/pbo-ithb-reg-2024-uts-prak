package model.classes;

public class Ticket {
    private TicketType ticketType;
    private double ticketPrice;
    private String ticketNumber;

    public Ticket(TicketType ticketType, double ticketPrice, String ticketNumber) {
        this.ticketType = ticketType;
        this.ticketPrice = ticketPrice;
        this.ticketNumber = ticketNumber;
    }
}
