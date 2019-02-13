package org.usfirst.frc.team2412.robot.commands;

public class LiftDown extends CommandBase {

	public LiftDown() {
		requires(liftSubsystem);
	}

	@Override
	protected boolean isFinished() {
		return true;
	}
	
	@Override
	protected void execute() {
		liftSubsystem.liftDown();
	}
}
