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

public class VisionControl implements RobotController{

    private UsbCamera viewingCamera;
    private UsbCamera lineTraceCamera;

    public VisionControl(RobotProperties properties)
    {
        viewingCamera = properties.getViewingCamera(0);
        lineTraceCamera = properties.getLineTraceCamera(1);
        //viewingCamera.setResolution(640, 480);
        //CvSource outputStream = CameraServer.getInstance().putVideo("Blur", 640, 480);
    }
    public void viewingCameraControl()
    {
        CameraServer.getInstance().startAutomaticCapture();
    }
    public boolean performAction(RobotProperties properties)
    {
        CvSink cvSink = CameraServer.getInstance().getVideo();
    }
}
