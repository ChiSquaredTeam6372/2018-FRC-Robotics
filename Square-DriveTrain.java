//DriveTrain.java				New Robot Program


package org.usfirst.frc.team6372.robot;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.VictorSP;

public class DriveTrain {

  Spark Left1;
  Spark Left2;
  Spark Right1;
  Spark Right2;
  Spark Elevator;
  Spark ClimberL;
  Spark ClimberR;
  Spark RollerL;
  Spark RollerR;
  Spark Extend;

  public DriveTrain() {
    Left1 = new Spark(Constants.TALON_L1PORT);
    Left2 = new Spark(Constants.TALON_L2_PORT);
    Right1 = new Spark(Constants.TALON_R1_PORT);
    Right2 = new Spark(Constants.TALON_R2_PORT);
    Elevator = new Spark(Constants.TALON_E_PORT);
    ClimberL = new Spark(Constants.TALON_CL_PORT);
    ClimberR = new Spark(Constants.TALON_CR_PORT);
    RollerL = new Spark(Constants.TALON_RL_PORT);
    RollerR = new Spark(Constants.TALON_RR_PORT);
    Extend = new Spark(Constants.TALON_EX_PORT);
    
    
    
    
  }

  public void drive(double left, double right, double turn) {
    Left1.set(left * Constants.MAX_DRIVE_SPEED + turn * Constants.MAX_TURN_SPEED);
    Left2.set(left * Constants.MAX_DRIVE_SPEED + turn * Constants.MAX_TURN_SPEED);
    Right1.set(-right * Constants.MAX_DRIVE_SPEED + turn * Constants.MAX_TURN_SPEED);
    Right2.set(-right * Constants.MAX_DRIVE_SPEED + turn * Constants.MAX_TURN_SPEED);
    
    
    
  }

}
