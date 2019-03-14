package frc.robot.commandGroups;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.commands.*;

public class TransferBall extends CommandGroup{
    public TransferBall(){
       addParallel(new WaitArm1Position(19800, true));
       addParallel(new RollersSpeed(-1));
       addSequential(new BallReady());
       addSequential(new GripperButtonAction());
       addSequential(new RetractCollector());
    }
}