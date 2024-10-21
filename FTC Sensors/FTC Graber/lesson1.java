
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
      // Put run blocks here
      grabber.setPosition(0.25);
      driveLeft.setDirection(DcMotor.Direction.REVERSE);
      driveLeft.setPower(0.3);
      driveRight.setPower(0.9);
      sleep(1700);
      grabber.setPosition(0);
      driveLeft.setPower(-1);
      driveRight.setPower(-1);
      sleep(700);
      grabber.setPosition(1);
      sleep(160);
      driveLeft.setPower(-1);
      driveRight.setPower(-0.4);
      sleep(1500);
      driveLeft.setPower(-1);
      driveRight.setPower(0.3);
      sleep(700);
      driveLeft.setPower(-1);
      driveRight.setPower(-1);
      sleep(700);
      driveLeft.setPower(0);
      driveRight.setPower(0);
    }
    
}
