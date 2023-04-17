package Graphics;

import javax.swing.*;
import java.awt.*;


public class SimulationPanel extends JPanel {

    SimulationPanel() {

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillOval(1000, 750, 10, 10);
    }

}
