package org.usfirst.frc.team6372.robot;

import edu.wpi.first.wpilibj.CameraServer;
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

  @Override
  public void autonomousPeriodic() {

    if (timer.get() < 2.5) {
      driveTrain.drive(-0.53, -0.57, 0); // drive forwards half speed
    } else {

      driveTrain.drive(0.0, 0.0, 0);
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
