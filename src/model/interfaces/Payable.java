package model.interfaces;

public interface Payable {
    double ticketPrice();
    double performanceFee();
}

class RegularTicket implements Payable {
    public double ticketPrice() {
        return 150000;
    }

    public double performanceFee() {
        return 0;
    }
}

class VIPTicket implements Payable {
    public double ticketPrice() {
        return 350000;
    }

    public double performanceFee() {
        return 0;
    }
}

class InvitationTicket implements Payable {
    public double ticketPrice() {
        return 10000;
    }

    public double performanceFee() {
        return 0;
    }
}

class SoloArtist implements Payable {
    public double ticketPrice() {
        return 0;
    }

    public double performanceFee() {
        return 1000000;
    }
}

class Band implements Payable {
    public double ticketPrice() {
        return 0;
    }

    public double performanceFee() {
        return 2000000;
    }
}