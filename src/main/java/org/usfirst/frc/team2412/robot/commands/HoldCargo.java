package org.usfirst.frc.team2412.robot.commands;

public class HoldCargo extends CommandBase2412 {
	public HoldCargo() {
		addRequirements(inTakeCargo);
	}

	public void execute() {
		inTakeCargo.HoldCargo();
	}

	@Override
	public boolean isFinished() {
		return false;
	}
}
