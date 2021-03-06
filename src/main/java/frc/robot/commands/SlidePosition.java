package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

public class SlidePosition extends InstantCommand{

    private int pos = 0;
    public SlidePosition(int pos){
        this.pos=pos;
        requires(Robot.slideSystem);
    }

    @Override
    protected void execute() {
        Robot.slideSystem.setPosition(pos);
    }
}