package GUI;

import Physics.Position;

import java.util.ArrayList;

public class MainGUI {

    SimulationPanel simulationPanel;
    ControlPanel controlPanel;


    public static void start() {

    }


    public static int[] positionToScreenCoordinates(Position position) {
        int[] returnValue = new int[2];
        // TODO make proportional conversion between Physics module coordinates and simulation window coordinates
//        returnValue[0] = (int) position.x();
//        returnValue[1] = (int) position.y();
        return returnValue;
    }
}
