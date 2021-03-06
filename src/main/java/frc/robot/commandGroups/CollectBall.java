package frc.robot.commandGroups;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.RobotMap;
import frc.robot.RobotMap.RollerSpeed;
import frc.robot.commands.*;

public class CollectBall extends CommandGroup{
    public CollectBall(){
       addSequential(new WaitElevatorPosition(RobotMap.elevatorClearBallCollector, true));
       //
       addSequential(new SlideBack());
       //
       addSequential(new WaitArm2Position(RobotMap.arm2DS1,true));
       //
       addSequential(new RollersSpeed(RollerSpeed.FORWARD));
       //
       addSequential(new MultiArm(RobotMap.arm1DS1,RobotMap.arm2SD2,true,false));
       //
       addSequential(new WaitElevatorPosition(RobotMap.elevatorPos1, false));
       //
       addParallel(new LoadBall());
       //
       addSequential(new CollectorButtonAction());
       //
       addSequential(new TransferBall());
    }
}