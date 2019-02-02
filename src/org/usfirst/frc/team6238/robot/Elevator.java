/*First way: map 1 button to the elevator and the number of times you press the button controls the elevator
        first press: elevator moves up
        second press: elevator stops
        third press: elevator moves down
        fourth press: elevator stops

        Second way: map 2 buttons to the elevator
        while button 1 is pressed: elevator moves up
        while button 2 is pressed: elevator moves down
        release both buttons to stop elevator
        elevator does nothing if both buttons are pressed at the same time

        For both way, keep track of the position of the elevator, so you can tell it to stop moving if it has hit the top or the bottom.
        */
package org.usfirst.frc.team6238.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.Joystick;


class ElevatorControl implements RobotController
{

    private Joystick rightStick, leftStick;
    private boolean isDownElevatorButtonpressed;
    private boolean isUpElevatorButtonPressed;

    public ElevatorControl()
    {
        isDownElevatorButtonpressed = leftStick.getRawButton(6);
        isUpElevatorButtonPressed = rightStick.getRawButton(4);
    }

    @Override
    public boolean performAction(RobotProperties properties)
    {
        WPI_TalonSRX m_elevator1 = properties.getElevator1();
        WPI_TalonSRX m_elevator2 = properties.getElevator2();
        m_elevator1.set(0);
        m_elevator2.set(0);
        if (isUpElevatorButtonPressed && isDownElevatorButtonpressed)
        {
            m_elevator1.set(0);
            m_elevator2.set(0);
        } else if (isDownElevatorButtonpressed)
        {
            m_elevator1.set(-10);
            m_elevator2.set(-10);
        } else if (isUpElevatorButtonPressed)
        {
            m_elevator1.set(10);
            m_elevator2.set(10);
        } else
        {
            m_elevator1.set(0);
            m_elevator2.set(0);
        }
        return true;
    }
}
