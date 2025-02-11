package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AnalogInput;

public class SwerveModule 
{
    
    private final CANSparkMax driveMotor; 
    /* Changes the speed and the direction of the motor ablitly to stop*/

    private final CANSparkMax turningMotor;
    /*Used for turnning the robot*/

    private final CANEncoder driveEncoder;  //To track how far the wheel moved
    /*Encoders are devices that measure the rotation of a motor shaft
     (or wheel) and provide feedback, like how many rotations the motor has made or how far a wheel has turned.
     */

    private final CANEncoder turnningEncoders; // To track the turning motor's rotation.
    /* that measures the rotation of a motor like the sterring and the turnning*/

    private final AnalogInput absoluteEncoder; // absolute position feedback about the rotation of a part ( the exact positoin of where it is) 
    /* it is used to calculate the position and the angle of the robot */
    //exact position of a rotating part by reading analog voltage values from the encoder. 
    
    private final boolean absoluteEncoderReversed; // To determine if it is reversed

    private final double absoluteEncoderOffsetRad; //offset allows the system to correct the starting position of the encoder
    // it cooperates with absoluteEncoder, so the abosluteEncoder determines the roation of that time, and then this aboutsule encoder fixes it. 


    public SwerveModule(int driveMotorId, int turningMotorId, boolean driveMotorReversed, boolean turningMotorReversed, int absolute )

}