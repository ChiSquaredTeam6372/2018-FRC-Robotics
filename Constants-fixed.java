Constants.java               fixed program working file 3

package org.usfirst.frc.team6372.robot;

import edu.wpi.first.wpilibj.Spark;

public class Constants {
  public static final int TALON_L1_PORT = 1;
  public static final int TALON_L2_PORT = 2;
  public static final int TALON_R1_PORT = 3;
  public static final int TALON_R2_PORT = 4;
  public static final int TALON_CL_PORT = 8;
  public static final int TALON_CR_PORT = 9;
  public static final int TALON_EX_PORT = 7;
  public static final int TALON_RL_PORT = 5;
  public static final int TALON_RR_PORT = 6;


  public static final int JOYSTICK_PORT = 0;
  public static final int AJOYSTICK_PORT = 1;
  public static final double MAX_DRIVE_SPEED = .5;
  public static final double MAX_TURN_SPEED = .35;
  public static final double DRIVE_SPEEDR = .25;
  public static final double DRIVE_SPEEDL = .25;
  
  public static final double MAX_DRIVE_SPEED_ROLLERL = .05;
  public static final double MAX_DRIVE_SPEED_ROLLERR = .05;
  public static final double DRIVE_SPEED_ROLLERL = .05;
  public static final double DRIVE_SPEED_ROLLERR = .05;
  public static final double MAX_DRIVE_SPEED_EXTEND = .05;
  public static final double DRIVE_SPEED_EXEND = .05;

  public static final int JOYSTICK_LEFT_DRIVE_AXIS = 1;
  public static final int JOYSTICK_RIGHT_DRIVE_AXIS = 1;
  public static final int JOYSTICK_TURN_DRIVE_AXIS = 4;
  
  public static final int JOYSTICK_ROLLERL_DRIVE_AXIS = 3;
  public static final int JOYSTICK_ROLLERR_DRIVE_AXIS = 3;
  public static final int JOYSTICK_EXTEND_DRIVE_AXIS = 5;
  

  public static final int CAMERA_SERVER = 1;
  public static final int RESOLUTION = 360;
  public static final int RESOLUTION_1 = 480;
}
