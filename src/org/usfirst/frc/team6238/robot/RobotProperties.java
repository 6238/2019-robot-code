package org.usfirst.frc.team6238.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class RobotProperties {
    private Joystick joystick;

    private WPI_TalonSRX frontLeft;
    private WPI_TalonSRX frontRight;
    private WPI_TalonSRX rearLeft;
    private WPI_TalonSRX rearRight;

    private WPI_TalonSRX elevator1;
    private WPI_TalonSRX elevator2;

    private WPI_TalonSRX mechanism;

    public RobotProperties() {
        joystick = new Joystick(0);

        frontLeft = new WPI_TalonSRX(33);
        frontRight = new WPI_TalonSRX(34);
        rearLeft = new WPI_TalonSRX(35);
        rearRight = new WPI_TalonSRX(36);

        elevator1 = new WPI_TalonSRX(37);
        elevator2 = new WPI_TalonSRX(38);

        mechanism = new WPI_TalonSRX(39);
    }
    // 4 wheel motors - cims talon srx
    // 2 dual gearboxes - 2 775s each
    // one spare 775
    /*

    */
}



