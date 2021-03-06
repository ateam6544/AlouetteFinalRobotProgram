/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap2 {
 
    //CAN PINS
    public static final int BACK_LEFT_MOTOR = 2;
    public static final int BACK_RIGHT_MOTOR = 1;
    public static final int FRONT_LEFT_MOTOR = 4;
    public static final int FRONT_RIGHT_MOTOR = 12;
    public static final int ELEVATOR_MOTOR = 5;
    public static final int GRIPPER_MOTOR = 9;
    public static final int BALL_COLLECTOR_MOTOR_ONE = 6;
    public static final int BALL_COLLECTOR_MOTOR_TWO = 7;
    public static final int ROLLER_MOTOR_LEFT = 11;
    public static final int ROLLER_MOTOR_RIGHT = 3;
    public static final int TURRET_SLIDE_MOTOR = 8;
    public static final int TURRET_TURN_MOTOR = 10;
    public static final int COMPRESSOR = 0;

    //Digital Pins
    public static final int ELAVATOR_TOP_LIMIT = 0;
    public static final int ELAVATOR_BOTTOM_LIMIT = 1;
    public static final int TURRET_RIGHT_LIMIT = 4;
    public static final int TURRET_LEFT_LIMIT = 6;
    public static final int TURRET_SLIDE_FORWARD = 8;
    public static final int TURRET_SLIDE_BACKWARD = 9;
    public static final int ARM_BUTTON_STOP = 5;
    public static final int GRIPPER_BUTTON_STOP = 3;

    //Analog/Relay Pins
    public static final int COLLECTOR_POTENTIOMETER_ONE = 0;
    public static final int COLLECTOR_POTENTIOMETER_TWO = 1;
    public static final int TURRET_SLIDE_POTENTIOMETER = 2;

    //PCM Pins
    public static final int[] LOWER_GRIPPER_SOLENOID = {1,0};
    public static final int[] UPPER_GRIPPER_SOLENOID = {6,7};
    public static final int[] BALL_COLLECTOR_SOLENOID = {5,4};
    public static final int LED_RING_ONE = 2;

    //Motor Speeds
    public static double rollersSpeed = 0.4, slideSpeed = 1.0, ballGripperSpeed = 1.0;
    public static int driveSpeed = 1;

    //Encoder and Potentiometer Values System Positions
    public static int elevatorPos1 = 2, elevatorHatch2 = 41948, elevatorHumanPos = 32000,
    elevatorPos2 = 41948, elevatorPos3 = 90000, turretMax = 20000, turretMin = 100, arm1Max = 622, arm1Min=208;

    //BallCollector Deploy Positions 
    public static int elevatorLoadPos1 = 18000;
    public static int arm2Pos1 = 219, arm1Pos1 = 29800;

    //Ball Collector Retract Positions

    //Ball Collector Transfer Positions

    //Other
    public static int CM_CONVERSION = 360;

    //Non-Drive Controller - 3D Joystick Logitech
    public static int elevatorTop = 8, elevatorBottom = 12, elevatorMiddle = 10, deployIntake = 9, turretLeft = 5, 
    turretRight = 6, retractIntake = 7;
    /*
    Controls: Drive, AutoModeButton, elevatorLevel1, elevatorLevel2, 
    elevatorLevel3, openGripper, 
    closeGripper, gripperIntakeSpeedForward, 
    gripperIntakeSpeedReverse, deployIntakeStartRollers,
    retractGripperStopRollers, 
    */
    //Drive Controller
    public static int changeSpeed = 8, deliverPayload = 1, deployCollector = 2, retractCollector = 3, climb = 5, driveMode = 6;
    //Joystick Controller 
    public static int closeGripper = 2, recieveBall = 3, recieveHatch = 4, elevatorLevel1 = 11, elevatorLevel2 = 9, elevatorLevel3 = 7,
    elevatorHumanRecieve = 10;

    //Joystick Ports
    public static int driveController = 0, joystickController = 1;
    //Driver Selection Enumeration
    private static Driver _currentDriver = null;

    //States
    public static int turretValue = 0;//Weather to make the center button go left or right
    
    /**
   * Driver Name enum
   * Select which drivers controls to change
   */
    public enum Driver{
        STANDARD,
        ADAMT,
        JUSTIND,
    }

    /** 
   * Controller Enum
   * What controller to change
   */
    public enum Controller{
        DRIVE,
        FUNCTIONS
    }

    /**
   * Change the mapped button values for each controller
   *
   * <p>Changes the set values for what button on the controller controls which robot action
   *
   * @param Driver enum and the Controller enum
   */
    public static void selectDriver(Driver driver,Controller controller){
        if(controller == Controller.DRIVE){
            if(driver == Driver.ADAMT){
                _currentDriver = Driver.ADAMT;
                changeSpeed = 8; deliverPayload = 1; deployCollector = 2; retractCollector = 3; climb = 5; driveMode = 6;
                closeGripper = 2; recieveBall = 3; recieveHatch = 4; elevatorLevel1 = 11; elevatorLevel2 = 9; 
                elevatorLevel3 = 7;elevatorHumanRecieve = 10;
            }
            if(driver == Driver.JUSTIND){
                _currentDriver = Driver.JUSTIND;
                changeSpeed = 8; deliverPayload = 1; deployCollector = 2; retractCollector = 3; climb = 5; driveMode = 6;
                closeGripper = 2; recieveBall = 3; recieveHatch = 4; elevatorLevel1 = 11; elevatorLevel2 = 9; 
                elevatorLevel3 = 7;elevatorHumanRecieve = 10;
            }
        }else{
            if(driver == Driver.ADAMT){
                _currentDriver = Driver.ADAMT;
                changeSpeed = 8; deliverPayload = 1; deployCollector = 2; retractCollector = 3; climb = 5; driveMode = 6;
                closeGripper = 2; recieveBall = 3; recieveHatch = 4; elevatorLevel1 = 11; elevatorLevel2 = 9; 
                elevatorLevel3 = 7;elevatorHumanRecieve = 10;
            }
            if(driver == Driver.JUSTIND){
                _currentDriver = Driver.JUSTIND;
                changeSpeed = 8; deliverPayload = 1; deployCollector = 2; retractCollector = 3; climb = 5; driveMode = 6;
                closeGripper = 2; recieveBall = 3; recieveHatch = 4; elevatorLevel1 = 11; elevatorLevel2 = 9; 
                elevatorLevel3 = 7;elevatorHumanRecieve = 10;
            }
        }
    }

    public static Driver getCurrentDrive() {
        return _currentDriver;
    }
}
/*
 * XBOX BUTTON MAPPING FOR DRIVER STATION AS FOLLOWS
 * Button 1 = A
 * Button 2 = B
 * Button 3 = X OR small left wheel button up
 * Button 4 = Y
 * Button 5 = Left Bumper
 * Button 6 = Right Bumper OR small right wheel down
 * Button 7 = Select / Menu Button
 * Button 8 = Start / Enter Button
 * Button 9 = Click in Left Analog Stick OR small left wheel down
 * Button 10 = Click in Right Analog Stick
 * 
 * Axis 0 = Left stick left + right
 * Axis 1 = Left stick up + down
 * Axis 2 = Left trigger
 * Axis 3 = Right trigger
 * Axis 4 = Right stick left + right
 * Axis 5 = Right stick up + down
 * 
 * POV = D-Pad
 * POV LEFT = small right wheel up
 */
