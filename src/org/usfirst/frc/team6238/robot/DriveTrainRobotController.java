package org.usfirst.frc.team6238.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Solenoid;
import java.math.*;

/**
 * Created by abkhanna on 9/21/18.
 */
public class DriveTrainRobotController implements RobotController {
    public DriveTrainRobotController() {


    }


    @Override
    public boolean performAction(RobotProperties properties) {
        WPI_TalonSRX frontLeft = properties.getFrontLeft();
        WPI_TalonSRX frontRight = properties.getFrontRight();
        WPI_TalonSRX rearLeft = properties.getRearLeft();
        WPI_TalonSRX rearRight = properties.getRearRight();

        double joyX = properties.getJoystick().getX();
        double joyY = properties.getJoystick().getY();

        int threshold = 50;

        double diagSpeed = Math.sqrt(Math.pow(joyX, 2) + Math.pow(joyY, 2));
        double xSpeed = joyX * 1;
        double ySpeed = joyY * 1;

        if (joyX > threshold && joyY > threshold) {
            frontLeft.set(diagSpeed);
            frontRight.set(0);
            rearLeft.set(0);
            rearRight.set(diagSpeed);
        } else if (joyX < -1*threshold && joyY > threshold) {
            frontLeft.set(0);
            frontRight.set(diagSpeed);
            rearLeft.set(diagSpeed);
            rearRight.set(0);
        } else if (joyX > threshold && joyY < -1*threshold) {
            frontLeft.set(0);
            frontRight.set(-1*diagSpeed);
            rearLeft.set(-1*diagSpeed);
            rearRight.set(0);
        } else if (joyX < -1*threshold && joyY < -1*threshold) {
            frontLeft.set(-1*diagSpeed);
            frontRight.set(0);
            rearLeft.set(0);
            rearRight.set(-1*diagSpeed);
        } else if (joyX < threshold && joyX > -1*threshold && joyY > 0) {
            frontLeft.set(ySpeed);
            frontRight.set(ySpeed);
            rearLeft.set(ySpeed);
            rearRight.set(ySpeed);
        } else if (joyX < threshold && joyX > -1*threshold && joyY < 0) {
            frontLeft.set(-1*ySpeed);
            frontRight.set(-1*ySpeed);
            rearLeft.set(-1*ySpeed);
            rearRight.set(-1*ySpeed);
        } else if (joyY < threshold && joyY > -1*threshold && joyX > 0) {
            frontLeft.set(xSpeed);
            frontRight.set(-1*xSpeed);
            rearLeft.set(-1*xSpeed);
            rearRight.set(xSpeed);
        } else if (joyY < threshold && joyY > -1*threshold && joyX < 0) {
            frontLeft.set(-1*xSpeed);
            frontRight.set(xSpeed);
            rearLeft.set(xSpeed);
            rearRight.set(-1*xSpeed);
        }

        return true;
    }
}
