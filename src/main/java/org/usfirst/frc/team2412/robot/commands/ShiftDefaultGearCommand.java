package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.RobotMap;

/**
 * Runs by default; shifts into high gear during the beginning of the match and into low gear if the rail deployment button has been pressed.
 */
public class ShiftDefaultGearCommand extends CommandBase2412 {
	
	public ShiftDefaultGearCommand() {
		addRequirements(driveShifters);
	}
	
	@Override
	public void execute() {
		if(RobotMap.CLIMB_MODE) {
			driveShifters.shiftLowGear();
		} else {
			driveShifters.shiftHighGear();
		}
	}
	
	@Override
	public boolean isFinished() {
		return true;
	}
}
