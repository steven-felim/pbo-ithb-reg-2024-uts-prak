import controller.Controller;
import javax.swing.*;
import model.classes.*;
import model.enums.Genre;

import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        SoloArtist artist1 = new SoloArtist("John Doe", Genre.POP, 5000, "Sarah");
        SoloArtist artist2 = new SoloArtist("Jane Smith", Genre.ROCK, 6000, "Alex");
        SoloArtist artist3 = new SoloArtist("Michael Johnson", Genre.JAZZ_AND_BLUES, 7000, "Emily");
        SoloArtist artist4 = new SoloArtist("Lily Evans", Genre.CLASSICAL, 8000, "John");

        public ArrayList<SoloArtist> soloArtists = new ArrayList<>();
        soloArtists.add(artist1);
        soloArtists.add(artist2);
        soloArtists.add(artist3);
        soloArtists.add(artist4);

        Band band1 = new Band("The Rockers", Genre.ROCK, 3000, 5);
        Band band2 = new Band("Jazz Fusion", Genre.JAZZ_AND_BLUES, 4000, 7);
        Band band3 = new Band("The Popstars", Genre.POP, 2500, 4);
        Band band4 = new Band("Classical Legends", Genre.CLASSICAL, 3500, 6);

        ArrayList<Band> bands = new ArrayList<>();
        bands.add(band1);
        bands.add(band2);
        bands.add(band3);
        bands.add(band4);

        Controller controller = new Controller();
        while(true) {
            int pilih = parseInt(JOptionPane.showInputDialog("1. Calculate Payment\n2. Generate Revenue Report\nPilih menu"));
            controller.pilihMenu(pilih);
        }
    }
}