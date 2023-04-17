package Graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGraphics {
    private JPanel rootPanel;
    private JPanel informationPanel;
    private JPanel optionsPanel;
    private JButton playButton;
    private JButton pauseButton;
    private JButton resetButton;
    private JTextArea informationPanelPlaceholderTextArea;
    private JPanel simulationHoldingPanel;
    private SimulationPanel simulationPanel;

    public MainGraphics() {

        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO implement the simulation play button
            }
        });
        pauseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO implement the simulation pause button
            }
        });
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO implement the simulation reset button
            }
        });
        // TODO consider working on adding resizing support
//        rootPanel.addComponentListener(new ComponentAdapter() {
//            @Override
//            public void componentResized(ComponentEvent e) {
//                super.componentResized(e);
//                double holdingWidth = simulationHoldingPanel.getWidth();
//                double holdingHeight = simulationHoldingPanel.getHeight();
//                double ratio = 1.33;
//                double r = holdingWidth / holdingHeight;
//                if (r < ratio) {
//                    simulationPanel.setSize((int) holdingWidth, (int) (holdingWidth / ratio));
//                } else if (r > ratio) {
//                    simulationPanel.setSize((int) (holdingHeight * ratio), (int) holdingHeight);
//                }
////                if (r > ratio) {
////                    simulationPanel.setSize((int) holdingWidth, (int) (holdingWidth / ratio));
////                } else if (r < ratio) {
////                    simulationPanel.setSize((int) (holdingHeight * ratio), (int) holdingHeight);
////                }
//                simulationPanel.repaint();
//                simulationHoldingPanel.repaint();
//                double simulationWidth = simulationPanel.getWidth();
//                double simulationHeight = simulationPanel.getHeight();
//                informationPanelPlaceholderTextArea.setText(simulationWidth + " x " + simulationHeight + "\n" + holdingWidth + " x " + holdingHeight + "\nr: " + (simulationWidth / simulationHeight));
//            }
//        });
    }

    public static void start() {
        JFrame frame = new JFrame("Graphics");
        frame.setContentPane(new MainGraphics().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }

    private void createUIComponents() {

        // Create simulationPanel object
        simulationPanel.setMinimumSize(new Dimension(1000, 750));
        simulationPanel.setPreferredSize(new Dimension(1000, 750));
        simulationPanel.setMaximumSize(new Dimension(1000, 750));
        simulationPanel.setBackground(Color.WHITE);
        simulationPanel.setEnabled(true);
        simulationHoldingPanel.add(simulationPanel);
    }
}
