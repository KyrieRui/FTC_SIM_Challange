
/***********************************************************************
*                                                                      *
* OnbotJava Editor is still : beta! Please inform us of any bugs       |
* on our discord channel! https://discord.gg/e7nVjMM                   *
* Only BLOCKS code is submitted when in Arena                          *
*                                                                      *
***********************************************************************/


public class MyFIRSTJavaOpMode extends LinearOpMode {
    DcMotor motorLeft;
    DcMotor motorRight;
    DcMotor frontLeft;
    DcMotor frontRight;
    ColorSensor color1;
    DistanceSensor distance1;
    BNO055IMU imu;
    
public void stop() {
    motorLeft.setPower(0);
    motorRight.setPower(0);
}

public void left_90(){
    motorLeft.setPower(-1);
    motorRight.setPower(1);
    sleep(440);
    stop();
}

public void right_90(){
    motorLeft.setPower(1);
    motorRight.setPower(-1);
    sleep(440);
    stop();
}

public void goF(){
    motorLeft.setPower(0.5);
    motorRight.setPower(0.5);
}


@Override
    public void runOpMode() {
      motorLeft = hardwareMap.get(DcMotor.class, "motorLeft");
      motorRight = hardwareMap.get(DcMotor.class, "motorRight");
      frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
      frontRight = hardwareMap.get(DcMotor.class, "frontRight");
      color1 = hardwareMap.get(ColorSensor.class, "color1");
      distance1 = hardwareMap.get(DistanceSensor.class, "distance1");
      imu = hardwareMap.get(BNO055IMU.class, "imu");
      // Put initialization blocks here
      waitForStart();
      // Put run blocks here
      motorLeft.setDirection(DcMotor.Direction.REVERSE);
      goF();
      while (opModeIsActive()) {
        // Put loop blocks here
        telemetry.addData("Red Value", (color1.red()));
        telemetry.update();
        
        if (color1.red() == 255){
            left_90();
            break;
        }
      }
      goF();
      sleep(1440);
      right_90();
      goF();
      sleep(1440);
      right_90();
      goF();
      sleep(2540);
      left_90();
      goF();
    }
    
}
