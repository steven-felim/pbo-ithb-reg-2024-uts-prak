package model.interfaces;

public interface Payable {
}

enum TicketType implements Payable {
    REGULAR {
        double ticketPrice = 150000;
    },
    VIP {
        double ticketPrice = 350000;
    },
    INVITATION {
        double ticketPrice = 10000;
    }
}

class SoloArtist implements Payable {
    double performanceFee=  1000000;
}

class Band implements Payable {
    double performanceFee = 2000000;
}

class Vendor implements Payable {
    double vendorFee =  1500000;
}