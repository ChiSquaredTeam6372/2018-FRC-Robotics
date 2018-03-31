package org.usfirst.frc.team6372.robot;

//import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.XboxController;

public class DriveTrain {

  XboxController xbc = new XboxController(0);

  Spark left1 = new Spark(Constants.TALON_L1_PORT);
  Spark left2 = new Spark(Constants.TALON_L2_PORT);
  Spark right1 = new Spark(Constants.TALON_R1_PORT);
  Spark right2 = new Spark(Constants.TALON_R2_PORT);
  Spark ClimberL = new Spark(Constants.TALON_CL_PORT);
  Spark ClimberR = new Spark(Constants.TALON_CR_PORT);
  Spark Extend = new Spark(Constants.TALON_EX_PORT);
  VictorSP RollerL = new VictorSP(Constants.TALON_RL_PORT);
  VictorSP RollerR = new VictorSP(Constants.TALON_RR_PORT);

  public void drive(double left, double right, double turn) {
    left1.set(left * Constants.MAX_DRIVE_SPEED + turn * Constants.MAX_TURN_SPEED);
    left2.set(left * Constants.MAX_DRIVE_SPEED + turn * Constants.MAX_TURN_SPEED);
    right1.set(-right * Constants.MAX_DRIVE_SPEED + turn * Constants.MAX_TURN_SPEED);
    right2.set(-right * Constants.MAX_DRIVE_SPEED + turn * Constants.MAX_TURN_SPEED);

  }

  //tre is variable for speed, -tre is backwards
  public void drive1(double tre, double d, double e) {
    RollerL.set(-tre * Constants.MAX_DRIVE_SPEED_ROLLERL);
    RollerR.set(tre * Constants.MAX_DRIVE_SPEED_ROLLERR);
    Extend.set(e * Constants.MAX_DRIVE_SPEED_EXTEND);

  }

  public void drive2(double tres, double ds, double es) {
    RollerL.set(-tres * Constants.MAX_DRIVE_SPEED_ROLLERL1);
    RollerR.set(tres * Constants.MAX_DRIVE_SPEED_ROLLERR1);
    Extend.set(es * Constants.MAX_DRIVE_SPEED_EXTEND1);

  }

  public void drive3(double re, double de) {
    ClimberL.set(-re * Constants.MAX_DRIVE_SPEED_CLIMBERL);
    ClimberR.set(re * Constants.MAX_DRIVE_SPEED_CLIMBERR);
  }

  /* public void drive4(double b, double c, double d) {
  	    RollerL.set(b * Constants.MAX_DRIVE_SPEED_ROLLERL1);
  	   RollerR.set(-b * Constants.MAX_DRIVE_SPEED_ROLLERR1);
  	    Extend.set(d * Constants.MAX_DRIVE_SPEED_EXTEND1);
   
   }*/

  /*public void drive4(double rawButton, boolean rawButton2, boolean rawButton3) {
  	// TODO Auto-generated method stub
  	//boolean buttonValue;
  	/*buttonValue = xbc.getRawButton(1);
  //	RollerL.set(rawButton * Constants.MAX_DRIVE_SPEED_ROLLERL1);
    RollerR.set(rawButton * Constants.MAX_DRIVE_SPEED_ROLLERR1);
    //Extend.set(rawButton3 * Constants.MAX_DRIVE_SPEED_EXTEND1);
  	
  }*/
}
