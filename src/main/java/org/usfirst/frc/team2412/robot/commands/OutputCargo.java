package org.usfirst.frc.team2412.robot.commands;

public class OutputCargo extends CommandBase2412 {
	public OutputCargo() {
		requires(inTakeCargo);
	}

	public void execute() {
		inTakeCargo.OutputCargo();
	}

	@Override
	protected boolean isFinished() {
		return true;
	}
}
