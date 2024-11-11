
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

    public void stop() {
        driveLeft.setPower(0);
        driveRight.setPower(0);
    }

    public void leftT(int time){
        driveLeft.setPower(-0.6);
        driveRight.setPower(0.6);
        sleep(time);
        stop();
    }

    public void rightT(int time){
        driveLeft.setPower(0.6);
        driveRight.setPower(-0.6);
        sleep(time);
        stop();
    }

    public void goF(int time) {
        driveLeft.setPower(0.5);
        driveRight.setPower(0.5);
        sleep(time);
        stop();
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
      // Put run blocks here
      grabber.setPosition(0.25);
      driveLeft.setDirection(DcMotor.Direction.REVERSE);
      
      goF(400);
      rightT(280);
      
    }
    
}
