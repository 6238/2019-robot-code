package org.usfirst.frc.team6238.robot;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.CameraServer;
import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;
import edu.wpi.cscore.CvSink;
import edu.wpi.cscore.CvSource;
import edu.wpi.cscore.UsbCamera;

public class VisionControls implements robotController{

    private UsbCamera viewingCamera;
    private UsbCamera lineTraceCamera;

    public VisionControls(RobotProperties properties)
    {
        viewingCamera = properties.getViewingCamera();
        lineTraceCamera = properties.getLineTraceCamera();
    }
    public boolean performAction(RobotProperties properties) {

    }
}
