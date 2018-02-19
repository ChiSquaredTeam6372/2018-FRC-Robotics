//DriveTrain.java				2/17/18

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
  Spark ClimberL;
  Spark ClimberR;
  Spark Extend;
  //Spark Extend1;
  Spark RollerL;
  Spark RollerR;
  // Spark RollerL1;
  // Spark RollerR1;

  public DriveTrain() {
    left1 = new Spark(Constants.TALON_L1_PORT);
    left2 = new Spark(Constants.TALON_L2_PORT);
    right1 = new Spark(Constants.TALON_R1_PORT);
    right2 = new Spark(Constants.TALON_R2_PORT);
    ClimberL = new Spark(Constants.TALON_CL_PORT);
    ClimberR = new Spark(Constants.TALON_CR_PORT);
    Extend = new Spark(Constants.TALON_EX_PORT);
    //Extend1 = new Spark(Constants.TALON_EX_PORT);
    RollerL = new Spark(Constants.TALON_RL_PORT);
    RollerR = new Spark(Constants.TALON_RR_PORT);
    //  RollerL1 = new Spark(Constants.TALON_RL1_PORT);
    //  RollerR1 = new Spark(Constants.TALON_RR1_PORT);

  }

  public void drive(double left, double right, double turn) {
    left1.set(left * Constants.MAX_DRIVE_SPEED + turn * Constants.MAX_TURN_SPEED);
    left2.set(left * Constants.MAX_DRIVE_SPEED + turn * Constants.MAX_TURN_SPEED);
    right1.set(-right * Constants.MAX_DRIVE_SPEED + turn * Constants.MAX_TURN_SPEED);
    right2.set(-right * Constants.MAX_DRIVE_SPEED + turn * Constants.MAX_TURN_SPEED);

  }

  public void drive1(double tre, double d, double e) {
    RollerL.set(-tre * Constants.MAX_DRIVE_SPEED_ROLLERL);
    RollerR.set(tre * Constants.MAX_DRIVE_SPEED_ROLLERR);
    Extend.set(e * Constants.MAX_DRIVE_SPEED_EXTEND);

  }

  public void drive2(double tres, double ds, double es) {
    RollerL.set(tres * Constants.MAX_DRIVE_SPEED_ROLLERL1);
    RollerR.set(-tres * Constants.MAX_DRIVE_SPEED_ROLLERR1);
    Extend.set(es * Constants.MAX_DRIVE_SPEED_EXTEND1);

  }

  public void drive3(double re, double de) {
    ClimberL.set(-re * Constants.MAX_DRIVE_SPEED_CLIMBERL);
    ClimberR.set(re * Constants.MAX_DRIVE_SPEED_CLIMBERR);
  }

  /* public void drive(double left, double right) {
  	 left1.set(left * Constants.MAX_DRIVE_SPEED);
  	    left2.set(left * Constants.MAX_DRIVE_SPEED);
  	    right1.set(-right * Constants.MAX_DRIVE_SPEED);
  	    right2.set(-right * Constants.MAX_DRIVE_SPEED);
  	
  	} */
}
