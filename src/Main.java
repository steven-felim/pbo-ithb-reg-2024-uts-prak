import controller.Controller;
import javax.swing.*;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        while(true) {
            int pilih = parseInt(JOptionPane.showInputDialog("1. Calculate Payment\n2. Generate Revenue Report\nPilih menu"));
            controller.pilihMenu(pilih);
        }
    }
}