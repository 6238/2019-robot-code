package org.usfirst.frc.team6238.robot;

import edu.wpi.first.wpilibj.*;

public class CargoMechanism implements RobotController
{
    private Solenoid cargoBay1;
    private Solenoid cargoBay2;
    private Joystick joystick;
    private boolean cargoTriggered;
    public CargoMechanism(RobotProperties properties)
    {
        cargoBay1 = properties.getCargoBay1();
        cargoBay2 = properties.getCargoBay2();
        joystick = properties.joystick;
    }
    public boolean performAction(RobotProperties properties)
    {
        cargoTriggered = joystick.getRawButtonPressed(0); //arbitrary value. update later
        if(cargoTriggered)
        {
            cargoBay1.set(true);
            cargoBay2.set(true);
        }
        else
        {
            cargoBay1.set(false);
            cargoBay2.set(false);
        }
    }
}
