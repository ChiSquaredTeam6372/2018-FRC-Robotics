package org.usfirst.frc.team6372.robot;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.VictorSP;

public class DriveTrain {

  Spark left1;
  Spark left2;
  Spark right1;
  Spark right2;
  VictorSP Climberl;
  VictorSP Climberr;

  public DriveTrain() {
    left1 = new Spark(Constants.TALON_L1PORT);
    left2 = new Spark(Constants.TALON_L2_PORT);
    right1 = new Spark(Constants.TALON_R1_PORT);
    right2 = new Spark(Constants.TALON_R2_PORT);
  }

  public void drive(double left, double right, double turn) {
    left1.set(left * Constants.MAX_DRIVE_SPEED + turn * Constants.MAX_TURN_SPEED);
    left2.set(left * Constants.MAX_DRIVE_SPEED + turn * Constants.MAX_TURN_SPEED);
    right1.set(-right * Constants.MAX_DRIVE_SPEED + turn * Constants.MAX_TURN_SPEED);
    right2.set(-right * Constants.MAX_DRIVE_SPEED + turn * Constants.MAX_TURN_SPEED);
    /*Climberr.set(-right * Constants.DRIVE_SPEEDR);
    Climberl.set(left * Constants.DRIVE_SPEEDL);*/
  }

}
