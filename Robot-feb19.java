package org.usfirst.frc.team6372.robot;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Spark;

import edu.wpi.first.wpilibj.VictorSP;

public class DriveTrain {

  /*  Spark left1;
  Spark left2;
  Spark right1;
  Spark right2;
  Spark ClimberL;
  Spark ClimberR;
  Spark Extend;
  //Spark Extend1;
  Spark RollerL;
  Spark RollerR;   */
  // Spark RollerL1;
  // Spark RollerR1;
  VictorSP leftv1;
  VictorSP leftv2;
  VictorSP rightv1;
  VictorSP rightv2;
  VictorSP climbervL;
  VictorSP climbervR;
  VictorSP rollervL;
  VictorSP rollervR;
  VictorSP elevatorv;
  VictorSP extendv;

  public DriveTrain() {
    leftv1 = new VictorSP(Constants.TALON_L1_PORT);
    leftv2 = new VictorSP(Constants.TALON_L2_PORT);
    rightv1 = new VictorSP(Constants.TALON_R1_PORT);
    rightv2 = new VictorSP(Constants.TALON_R2_PORT);
    climbervL = new VictorSP(Constants.TALON_CL_PORT);
    climbervR = new VictorSP(Constants.TALON_CR_PORT);
    extendv = new VictorSP(Constants.TALON_EX_PORT);
    //extend1 = new Spark(Constants.TALON_EX_PORT);
    rollervL = new VictorSP(Constants.TALON_RL_PORT);
    rollervR = new VictorSP(Constants.TALON_RR_PORT);
    //  rollerL1 = new Spark(Constants.TALON_RL1_PORT);
    //  rollerR1 = new Spark(Constants.TALON_RR1_PORT);

  }

  public void drive(double left, double right, double turn) {
    leftv1.set(left * Constants.MAX_DRIVE_SPEED + turn * Constants.MAX_TURN_SPEED);
    leftv2.set(left * Constants.MAX_DRIVE_SPEED + turn * Constants.MAX_TURN_SPEED);
    rightv1.set(-right * Constants.MAX_DRIVE_SPEED + turn * Constants.MAX_TURN_SPEED);
    rightv2.set(-right * Constants.MAX_DRIVE_SPEED + turn * Constants.MAX_TURN_SPEED);

  }

  public void drive1(double tre, double d, double e) {
    rollervL.set(-tre * Constants.MAX_DRIVE_SPEED_ROLLERL);
    rollervR.set(tre * Constants.MAX_DRIVE_SPEED_ROLLERR);
    extendv.set(e * Constants.MAX_DRIVE_SPEED_EXTEND);

  }

  public void drive2(double tres, double ds, double es) {
    rollervL.set(tres * Constants.MAX_DRIVE_SPEED_ROLLERL1);
    rollervR.set(-tres * Constants.MAX_DRIVE_SPEED_ROLLERR1);
    extendv.set(es * Constants.MAX_DRIVE_SPEED_EXTEND1);

  }

  public void drive3(double re, double de) {
    climbervL.set(-re * Constants.MAX_DRIVE_SPEED_CLIMBERL);
    climbervR.set(re * Constants.MAX_DRIVE_SPEED_CLIMBERR);
  }

  /* public void drive(double left, double right) {
  	 left1.set(left * Constants.MAX_DRIVE_SPEED);
  	    left2.set(left * Constants.MAX_DRIVE_SPEED);
  	    right1.set(-right * Constants.MAX_DRIVE_SPEED);
  	    right2.set(-right * Constants.MAX_DRIVE_SPEED);
  	
  	} */
}
