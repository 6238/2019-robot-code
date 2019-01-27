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

    public Joystick getJoystick() {
        return joystick;
    }

    public void setJoystick(Joystick joystick) {
        this.joystick = joystick;
    }

    public WPI_TalonSRX getFrontLeft() {
        return frontLeft;
    }

    public void setFrontLeft(WPI_TalonSRX frontLeft) {
        this.frontLeft = frontLeft;
    }

    public WPI_TalonSRX getFrontRight() {
        return frontRight;
    }

    public void setFrontRight(WPI_TalonSRX frontRight) {
        this.frontRight = frontRight;
    }

    public WPI_TalonSRX getRearLeft() {
        return rearLeft;
    }

    public void setRearLeft(WPI_TalonSRX rearLeft) {
        this.rearLeft = rearLeft;
    }

    public WPI_TalonSRX getRearRight() {
        return rearRight;
    }

    public void setRearRight(WPI_TalonSRX rearRight) {
        this.rearRight = rearRight;
    }
}



