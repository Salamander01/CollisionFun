package GUI;

import javax.swing.*;
import java.awt.*;

abstract class GenericPanel extends JPanel {

    abstract protected void updatePanel();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
