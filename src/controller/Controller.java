package controller;
import model.classes.Band;
import model.classes.SoloArtist;
import model.classes.Ticket;

import model.enums.TicketType;
import view.View;

public class Controller {
    public void pilihMenu(int pilih) {
        View view = new View();
        switch (pilih) {
            case 1:
                String pilih1 = view.input("1. Solo Artist\n2. Band\n3. Regular Ticket\n4. VIP Ticket\n5. Invitation Ticket\n6. Vendor\nPilih menu");
                calculatePayment(pilih1);
                break;
            case 2:
                generateRevenueReport();
                break;
            default:
                return;
        }
    }

    public void calculatePayment(String pilih1) {
        switch (pilih1) {
            case "1":
                SoloArtist artist;
                double total = 0;
                total += artist.getPerformanceFee();
            case "2":
                Band band;
                double total = 0;
                total += band.getPerformanceFee();
            case "3":
                if (TicketType.REGULAR) {
                    Ticket ticket = new Ticket();

                }

        }
    }

    public void generateRevenueReport() {

    }
}
