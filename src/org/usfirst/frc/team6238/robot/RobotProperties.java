package org.usfirst.frc.team6238.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.*;

public class RobotProperties {
    JoystickController joystick;

    private WPI_TalonSRX frontLeft;
    private WPI_TalonSRX frontRight;
    private WPI_TalonSRX rearLeft;
    private WPI_TalonSRX rearRight;

    private WPI_TalonSRX elevator1;
    private WPI_TalonSRX elevator2;


    private Solenoid cargoBay1;
    private Solenoid cargoBay2;


    private UsbCamera viewingCamera;
    private UsbCamera lineTraceCamera;

    private WPI_TalonSRX mechanism;

    public RobotProperties() {
        joystick.port = 0;

        frontLeft = new WPI_TalonSRX(33);
        frontRight = new WPI_TalonSRX(34);
        rearLeft = new WPI_TalonSRX(35);
        rearRight = new WPI_TalonSRX(36);

        elevator1 = new WPI_TalonSRX(37);
        elevator2 = new WPI_TalonSRX(38);

        cargoBay1 = new Solenoid(0);
        cargoBay2 = new Solenoid(1);

        viewingCamera = CameraServer.getInstance().startAutomaticCapture();
        lineTraceCamera = CameraServer.getInstance().startAutomaticCapture();

        mechanism = new WPI_TalonSRX(39);
    }
    // 4 wheel motors - cims talon srx
    // 2 dual gearboxes - 2 775s each
    // one spare 775
    /*

    */

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

    public WPI_TalonSRX getElevator1() {
        return elevator1;
    }

    public void setElevator1(WPI_TalonSRX elevator1) {
        this.elevator1 = elevator1;
    }

    public WPI_TalonSRX getElevator2() {
        return elevator2;
    }

    public void setElevator2(WPI_TalonSRX elevator2) {
        this.elevator2 = elevator2;
    }

    public Solenoid getCargoBay1() { return this.cargoBay1; }

    public Solenoid getCargoBay2() { return this.cargoBay2; }

    public UsbCamera getViewingCamera() { return this.viewingCamera; }

    public UsbCamera getLineTraceCamera() { return this.lineTraceCamera; }


}