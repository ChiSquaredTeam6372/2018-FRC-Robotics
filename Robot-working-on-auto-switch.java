package org.usfirst.frc.team6372.robot;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.Timer;

public class Robot extends IterativeRobot {
	public static final Subsystem exampleSubsystem = null;
	DriveTrain driveTrain;
	XboxController joystick;
	Joystick joystickx;
	Timer timer = new Timer();
	DriverStation driverStation;

	//RobotDrive driveTrain1 = new RobotDrive(1, 2, 3, 4);
	//RobotDrive climber = new RobotDrive(6, 5);
	@Override
	public void robotInit() {
		driveTrain = new DriveTrain();
		joystick = new XboxController(Constants.JOYSTICK_PORT);
		joystickx = new Joystick(Constants.JOYSTICK_PORT);
		CameraServer.getInstance().startAutomaticCapture(Constants.CAMERA_SERVER).setResolution(Constants.RESOLUTION,
				Constants.RESOLUTION_1);
	}

	@Override
	public void autonomousInit() {
		timer.reset();
		timer.start();
	}

	//Robot.java    Fixed Autonomous - More control on timer
	//backwards and forwards on the if/else statement, 
	//autonomous timer with a stop in the middle
	@Override
	public void autonomousPeriodic() {

		/*if (timer.get() < 1.5) {
			driveTrain.drive(-0.53, -0.57, 0); // drive forwards half speed
		}

		else if (timer.get() == 1.5) {
			driveTrain.drive(0.0, 0.0, 0);
		}

		else if (timer.get() > 1.75 && timer.get() < 2.7) {
			driveTrain.drive(0.53, -0.57, 0);
		}else if (timer.get() > 2.8 && timer.get() < 6.5)
			{driveTrain.drive(-0.53, -0.57, 0);}
		else if (timer.get() > 6.6 && timer.get() < 7.5) {
			driveTrain.drive(-0.53, 0.57, 0);}
		else if (timer.get() > 7.6 && timer.get() < 12.65) {
			driveTrain.drive(-0.53, -0.57, 0);
		}
		else if (timer.get() > 12.8 && timer.get() < 13.7
				) {
			driveTrain.drive(-0.53, 0.57, 0);}
		else {
			driveTrain.drive(0.0, 0.0, 0);*/
	/*	if (timer.get() < 1.5) {
			driveTrain.drive(-0.53, -0.57, 0); // drive forwards half speed
		}

		else if (timer.get() == 1.5) {
			driveTrain.drive(0.0, 0.0, 0);
		}

		else if (timer.get() > 1.75 && timer.get() < 2.7) {
			driveTrain.drive(-0.53, 0.57, 0);
		}else if (timer.get() > 2.8 && timer.get() < 6.5)
			{driveTrain.drive(-0.53, -0.57, 0);}
		else if (timer.get() > 6.6 && timer.get() < 7.5) {
			driveTrain.drive(0.53, -0.57, 0);}
		else if (timer.get() > 7.6 && timer.get() < 12.65) {
			driveTrain.drive(-0.53, -0.57, 0);
		}
		else if (timer.get() > 12.8 && timer.get() < 13.7
				) {
			driveTrain.drive(0.53, -0.57, 0);}
		else {
			driveTrain.drive(0.0, 0.0, 0);
	
		}
		*/
		
		
		String gameData;
		gameData = DriverStation.getInstance().getGameSpecificMessage();
		
		if(gameData.charAt(0) == 'L')
		{
			if (timer.get() < 1.5) {
				driveTrain.drive(-0.53, -0.57, 0); // drive forwards half speed
			}

			else if (timer.get() == 1.5) {
				driveTrain.drive(0.0, 0.0, 0);
			}

			else if (timer.get() > 1.75 && timer.get() < 2.7) {
				driveTrain.drive(-0.53, 0.57, 0);
			}else if (timer.get() > 2.8 && timer.get() < 6.5)
				{driveTrain.drive(-0.53, -0.57, 0);}
			else if (timer.get() > 6.6 && timer.get() < 7.5) {
				driveTrain.drive(0.53, -0.57, 0);}
			else if (timer.get() > 7.6 && timer.get() < 12.65) {
				driveTrain.drive(-0.53, -0.57, 0);
			}
			else if (timer.get() > 12.8 && timer.get() < 13.7
					) {
				driveTrain.drive(0.53, -0.57, 0);}
			else {
				driveTrain.drive(0.0, 0.0, 0);
		
			}
			
		}else{
		
			if (timer.get() < 1.5) {
				driveTrain.drive(-0.53, -0.57, 0); // drive forwards half speed
			}

			else if (timer.get() == 1.5) {
				driveTrain.drive(0.0, 0.0, 0);
			}

			else if (timer.get() > 1.75 && timer.get() < 2.7) {
				driveTrain.drive(0.53, -0.57, 0);
			}else if (timer.get() > 2.8 && timer.get() < 6.5)
				{driveTrain.drive(-0.53, -0.57, 0);}
			else if (timer.get() > 6.6 && timer.get() < 7.5) {
				driveTrain.drive(-0.53, 0.57, 0);}
			else if (timer.get() > 7.6 && timer.get() < 12.65) {
				driveTrain.drive(-0.53, -0.57, 0);
			}
			else if (timer.get() > 12.8 && timer.get() < 13.7
					) {
				driveTrain.drive(0.53, -0.57, 0);}
			else {
				driveTrain.drive(0.0, 0.0, 0);
		
			}
		}
	}

	@Override
	public void teleopInit() {

	}

	@Override
	public void teleopPeriodic() {
		driveTrain.drive(joystickx.getRawAxis(Constants.JOYSTICK_LEFT_DRIVE_AXIS),
				joystickx.getRawAxis(Constants.JOYSTICK_RIGHT_DRIVE_AXIS),
				joystickx.getRawAxis(Constants.JOYSTICK_TURN_DRIVE_AXIS));
		/*driveTrain.drive(joystick.getRawAxis(Constants.JOYSTICK_RIGHT_CLIMB_AXIS),
				joystick.getRawAxis(Constants.JOYSTICK_LEFT_CLIMB_AXIS), 0);*/
	}

	@Override
	public void testInit() {

	}

	@Override
	public void testPeriodic() {

	}
}