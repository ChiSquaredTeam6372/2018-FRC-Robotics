package org.usfirst.frc.team6372.robot;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
//import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.Spark;

//@SuppressWarnings("deprecation")
public class Robot extends IterativeRobot {
  public static final Subsystem exampleSubsystem = null;
  DriveTrain driveTrain = new DriveTrain();
  DriverStation driverStation;
  XboxController xbc = new XboxController(0);
  Joystick joystick = new Joystick(4);
  Timer timer = new Timer();
  //DifferentialDrive drive = new DifferentialDrive(1,2,3,4);
  Spark left;
  Spark right;
  Spark left1;
  Spark right1;
  VictorSP rollerl;
  VictorSP rollerr;

  @Override
  public void robotInit() {
    CameraServer.getInstance().startAutomaticCapture();
  }

  //This function is run once each time the robot enters autonomous mode

  @Override
  public void autonomousInit() {
    timer.reset();
    timer.start();

  }

  /* Robot.java    Fixed Autonomous - More control on timer, backwards and forwards on the if/else statement, autonomous timer with a stop in the middle
   * 
   * 
   * This function is called periodically during autonomous
   *  */
  @Override
  public void autonomousPeriodic() {

    String gameData;
    gameData = DriverStation.getInstance().getGameSpecificMessage();
    if (gameData.length() > 0) {

      if (gameData.charAt(0) == 'L') {

        if (timer.get() < 1.5) {
          driveTrain.drive(-0.57, -0.61, 0); // drive forwards half speed
        } else if (timer.get() == 1.5) {
          driveTrain.drive(0.0, 0.0, 0);
        } else if (timer.get() > 1.75 && timer.get() < 2.5) {
          driveTrain.drive(0.57, -0.61, 0);
        } else if (timer.get() > 2.8 && timer.get() < 6.5) {
          driveTrain.drive(-0.57, -0.61, 0);
        } else if (timer.get() > 6.6 && timer.get() < 7.3) {
          driveTrain.drive(-0.57, 0.61, 0);
        } else if (timer.get() > 7.6 && timer.get() < 12.45) {
          driveTrain.drive(-0.57, -0.61, 0);
        } else if (timer.get() > 12.8 && timer.get() < 13.55) {
          driveTrain.drive(-0.57, 0.61, 0);
        } else {
          driveTrain.drive(0.0, 0.0, 0);
        }
      } else {

        if (timer.get() < 1.5) {
          driveTrain.drive(-0.53, -0.57, 0);
        } else if (timer.get() == 1.5) {
          driveTrain.drive(0.0, 0.0, 0);
        } else if (timer.get() > 1.75 && timer.get() < 2.5) {
          driveTrain.drive(-0.57, 0.61, 0);
        } else if (timer.get() > 2.8 && timer.get() < 6.5) {
          driveTrain.drive(-0.57, -0.61, 0);
        } else if (timer.get() > 6.6 && timer.get() < 7.3) {
          driveTrain.drive(0.57, -0.61, 0);
        } else if (timer.get() > 7.6 && timer.get() < 12.45) {
          driveTrain.drive(-0.57, -0.61, 0);
        } else if (timer.get() > 12.8 && timer.get() < 13.55) {
          driveTrain.drive(0.57, -0.61, 0);
        } else {
          driveTrain.drive(0.0, 0.0, 0);
        }

      }
    }
  }

  /**This function is called once each time the robot enters tele-operated mode.
   * 
   * 
   */
  @Override
  public void teleopInit() {

  }

  /** This function is called periodically during operator control
   * 
   */
  @Override
  public void teleopPeriodic() {

    driveTrain.drive(xbc.getRawAxis(Constants.XBC_LEFT_DRIVE_AXIS), xbc.getRawAxis(Constants.XBC_RIGHT_DRIVE_AXIS),
        xbc.getRawAxis(Constants.XBC_TURN_DRIVE_AXIS));

    driveTrain.drive1(xbc.getRawAxis(Constants.XBC_ROLLERL_DRIVE_AXIS),
        xbc.getRawAxis(Constants.XBC_ROLLERR_DRIVE_AXIS), xbc.getRawAxis(Constants.XBC_EXTEND_DRIVE_AXIS));

    driveTrain.drive2(xbc.getRawAxis(Constants.XBC_ROLLERL1_DRIVE_AXIS),
        xbc.getRawAxis(Constants.XBC_ROLLERR1_DRIVE_AXIS), xbc.getRawAxis(Constants.XBC_EXTEND1_DRIVE_AXIS));

    driveTrain.drive3(joystick.getRawAxis(Constants.JOYSTICK_CLIMBERL_DRIVE_AXIS),
        joystick.getRawAxis(Constants.JOYSTICK_CLIMBERR_DRIVE_AXIS));

  }

  /*	driveTrain.drive4(xbc.getRawButton(Constants.XBC_ROLLERL_BUTTON),
  	xbc.getRawButton(Constants.XBC_ROLLERR_BUTTON),
  	xbc.getRawButton(Constants.XBC_EXTEND_BUTTON));
  }
  
  
  /** This function is called periodically during test mode
   * 
   */
  @Override
  public void testInit() {

  }

  @Override
  public void testPeriodic() {

  }
}
