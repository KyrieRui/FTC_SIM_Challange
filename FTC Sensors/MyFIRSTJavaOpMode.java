
/***********************************************************************
*                                                                      *
* OnbotJava Editor is still : beta! Please inform us of any bugs       |
* on our discord channel! https://discord.gg/e7nVjMM                   *
* Only BLOCKS code is submitted when in Arena                          *
*                                                                      *
***********************************************************************/


public class MyFIRSTJavaOpMode extends LinearOpMode {
    DcMotor driveLeft;
    DcMotor driveRight;
    DcMotor sideways;
    Servo grabber;
    ColorSensor color1;
    DistanceSensor distance1;
    BNO055IMU imu;
    
    public void runF(int time){
        driveLeft.setPower(1);
        driveRight.setPower(1);
        sleep(time);
    }
    
    public void stop() {
        driveLeft.setPower(0);
        driveRight.setPower(0);
    }
    
@Override
    public void runOpMode() {
      driveLeft = hardwareMap.get(DcMotor.class, "driveLeft");
      driveRight = hardwareMap.get(DcMotor.class, "driveRight");
      sideways = hardwareMap.get(DcMotor.class, "sideways");
      grabber = hardwareMap.get(Servo.class, "grabber");
      color1 = hardwareMap.get(ColorSensor.class, "color1");
      distance1 = hardwareMap.get(DistanceSensor.class, "distance1");
      imu = hardwareMap.get(BNO055IMU.class, "imu");
      
      // Put initialization blocks here
      waitForStart();
      grabber.setPosition(0);
      driveLeft.setDirection(DcMotor.Direction.REVERSE);
      runF(500);
      stop();
      sleep(1700);
      // Put run blocks here
     

    }
    
}
