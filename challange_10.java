
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

public void goF(int time) {
    motorLeft.setPower(-1);
    motorRight.setPower(1);
    sleep(time);
    stop();
}

public void goB(int time) {
    motorLeft.setPower(1);
    motorRight.setPower(-1);
    sleep(time);
    stop();
}

public void leftT(int time){
    motorLeft.setPower(1);
    motorRight.setPower(1);
    sleep(time);
    stop();
}

public void rightT(int time){
    motorLeft.setPower(-1);
    motorRight.setPower(-1);
    sleep(time);
    stop();
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
      // Put initialization bl1ocks here
      waitForStart();
      goB(800);
      leftT(440);
      goF(500);
      rightT(440);
      goF(500);
      
      for (int i = 1; i <= 2; i++){
        leftT(440);
        goF(500);
      }
      
      // Put run blocks here
      while (opModeIsActive()) {
        // Put loop blocks here
      }
    }
    
}
