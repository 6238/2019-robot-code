package org.usfirst.frc.team6238.robot;

public interface RobotController {
    /**
     * Perform action will get called for each controller in the list of controllers every time Periodic is called.
     * You should make sure that the action only happens in the controller settings you care about.
     * E.g if you only want your action to be enabled when a button is pressed, make sure to check for the button.
     * @param properties
     * @return true if your action is performed, and false otherwise.
     */
    boolean performAction(RobotProperties properties);
}