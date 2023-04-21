package GUI;

import Physics.Position;

import javax.swing.*;
import java.awt.*;

public class MainGUI {

    protected static JPanel rootPane;
    protected static SimulationPanel simulationPanel;
    protected static JPanel controlPanel;
    protected static JPanel informationPanel;


    public static void start() {
        JFrame frame = new JFrame("Main Window");

        // Create the root panel
        rootPane = new JPanel(new GridBagLayout());

        // Create simulation panel
        createSimulationPane();

        // Create control panel
        createControlPanel();

        // Create information panel
        createInformationPanel();

        rootPane.setVisible(true);

        frame.setContentPane(rootPane);
        frame.pack();

        frame.setVisible(true);
    }

    private static void createSimulationPane() {
        simulationPanel = new SimulationPanel();

        Dimension size = new Dimension(1500, 750);
        simulationPanel.setMinimumSize(size);
        simulationPanel.setPreferredSize(size);
        simulationPanel.setMaximumSize(size);

        simulationPanel.setBackground(Color.green);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridheight = 2;

        simulationPanel.setVisible(true);

        rootPane.add(simulationPanel, constraints);
    }

    private static void createControlPanel() {
        controlPanel = new JPanel();
        controlPanel.setLayout(new BoxLayout(controlPanel, BoxLayout.PAGE_AXIS));

        Dimension size = new Dimension(100, 100);
        controlPanel.setMinimumSize(size);
        controlPanel.setPreferredSize(size);
        controlPanel.setMaximumSize(size);

        controlPanel.setBackground(Color.BLUE);

        JButton playButton = new JButton("Play");
        playButton.addActionListener(e -> {
            // TODO playButton
            System.out.println("Play button pressed");
        });
        controlPanel.add(playButton);

        JButton pauseButton = new JButton("Pause");
        pauseButton.addActionListener(e -> {
            // TODO pauseButton
            System.out.println("Pause button pressed");
        });
        controlPanel.add(pauseButton);

        JButton resetButton = new JButton("Reset");
        resetButton.addActionListener(e -> {
            // TODO resetButton
            System.out.println("Reset button pressed");
        });
        controlPanel.add(resetButton);


        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 1;

        controlPanel.setVisible(true);

        rootPane.add(controlPanel, constraints);
    }

    private static void createInformationPanel() {
        informationPanel = new JPanel();

        informationPanel.setMinimumSize(new Dimension(100, 200));
        informationPanel.setPreferredSize(new Dimension(100, 150));
        informationPanel.setMaximumSize(new Dimension(200, 200));

        informationPanel.setBackground(Color.YELLOW);

        JTextArea text = new JTextArea();
        text.setEditable(false);

        text.setText("Hello World!");
        text.setVisible(true);

        informationPanel.add(text);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 0;

        informationPanel.setVisible(true);

        rootPane.add(informationPanel, constraints);
    }


    public static int[] positionToScreenCoordinates(Position position) {
        int[] returnValue = new int[2];
        // TODO make proportional conversion between Physics module coordinates and simulation window coordinates
//        returnValue[0] = (int) position.x();
//        returnValue[1] = (int) position.y();
        return returnValue;
    }
}
